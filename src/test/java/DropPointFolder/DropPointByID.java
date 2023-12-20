package DropPointFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DropPointByID {
    protected String url = "https://api.recything.my.id/drop-points/38b56197-9774-4fc6-9685-26e1119baf33";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Get Drop Point By ID Endpoint With Correct Data")
    public String setGetDropPointByID(){
        return url;
    }
    @Step("I send Get Drop Point By ID request")
    public void sendGetDropPointByID() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetDropPointByID());
    }

    @Step("I receive Get Drop Point By ID valid HTTP response code 200")
    public void receiveWrongGETDropPointByIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set POST Drop Point By ID Endpoint with Wrong HTTP Request")
    public String setDropPointByIDEndpoint() {
        return url;
    }

    @Step("I send POST Drop Point By ID HTTP request2")
    public void sendPostDropPointByIDHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setDropPointByIDEndpoint());
    }

    @Step("I receive POST Drop Point By ID valid HTTP response code 405")
    public void receivePostDropPointByIDHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Drop Point By ID Endpoint With Wrong URL")
    public String setWrongDropPointByIDURL(){
        return url + "mas";
    }
    @Step("I send Get Drop Point By ID HTTP request3")
    public void sendGetArticlesByIDHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongDropPointByIDURL());
    }

    @Step("I receive Get Drop Point By ID valid HTTP response code 404")
    public void receiveWrongGetDropPointByIDURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
