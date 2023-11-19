package Intro;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ForgotPassword {
    protected String url = "https://api.recything.my.id/forgot-password";
    @Step("I set POST Reset Password Endpoint")
    public String setResetPasswordEndpoint() {
        return url;
    }

    @Step("I send POST Reset Password request")
    public void sendPostResetPasswordHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given().contentType("application/json").body(requestBody.toJSONString()).post(setResetPasswordEndpoint());
    }

    @Step("I receive POST Reset Password HTTP response code 200")
    public void receivePostResetPasswordHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set Get Reset Password with Wrong HTTP Request")
    public String setWrongResetPasswordHTTP(){
        return url;
    }

    @Step("I send Get Reset Password HTTP request2")
    public void sendGetResetPasswordHttpRequest2() {
        SerenityRest.given()
                .when()
                .get(setWrongResetPasswordHTTP());
    }

    @Step("I receive Get Reset Password valid HTTP response code 405")
    public void receiveWrongPostResetPasswordHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set POST Reset Password with Wrong Body")
    public String setResetPasswordApiEndpoint() {
        return url;
    }

    @Step("I send POST Reset Password HTTP request3")
    public void sendResetPasswordHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "recythingusergmail.com");


        SerenityRest.given()
                .when()
                .post(setResetPasswordApiEndpoint());

    }

    @Step("I receive POST Reset Password valid HTTP response code 400")
    public void validateResetPasswordHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
