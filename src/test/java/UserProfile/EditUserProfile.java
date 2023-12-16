package UserProfile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class EditUserProfile {
    protected String url = "https://api.recything.my.id/users/profile";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Put Edit User Profile Endpoint With Correct Data")
    public String setEditUserProfileEndpoint1() {
        return url;
    }

    @Step("I send Put Edit User Profile request")
    public void sendPutEditUserProfileHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("fullname", "recything");
        requestBody.put("phone", "082298567350");
        requestBody.put("address", "kota jakarta");
        requestBody.put("date_of_birth", "2023-03-03");
        requestBody.put("purpose", "saya ingin melestarikan lingkungan");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).put(setEditUserProfileEndpoint1());
    }

    @Step("I receive Put Edit User Profile response code 200")
    public void receivePutEditUserProfileHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST Edit User Profile Endpoint with Wrong HTTP Request")
    public String setEditUserProfileEndpoint() {
        return url;
    }

    @Step("I send POST Edit User Profile HTTP request2")
    public void sendPostEditUserProfileHttpRequest2() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("fullname", "recything");
        requestBody.put("phone", "0884934899");
        requestBody.put("address", "Kota Jakarta");
        requestBody.put("date_of_birth", "2023-3-3");
        requestBody.put("purpouse", "Saya Ingin Membuang sampah");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setEditUserProfileEndpoint());
    }

    @Step("I receive POST Edit User Profile valid HTTP response code 405")
    public void receivePostEditUserProfileHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }



    @Step("I set Put Edit User Profile Endpoint With Wrong URL")
    public String setEditUserProfileApiEndpoint3() {
        return url;
    }

    @Step("I send Put Edit User Profile HTTP request3")
    public void sendEditUserProfileHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("fullname", "recything");
        requestBody.put("phone", "0884934899");
        requestBody.put("addresdds", "Kota Jakarta");
        requestBody.put("date_of_birth", "2023-3-3");
        requestBody.put("purpouse", "Saya Ingin Membuang sampah");


        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .put(setEditUserProfileApiEndpoint3());

    }

    @Step("I receive Put Edit User Profile valid HTTP response code 404")
    public void validateEditUserProfileHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
