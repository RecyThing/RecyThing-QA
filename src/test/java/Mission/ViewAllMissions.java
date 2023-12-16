package Mission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewAllMissions {
    protected String url = "https://api.recything.my.id/missions";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Get See Mission Endpoint With Correct Data")
    public String setGetSeeMission(){
        return url;
    }
    @Step("I send Get See Mission request")
    public void sendGetSeeMission() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetSeeMission());
    }

    @Step("I receive Get See Mission valid HTTP response code 200")
    public void receiveWrongGETSeeMissionResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Post See Mission Endpoint with Wrong HTTP Request")
    public String setSeeMissionEndpoint() {
        return url;
    }

    @Step("I send Post See Mission HTTP request2")
    public void sendPostSeeMissionHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setSeeMissionEndpoint());
    }

    @Step("I receive Post See Mission valid HTTP response code 400")
    public void receivePostSeeMissionHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set Get See Mission Endpoint With Wrong Body")
    public String setWrongSeeMissionURL(){
        return url + "mas";
    }
    @Step("I send Get See Mission HTTP request3")
    public void sendGetSeeMissionHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongSeeMissionURL());
    }

    @Step("I receive Get See Mission valid HTTP response code 404")
    public void receiveWrongGetSeeMissionResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
