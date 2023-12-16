package UserProfile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewUserProfile {
    protected String url = "https://api.recything.my.id/users/profile";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Get View User Profile Endpoint With Correct Data")
    public String setGetViewUserProfile(){
        return url;
    }
    @Step("I send Get View User Profile request")
    public void sendGetViewUserProfile() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetViewUserProfile());
    }

    @Step("I receive Get View User Profile valid HTTP response code 200")
    public void receiveWrongGETtViewUserProfileResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST View User Profile Endpoint with Wrong HTTP Request")
    public String setViewUserProfileEndpoint() {
        return url;
    }

    @Step("I send POST View User Profile HTTP request2")
    public void sendPostViewUserProfileHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setViewUserProfileEndpoint());
    }

    @Step("I receive POST View User Profile valid HTTP response code 405")
    public void receivePostViewUserProfileHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get View User Profile Endpoint With Wrong URL")
    public String setWrongViewUserProfileHTTP(){
        return url + "mas";
    }
    @Step("I send Get View User Profile HTTP request3")
    public void sendGetViewUserProfileHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongViewUserProfileHTTP());
    }

    @Step("I receive Get View User Profile valid HTTP response code 404")
    public void receiveWrongPostViewUserProfileHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
