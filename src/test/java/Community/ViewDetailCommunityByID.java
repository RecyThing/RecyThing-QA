package Community;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewDetailCommunityByID {
    protected String url = "https://api.recything.my.id/communities/1b44d47c-662b-45b2-9e00-3202284e6e8d";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set Get Detail Community Endpoint With Correct Data")
    public String setGetDetailCommunityCategory(){
        return url;
    }
    @Step("I send Get Detail Community request")
    public void sendGetDetailCommunityCategory() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetDetailCommunityCategory());
    }

    @Step("I receive Get Detail Community valid HTTP response code 200")
    public void receiveWrongGETDetailCommunityResponseCode200(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Put Detail Community Endpoint with Wrong HTTP Request")
    public String setDetailCommunityEndpoint() {
        return url;
    }

    @Step("I send Put Detail Community HTTP request2")
    public void sendPostDetailCommunityHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).put(setDetailCommunityEndpoint());
    }

    @Step("I receive Put Detail Community valid HTTP response code 404")
    public void receivePostDetailCommunityHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Detail Community Endpoint With Wrong URL")
    public String setWrongDetailCommunityURL(){
        return url + "mas";
    }
    @Step("I send Get Detail Community HTTP request3")
    public void sendGetDetailCommunityHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongDetailCommunityURL());
    }

    @Step("I receive Get Detail Community valid HTTP response code 404")
    public void receiveWrongGetDetailCommunityURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
