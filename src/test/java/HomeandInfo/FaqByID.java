package HomeandInfo;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class FaqByID {
    protected String url = "https://api.recything.my.id/faq/2";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Get FAQ with ID Endpoint With Correct Data")
    public String setGetFAQWithID(){
        return url;
    }
    @Step("I send Get FAQ with ID request")
    public void sendGetFAQWithID() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetFAQWithID());
    }

    @Step("I receive Get FAQ with ID valid HTTP response code 200")
    public void receiveWrongGETFAQWithIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST FAQ with ID Endpoint with Wrong HTTP Request")
    public String setFAQWithIDEndpoint() {
        return url;
    }

    @Step("I send POST FAQ with ID HTTP request2")
    public void sendPostFAQWithIDHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setFAQWithIDEndpoint());
    }

    @Step("I receive POST FAQ with ID valid HTTP response code 405")
    public void receivePostFAQWithIDHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set Get FAQ with ID Endpoint With Wrong URL")
    public String setWrongFAQWithIDURL(){
        return url + "900000";
    }
    @Step("I send Get FAQ with ID HTTP request3")
    public void sendGetFAQWithIDHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongFAQWithIDURL());
    }

    @Step("I receive Get FAQ with ID valid HTTP response code 404")
    public void receiveWrongPostFAQWithIDURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
