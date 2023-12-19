package HomeandInfo;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Achievement {
    protected String url = "https://api.recything.my.id/achievements";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set Get Achievement Endpoint With Correct Data")
    public String setGetAchievements(){
        return url;
    }
    @Step("I send Get Achievement request")
    public void sendGetAchievements() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetAchievements());
    }

    @Step("I receive Get Achievement valid HTTP response code 200")
    public void receiveGETAchievementsResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST Achievement Endpoint with Wrong HTTP Request")
    public String setAchievementsEndpoint() {
        return url;
    }

    @Step("I send POST Achievement HTTP request2")
    public void sendPostAchievementsHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setAchievementsEndpoint());
    }

    @Step("I receive POST Achievement valid HTTP response code 405")
    public void receivePostAchievementsHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Achievement Endpoint With Wrong URL")
    public String setWrongAchievementsURL(){
        return url + "mas";
    }
    @Step("I send Get Achievement HTTP request3")
    public void sendGetAchievementsHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongAchievementsURL());
    }

    @Step("I receive Get Achievement valid HTTP response code 404")
    public void receiveWrongGetAchievementsResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
