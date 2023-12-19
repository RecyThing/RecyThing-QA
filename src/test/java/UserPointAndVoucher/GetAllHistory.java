package UserPointAndVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllHistory {
    protected String url = "https://api.recything.my.id/users/point/history";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set Get All History Endpoint With Correct Data")
    public String setGetSeeAllHistory(){
        return url;
    }
    @Step("I send Get All History request")
    public void sendGetSeeAllHistory() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetSeeAllHistory());
    }

    @Step("I receive Get All History valid HTTP response code 200")
    public void receiveWrongGETAllHistoryResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST All History Endpoint with Wrong HTTP Request")
    public String setSeeAllHistoryEndpoint() {
        return url;
    }

    @Step("I send POST All History HTTP request2")
    public void sendPostSeeAllHistoryHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setSeeAllHistoryEndpoint());
    }

    @Step("I receive POST All History valid HTTP response code 405")
    public void receivePostSeeAllHistoryHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get All History Endpoint With Wrong URL")
    public String setWrongSeeAllHistoryURL(){
        return url + "mas";
    }
    @Step("I send Get All History HTTP request3")
    public void sendGetSeeAllHistoryHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongSeeAllHistoryURL());
    }

    @Step("I receive Get All History valid HTTP response code 404")
    public void receiveWrongGetAllHistoryResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
