package UserPointAndVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewClaimedDaily {
    protected String url = "https://api.recything.my.id/users/point/claimed";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set Get Claimed Point Endpoint With Correct Data")
    public String setGetSeeClaimedPoint(){
        return url;
    }
    @Step("I send Get Claimed Point request")
    public void sendGetSeeClaimedPoint() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetSeeClaimedPoint());
    }

    @Step("I receive Get Claimed Point valid HTTP response code 200")
    public void receiveWrongGETClaimedPointResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST Claimed Point Endpoint with Wrong HTTP Request")
    public String setSeeClaimedPointEndpoint() {
        return url;
    }

    @Step("I send POST Claimed Point HTTP request2")
    public void sendPostSeeClaimedPointHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setSeeClaimedPointEndpoint());
    }

    @Step("I receive POST Claimed Point valid HTTP response code 405")
    public void receivePostSeeClaimedPointHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Claimed Point Endpoint With Wrong URL")
    public String setWrongSeeClaimedPointURL(){
        return url + "mas";
    }
    @Step("I send Get Claimed Point HTTP request3")
    public void sendGetSeeClaimedPointHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongSeeClaimedPointURL());
    }

    @Step("I receive Get Claimed Point valid HTTP response code 404")
    public void receiveWrongGetClaimedPointResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
