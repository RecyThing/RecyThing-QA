package UserReport;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewUserHistory {
    protected String url = "https://api.recything.my.id/reports/history";
    @Step("I set Get View User History Endpoint With Correct Data")
    public String setGetViewUserHistory(){
        return url;
    }
    @Step("I send Get View User History request")
    public void sendGetViewUserProfile() {
        SerenityRest.given()
                .header("Authorization",
                        "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzODUyODksImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.Ocs1g1vooXaQoScUzh538mAZVeAyCXWwpoIe17L2kQ0")
                .when()
                .get(setGetViewUserHistory());
    }

    @Step("I receive Get View User History response code 200")
    public void receiveWrongGETtViewUserHistoryResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST View User History Endpoint with Wrong HTTP Request")
    public String setViewUserHistoryEndpoint() {
        return url;
    }

    @Step("I send POST View User History HTTP request2")
    public void sendPostViewUserHistoryHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzODUyODksImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.Ocs1g1vooXaQoScUzh538mAZVeAyCXWwpoIe17L2kQ0")
                .contentType("application/json").body(requestBody.toJSONString()).post(setViewUserHistoryEndpoint());
    }

    @Step("I receive POST View User History valid HTTP response code 404")
    public void receivePostViewUserHistoryHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get View User History Endpoint With Wrong URL")
    public String setWrongViewUserHistoryHTTP(){
        return url + "mas";
    }
    @Step("I send Get View User History HTTP request3")
    public void sendGetViewUserHistoryHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzODUyODksImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.Ocs1g1vooXaQoScUzh538mAZVeAyCXWwpoIe17L2kQ0")
                .when()
                .get(setWrongViewUserHistoryHTTP());
    }

    @Step("I receive Get View User History valid HTTP response code 404")
    public void receiveWrongPostViewUserHistoryHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
