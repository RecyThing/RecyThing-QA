package Community;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewAllEventByIDCommunity {
    protected String url = "https://api.recything.my.id/users/event/1b44d47c-662b-45b2-9e00-3202284e6e8d";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Get See Event Community Endpoint With Correct Data")
    public String setGetCommunityEvent(){
        return url;
    }
    @Step("I send Get See Event Community request")
    public void sendGetCommunityEvent() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetCommunityEvent());
    }

    @Step("I receive Get See Event Community valid HTTP response code 200")
    public void receiveWrongGETCommunityEventResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST See Event Community Endpoint with Wrong HTTP Request")
    public String setCommunityEventEndpoint() {
        return url;
    }

    @Step("I send POST See Event Community HTTP request2")
    public void sendPostCommunityEventHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setCommunityEventEndpoint());
    }

    @Step("I receive POST See Event Community valid HTTP response code 404")
    public void receivePostCommunityEventHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get See Event Community Endpoint With Wrong URL")
    public String setWrongCommunityEventCategoryURL(){
        return url + "mas";
    }
    @Step("I send Get See Event Community HTTP request3")
    public void sendGetCommunityEventHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongCommunityEventCategoryURL());
    }

    @Step("I receive Get See Event Community valid HTTP response code 404")
    public void receiveWrongGetAllCommunityEventURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
