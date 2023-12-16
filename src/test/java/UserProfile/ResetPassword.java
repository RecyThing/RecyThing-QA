package UserProfile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ResetPassword {
    protected String url = "https://api.recything.my.id/users/profile/reset-password";
    @Step("I set Patch Reset Password On Profile Endpoint With Correct Data")
    public String setRPOPPEndpoint1() {
        return url;
    }

    @Step("I send Patch Reset Password On Profile request")
    public void sendPatchRPOPPHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("password", "12345678");
        requestBody.put("new_password", "123456789");
        requestBody.put("confirm_password", "123456789");


        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3MzA5MTgsImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.YAgiGnXX93q4IeZKonTbOlteQnM7Y0O8c4pJ_wPEZso")
                .contentType("application/json").body(requestBody.toJSONString()).patch(setRPOPPEndpoint1());
    }

    @Step("I receive Patch Reset Password On Profile response code 200")
    public void receivePatchMakeRPOPPHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
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
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3MzA5MTgsImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.YAgiGnXX93q4IeZKonTbOlteQnM7Y0O8c4pJ_wPEZso")
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
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3MzA5MTgsImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.YAgiGnXX93q4IeZKonTbOlteQnM7Y0O8c4pJ_wPEZso")
                .when()
                .patch(setRPOPPasswordApiEndpoint3());

    }

    @Step("I receive Patch Reset Password On Profile valid HTTP response code 404")
    public void validateRPOPHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
