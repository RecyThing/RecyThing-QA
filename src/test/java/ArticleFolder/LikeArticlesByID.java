package ArticleFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LikeArticlesByID {
    protected String url = "https://api.recything.my.id/articles/like/1d1a353d-342e-4932-8a9a-aca4c68aa714";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set  Like Article Endpoint With Correct Data")
    public String setLikeAnArticleEndpoint() {
        return url;
    }

    @Step("I send Get  Like Article request")
    public void sendPostLikeAnArticleHttpRequest() {
        JSONObject requestBody = new JSONObject();
        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setLikeAnArticleEndpoint());
    }

    @Step("I receive Get  Like Article valid HTTP response code 200")
    public void receivePostLikeAnArticleHttpResponseCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }


    @Step("I set POST Like Article Endpoint with Wrong HTTP Request")
    public String setWrongLikeAnArticleEndpoint(){
        return url;
    }

    @Step("I send POST Like Article HTTP request2")
    public void sendGetLikeAnArticleHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongLikeAnArticleEndpoint());
    }

    @Step("I receive POST Like Article valid HTTP response code 404")
    public void receiveWrongGetLikeAnArticleHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Like Article Endpoint With Wrong URL")
    public String setLikeAnArticleApiEndpoint() {
        return url;
    }

    @Step("I send Get Like Article HTTP request3")
    public void sendLikeAnArticleHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "recythinguser@gmail.com");
        requestBody.put("passwowrd", "recything00345r");

        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .post(setLikeAnArticleApiEndpoint());

    }

    @Step("I receive Get Like Article valid HTTP response code 400")
    public void validateLikeAnArticleHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
