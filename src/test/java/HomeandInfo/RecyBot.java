package HomeandInfo;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class RecyBot {
    protected String url = "https://recybot---recything-api-niyyqhuhua-uc.a.run.app/recybot";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Post RecyBot Endpoint With Correct Data")
    public String setRecyBotEndpoint() {
        return url;
    }

    @Step("I send Post RecyBot request")
    public void sendPostRecyBotHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("question", "berikan 3 contoh sampah organik");

        SerenityRest.given()
                .header("Authorization",
                        token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setRecyBotEndpoint());
    }

    @Step("I receive Post RecyBot valid HTTP response code 200")
    public void receivePostRecyBotHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get RecyBot Endpoint with Wrong HTTP Request")
    public String setWrongRecyBotEndpoint(){
        return url;
    }

    @Step("I send Get RecyBot HTTP request2")
    public void sendGetLoginHttpRequest2() {
        SerenityRest.given()
                .header("Authorization",
                        token)
                .when()
                .get(setWrongRecyBotEndpoint());
    }

    @Step("I receive Get RecyBot valid HTTP response code 405")
    public void receiveWrongPostRecyBotHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set Post RecyBot Endpoint With Wrong URL")
    public String setRecyBotApiEndpoint() {
        return url;
    }

    @Step("I send Post RecyBot HTTP request3")
    public void sendRecyBotHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "recythinguser@gmail.com");
        requestBody.put("passwowrd", "recything00345r");

        SerenityRest.given()
                .header("Authorization",
                        token)
                .when()
                .post(setRecyBotApiEndpoint());

    }

    @Step("I receive Post RecyBot valid HTTP response code 400")
    public void validateRecyBotHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
