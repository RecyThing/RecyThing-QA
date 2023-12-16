package HomeandInfo;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Faq {
    protected String url = "https://api.recything.my.id/faq";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Get FAQ Endpoint With Correct Data")
    public String setGetFAQ(){
        return url;
    }
    @Step("I send Get FAQ request")
    public void sendGetFAQ() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetFAQ());
    }

    @Step("I receive Get FAQ valid HTTP response code 200")
    public void receiveWrongGETFAQResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST FAQ Endpoint with Wrong HTTP Request")
    public String setFAQEndpoint() {
        return url;
    }

    @Step("I send POST FAQ HTTP request2")
    public void sendPostFAQHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setFAQEndpoint());
    }

    @Step("I receive POST FAQ valid HTTP response code 405")
    public void receivePostFAQHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set Get FAQ Endpoint With Wrong URL")
    public String setWrongFAQURL(){
        return url + "mas";
    }
    @Step("I send Get FAQ HTTP request3")
    public void sendGetFAQHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongFAQURL());
    }

    @Step("I receive Get FAQ valid HTTP response code 404")
    public void receiveWrongPostFAQURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

