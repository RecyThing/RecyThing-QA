package Community;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewDetailEvent {
    protected String url = "https://api.recything.my.id/users/event/1b44d47c-662b-45b2-9e00-3202284e6e8d/35b5a163-ea9c-415e-a1a3-abcde98f4bee";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Get See Detail Event Community Endpoint With Correct Data")
    public String setGetCommunityDetailEvent(){
        return url;
    }
    @Step("I send Get See Detail Event Community request")
    public void sendGetCommunityDetailEvent() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetCommunityDetailEvent());
    }

    @Step("I receive Get See Detail Event Community valid HTTP response code 200")
    public void receiveWrongGETCommunityEventDetailResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST See Detail Event Community Endpoint with Wrong HTTP Request")
    public String setCommunityEventDetailEndpoint() {
        return url;
    }

    @Step("I send POST See Detail Event Community HTTP request2")
    public void sendPostCommunityEventDetailHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setCommunityEventDetailEndpoint());
    }

    @Step("I receive POST See Detail Event Community valid HTTP response code 404")
    public void receivePostCommunityEventDetailHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get See Detail Event Community Endpoint With Wrong URL")
    public String setWrongCommunityEventDetailCategoryURL(){
        return url + "mas";
    }
    @Step("I send Get See Detail Event Community HTTP request3")
    public void sendGetCommunityEventDetailHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongCommunityEventDetailCategoryURL());
    }

    @Step("I receive Get See Detail Event Community valid HTTP response code 404")
    public void receiveWrongGetAllCommunityEventDetailURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
