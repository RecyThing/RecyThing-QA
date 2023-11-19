package Intro;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    protected String url = "https://api.recything.my.id/register";
    @Step("I set POST Register Endpoint")
    public String setRegisterEndpoint() {
        return url;
    }

    @Step("I send POST Register HTTP request")
    public void sendPostRegisterHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("fullname", "persondong");
        requestBody.put("email", "someoness@gmail.com");
        requestBody.put("password", "owaahjrgjhhhhh");
        requestBody.put("confirm_password", "owaahjrgjhhhhh");

        SerenityRest.given().contentType("application/json").body(requestBody.toJSONString()).post(setRegisterEndpoint());
    }

    @Step("I receive POST Register valid HTTP response code 200")
    public void receivePostRegisterHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(201));
    }


    @Step("I set Get Register Endpoint With Wrong HTTP Request")
    public String setWrongRegisterEndpoint(){
        return url;
    }

    @Step("I send Get User Information Endpoint Request2")
    public void sendGetRegisterHttpRequest2() {
        SerenityRest.given()
                .when()
                .get(setWrongRegisterEndpoint());
    }

    @Step("I receive Get Register valid HTTP response code 405")
    public void receiveWrongPostRegisterHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set POST Register Endpoint with Wrong Body")
    public String setRegisterApiEndpoint() {
        return url;
    }

    @Step("I send POST Register HTTP request3")
    public void sendRegisterHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("fullname", "persondong");
        requestBody.put("email", "someone@mail.com");

        SerenityRest.given()
                .when()
                .post(setRegisterApiEndpoint());

    }

    @Step("I receive Register valid HTTP response code 400")
    public void validateRegisterHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
