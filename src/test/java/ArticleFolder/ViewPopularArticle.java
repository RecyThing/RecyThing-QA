package ArticleFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ViewPopularArticle {
    protected String url = "https://api.recything.my.id/articles/popular";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set  Popular Article Endpoint With Correct Data")
    public String setGetPopularArticles(){
        return url;
    }
    @Step("I send Get  Popular Article request")
    public void sendGetPopularArticles() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetPopularArticles());
    }

    @Step("I receive Get  Popular Article valid HTTP response code 200")
    public void receiveWrongGETPopularArticlesResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST Popular Article Endpoint with Wrong HTTP Request")
    public String setPopularArticlesEndpoint() {
        return url;
    }

    @Step("I send POST Popular Article HTTP request2")
    public void sendPostPopularArticlesHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setPopularArticlesEndpoint());
    }

    @Step("I receive POST Popular Article valid HTTP response code 405")
    public void receivePostPopularArticlesHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Popular Article Endpoint With Wrong URL")
    public String setWrongPopularArticlesURL(){
        return url + "mas";
    }
    @Step("I send Get Popular Article HTTP request3")
    public void sendGetPopularArticlesHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongPopularArticlesURL());
    }

    @Step("I receive Get Popular Article valid HTTP response code 404")
    public void receiveWrongGetPopularArticlesURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
