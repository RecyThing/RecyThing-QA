package ArticleFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Article {
    protected String url = "https://api.recything.my.id/articles";
    protected String token = "";
    @Step("I set Get Article Endpoint With Correct Data")
    public String setGetArticles(){
        return url;
    }
    @Step("I send Get Article request")
    public void sendGetArticles() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetArticles());
    }

    @Step("I receive Get Article valid HTTP response code 200")
    public void receiveWrongGETArticlesResponseCode200(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I set POST Article Endpoint with Wrong HTTP Request")
    public String setArticlesEndpoint() {
        return url;
    }

    @Step("I send POST Article HTTP request2")
    public void sendPostArticlesHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setArticlesEndpoint());
    }

    @Step("I receive POST Article valid HTTP response code 404")
    public void receivePostArticlesHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I set Get Article Endpoint With Wrong URL")
    public String setWrongArticlesURL(){
        return url + "mas";
    }
    @Step("I send Get Article HTTP request3")
    public void sendGetArticlesHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongArticlesURL());
    }

    @Step("I receive Get Article valid HTTP response code 404")
    public void receiveWrongGetArtcilesURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
