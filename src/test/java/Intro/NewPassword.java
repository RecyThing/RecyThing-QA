package Intro;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class NewPassword {

//    protected String url = "https://api.recything.my.id/new-password";
//    @Step("I set Patch Make New Password Endpoint")
//    public String setNewPasswordEndpoint1() {
//        return url;
//    }
//
//    @Step("I send Patch Make New Password request")
//    public void sendPatchNewPasswordHttpRequest() {
//        JSONObject requestBody = new JSONObject();
//
//        requestBody.put("email", "recythinguser@gmail.com");
//        requestBody.put("password", "adminganteng");
//        requestBody.put("confirm_password", "adminganteng");
//
//
//        SerenityRest.given().contentType("application/json").body(requestBody.toJSONString()).patch(setNewPasswordEndpoint1());
//    }
//
//    @Step("I receive Patch Make New Password HTTP response code 200")
//    public void receivePatchMakeNewPasswordHttpResponseCode200() {
//        restAssuredThat(response -> response.statusCode(200));
//    }
//
//    @Step("I set Post Make New Password with Wrong HTTP Request")
//    public String setNewPasswordEndpoint() {
//        return url;
//    }
//
//    @Step("I send Post Make New Password HTTP request2")
//    public void sendPostNewPasswordHttpRequest2() {
//        JSONObject requestBody = new JSONObject();
//
//        requestBody.put("email", "recythinguser@gmail.com");
//        requestBody.put("password", "adminganteng");
//        requestBody.put("confirm_password", "adminganteng");
//
//
//        SerenityRest.given().contentType("application/json").body(requestBody.toJSONString()).post(setNewPasswordEndpoint());
//    }
//
//    @Step("I receive Post Make New Password valid HTTP response code 405")
//    public void receivePostNewPasswordHttpResponseCode405() {
//        restAssuredThat(response -> response.statusCode(405));
//    }
//
//
//
//    @Step("I set Patch Make New Password with Wrong Body")
//    public String setNewPasswordApiEndpoint3() {
//        return url;
//    }
//
//    @Step("I send Patch Make New Password HTTP request3")
//    public void sendNewPasswordHttpRequest3() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("password", "adminganteng");
//        requestBody.put("confirm_password", "adminganteng");
//
//
//        SerenityRest.given()
//                .when()
//                .patch(setNewPasswordApiEndpoint3());
//
//    }
//
//    @Step("I receive Patch Make New Password valid HTTP response code 400")
//    public void validateNewPasswordHttpResponseCode400() {
//
//        restAssuredThat(response -> response.statusCode(400));
//    }
}
