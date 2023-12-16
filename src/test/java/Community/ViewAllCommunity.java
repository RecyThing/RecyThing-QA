package Community;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewAllCommunity {
    protected String url = "https://api.recything.my.id/communities";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Get All Community Endpoint With Correct Data")
    public String setGetCommunity(){
        return url;
    }
    @Step("I send Get All Community request")
    public void sendGetCommunity() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetCommunity());
    }

    @Step("I receive Get All Community valid HTTP response code 200")
    public void receiveWrongGETCommunityResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST All Community Endpoint with Wrong HTTP Request")
    public String setCommunityEndpoint() {
        return url;
    }

    @Step("I send POST All Community HTTP request2")
    public void sendPostCommunityHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setCommunityEndpoint());
    }

    @Step("I receive POST All Community valid HTTP response code 404")
    public void receivePostCommunityHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get All Community Endpoint With Wrong URL")
    public String setWrongCommunityCategoryURL(){
        return url + "mas";
    }
    @Step("I send Get All Community HTTP request3")
    public void sendGetCommunityHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongCommunityCategoryURL());
    }

    @Step("I receive Get All Community valid HTTP response code 404")
    public void receiveWrongGetAllCommunityURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
