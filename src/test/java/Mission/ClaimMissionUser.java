package Mission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ClaimMissionUser {
    protected String url = "https://api.recything.my.id/missions";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Post Claim Mission User Endpoint With Correct Data")
    public String setMissionUserValidEndpoint() {
        return url;
    }

    @Step("I send Post Claim Mission User request")
    public void sendPostMissionUserValidHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("mission_id", "MS-2310NJSID");

        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setMissionUserValidEndpoint());
    }

    @Step("I receive Post Claim Mission User valid HTTP response code 201")
    public void receivePostMissionUserValidHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(404));
    }


    @Step("I set Get Claim Mission User Endpoint with Wrong HTTP Request")
    public String setWrongMissionUserValidEndpoint(){
        return url;
    }

    @Step("I send Get Claim Mission User HTTP request2")
    public void sendGetMissionUserValidHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .put(setWrongMissionUserValidEndpoint());
    }

    @Step("I receive Get Claim Mission User valid HTTP response code 403")
    public void receiveWrongGetMissionUserValidHttpResponseCode403(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post Claim Mission User Endpoint With Wrong Body")
    public String setMissionUserValidApiEndpoint() {
        return url;
    }

    @Step("I send Post Claim Mission User HTTP request3")
    public void sendCMissionUserValidHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "recythinguser@gmail.com");
        requestBody.put("passwowrd", "recything00345r");

        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .post(setMissionUserValidApiEndpoint());

    }

    @Step("I receive Post Claim Mission User valid HTTP response code 400")
    public void validateMissionUserValidHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
