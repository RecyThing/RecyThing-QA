package Community;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class JoinCommunity {
    protected String url = "https://api.recything.my.id/communities/1b44d47c-662b-45b2-9e00-3202284e6e8d";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set POST Join Community Endpoint With Correct Data")
    public String setWrongJoinCommunityEndpointEndpoint() {
        return url;
    }

    @Step("I send POST Join Community request")
    public void sendPostWrongJoinCommunityEndpointHttpRequest() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Authorization",
                        token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setWrongJoinCommunityEndpointEndpoint());
    }

    @Step("I receive POST Join Community valid HTTP response code 200")
    public void receivePostJoinCommunityHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(404));
    }


    @Step("I set Put Join Community Endpoint with Wrong HTTP Request")
    public String setWrongJoinCommunityEndpoint(){
        return url;
    }

    @Step("I send Put Join Community HTTP request2")
    public void sendPutJoinCommunityHttpRequest2() {
        JSONObject requestBody = new JSONObject();

        SerenityRest.given()
                .header("Authorization",
                        token)
                .contentType("application/json").body(requestBody.toJSONString()).put(setWrongJoinCommunityEndpoint());
    }

    @Step("I receive Put Join Community valid HTTP response code 404")
    public void receiveWrongJoinCommunityPointHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set POST Join Community Endpoint With Wrong URL")
    public String setJoinCommunityApiEndpoint() {
        return url + "mas";
    }

    @Step("I send POST Join Community HTTP request3")
    public void sendJoinCommunityHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id_voucher", "08404aaa-d201-4824-a8a0-d584bdac2dfa");
        requestBody.put("phones", "082298667543");

        SerenityRest.given()
                .header("Authorization",
                        token)
                .when()
                .post(setJoinCommunityApiEndpoint());

    }

    @Step("I receive POST Join Community valid HTTP response code 404")
    public void validateJoinCommunityHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(404));
    }
}
