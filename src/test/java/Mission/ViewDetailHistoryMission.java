package Mission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewDetailHistoryMission {
    protected String url = "https://api.recything.my.id/missions/history/7fcfb1b6-ebaf-4681-a8d4-7895bff1d888";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Get See History Mission Endpoint With Correct Data")
    public String setGetSeeHistoryMission(){
        return url;
    }
    @Step("I send Get See History Mission request")
    public void sendGetSeeHistoryMission() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetSeeHistoryMission());
    }

    @Step("I receive Get See History Mission valid HTTP response code 200")
    public void receiveWrongGETSeeHistoryMissionResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set Post See History Mission Endpoint with Wrong HTTP Request")
    public String setSeeHistoryMissionEndpoint() {
        return url;
    }

    @Step("I send Post See History Mission HTTP request2")
    public void sendPostSeeHistoryMissionHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setSeeHistoryMissionEndpoint());
    }

    @Step("I receive Post See History Mission valid HTTP response code 400")
    public void receivePostSeeHistoryMissionHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get See History Mission Endpoint With Wrong Body")
    public String setWrongSeeHistoryMissonURL(){
        return url + "mas";
    }
    @Step("I send Get See History Mission HTTP request3")
    public void sendGetSeeHistoryMissionHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongSeeHistoryMissonURL());
    }

    @Step("I receive Get See History Mission valid HTTP response code 404")
    public void receiveWrongGetSeeHistoryMissionResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
