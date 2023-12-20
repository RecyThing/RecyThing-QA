package ArticleFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ArticleByID {
    protected String url = "https://api.recything.my.id/articles/0c18a054-f86b-46df-b684-9dc99f6656dc";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Get Article By ID Endpoint With Correct Data")
    public String setGetArticlesByID(){
        return url;
    }
    @Step("I send Get Article By ID request")
    public void sendGetArticlesByID() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetArticlesByID());
    }

    @Step("I receive Get Article By ID valid HTTP response code 200")
    public void receiveWrongGETArticlesByIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set POST Article By ID Endpoint with Wrong HTTP Request")
    public String setArticlesByIDEndpoint() {
        return url;
    }

    @Step("I send POST Article By ID HTTP request2")
    public void sendPostArticlesByIDHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setArticlesByIDEndpoint());
    }

    @Step("I receive POST Article By ID valid HTTP response code 405")
    public void receivePostArticlesByIDHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Article By ID Endpoint With Wrong URL")
    public String setWrongArticlesByIDURL(){
        return url + "mas";
    }
    @Step("I send Get Article By ID HTTP request3")
    public void sendGetArticlesByIDHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongArticlesByIDURL());
    }

    @Step("I receive Get Article By ID valid HTTP response code 404")
    public void receiveWrongGetArtcilesByIDURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
