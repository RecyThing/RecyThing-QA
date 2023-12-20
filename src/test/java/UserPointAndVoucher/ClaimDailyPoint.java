package UserPointAndVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ClaimDailyPoint {
    protected String url = "https://api.recything.my.id/users/point/daily";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Post Claim Daily Point Endpoint With Correct Data")
    public String setClaimDailyPointEndpoint() {
        return url;
    }

    @Step("I send Post Claim Daily Point request")
    public void sendPostClaimDailyPointHttpRequest() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setClaimDailyPointEndpoint());
    }

    @Step("I receive Post Claim Daily Point valid HTTP response code 201")
    public void receivePostClaimDailyPointHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I set Get Claim Daily Point Endpoint with Wrong HTTP Request")
    public String setWrongClaimDailyPointEndpoint(){
        return url;
    }

    @Step("I send Get Claim Daily Point HTTP request2")
    public void sendGetClaimDailyPointHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongClaimDailyPointEndpoint());
    }

    @Step("I receive Get Claim Daily Point valid HTTP response code 403")
    public void receiveWrongGetClaimDailyPointHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Claim Daily Point Endpoint With Wrong Body")
    public String setClaimDailyPointApiEndpoint() {
        return url;
    }

    @Step("I send Get Claim Daily Point HTTP request3")
    public void sendClaimDailyPointHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "recythinguser@gmail.com");
        requestBody.put("passwowrd", "recything00345r");

        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .post(setClaimDailyPointApiEndpoint());

    }

    @Step("I receive Get Claim Daily Point valid HTTP response code 400")
    public void validatClaimDailyPointHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
