package UserReport;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewUserHistoryByID {
    protected String url = "https://api.recything.my.id/reports/history/TS-DA0CD46CB8104B2";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Get View User History By ID Endpoint With Correct Data")
    public String setGetViewUserHistoryByID(){
        return url;
    }
    @Step("I send Get View User History By ID request")
    public void sendGetViewUserHistoryByID() {
        SerenityRest.given()
                .header("Authorization",
                        token)
                .when()
                .get(setGetViewUserHistoryByID());
    }

    @Step("I receive Get View User History By ID response code 200")
    public void receiveWrongGETtViewUserHistoryByIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST View User History Endpoint By ID with Wrong HTTP Request")
    public String setViewUserHistoryByIDEndpoint() {
        return url;
    }

    @Step("I send POST View User History By ID HTTP request2")
    public void sendPostViewUserHistoryByIDHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setViewUserHistoryByIDEndpoint());
    }

    @Step("I receive POST View User History By ID valid HTTP response code 404")
    public void receivePostViewUserHistoryByIDHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get View User History By ID Endpoint With Wrong URL")
    public String setWrongViewUserHistoryByIDHTTP(){
        return url + "mas";
    }
    @Step("I send Get View User History By ID HTTP request3")
    public void sendGetViewUserHistoryByIDHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongViewUserHistoryByIDHTTP());
    }

    @Step("I receive Get View User History By ID valid HTTP response code 404")
    public void receiveWrongPostViewUserHistoryByIDHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
