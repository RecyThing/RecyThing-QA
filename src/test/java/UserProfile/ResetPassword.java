package UserProfile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ResetPassword {
    protected String url = "https://api.recything.my.id/users/profile/reset-password";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Patch Reset Password On Profile Endpoint With Correct Data")
    public String setRPOPPEndpoint1() {
        return url;
    }

    @Step("I send Patch Reset Password On Profile request")
    public void sendPatchRPOPPHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("password", "123456789");
        requestBody.put("new_password", "12345678");
        requestBody.put("confirm_password", "12345678");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).patch(setRPOPPEndpoint1());
    }

    @Step("I receive Patch Reset Password On Profile response code 200")
    public void receivePatchMakeRPOPPHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set POST Reset Password On Profile Endpoint with Wrong HTTP Request")
    public String setRPOPPEndpoint() {
        return url;
    }

    @Step("I send POST Reset Password On Profile HTTP request2")
    public void sendPostRPOPHttpRequest2() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");
        requestBody.put("password", "adminganteng");
        requestBody.put("confirm_password", "adminganteng");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setRPOPPEndpoint());
    }

    @Step("I receive POST Reset Password On Profile valid HTTP response code 405")
    public void receivePostRPOPPHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }



    @Step("I set Patch Reset Password On Profile Endpoint With Wrong URL")
    public String setRPOPPasswordApiEndpoint3() {
        return url;
    }

    @Step("I send Patch Reset Password On Profile HTTP request3")
    public void sendRPOPPPasswordHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "adminganteng");
        requestBody.put("confirm_password", "adminganteng");


        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .patch(setRPOPPasswordApiEndpoint3());

    }

    @Step("I receive Patch Reset Password On Profile valid HTTP response code 404")
    public void validateRPOPHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }

}
