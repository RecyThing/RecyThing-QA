package DropPointFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DropPoint {
    protected String url = "https://api.recything.my.id/drop-points";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set Get Drop Point Endpoint With Correct Data")
    public String setGetDropPoint(){
        return url;
    }
    @Step("I send Get Drop Point request")
    public void sendGetDropPoint() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetDropPoint());
    }

    @Step("I receive Get Drop Point valid HTTP response code 200")
    public void receiveWrongGETDropPointResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST Drop Point Endpoint with Wrong HTTP Request")
    public String setDropPointEndpoint() {
        return url;
    }

    @Step("I send POST Drop Point HTTP request2")
    public void sendPostDropPointHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setDropPointEndpoint());
    }

    @Step("I receive POST Drop Point valid HTTP response code 405")
    public void receivePostDropPointHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Drop Point Endpoint With Wrong URL")
    public String setWrongDropPointURL(){
        return url + "mas";
    }
    @Step("I send Get Drop Point HTTP request3")
    public void sendGetDropPointHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongDropPointURL());
    }

    @Step("I receive Get Drop Point valid HTTP response code 404")
    public void receiveWrongGetDropPointURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
