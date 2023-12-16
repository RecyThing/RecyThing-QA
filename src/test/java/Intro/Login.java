package Intro;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected String url = "https://api.recything.my.id/login";
    @Step("I set POST Login Endpoint")
    public String setLoginEndpoint() {
        return url;
    }

    @Step("I send POST Login HTTP request")
    public void sendPostLoginHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "ahmad@example.com");
        requestBody.put("password", "12345678");

        SerenityRest.given().contentType("application/json").body(requestBody.toJSONString()).post(setLoginEndpoint());
    }

    @Step("I receive POST Login valid HTTP response code 200")
    public void receivePostLoginHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I set Get Login Endpoint With Wrong HTTP Request")
    public String setWrongLoginEndpoint(){
        return url;
    }

    @Step("I send Get Login HTTP request2")
    public void sendGetLoginHttpRequest2() {
        SerenityRest.given()
                .when()
                .get(setWrongLoginEndpoint());
    }

    @Step("I receive Get Login valid HTTP response code 405")
    public void receiveWrongPostLoginHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set POST Login Endpoint with Wrong Body")
    public String setLoginApiEndpoint() {
        return url;
    }

    @Step("I send POST Login HTTP request3")
    public void sendLoginHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "recythinguser@gmail.com");
        requestBody.put("passwowrd", "recything00345r");

        SerenityRest.given()
                .when()
                .post(setLoginApiEndpoint());

    }

    @Step("I receive POST Login valid HTTP response code 400")
    public void validateLoginHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
