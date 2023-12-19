package ArticleFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetTrashDetail {
    protected String url = "https://api.recything.my.id/trashes/2e619697-8471-4230-aab5-b51715deb73d";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set Detail Trash Category Endpoint With Correct Data")
    public String setGetDetailTrashCategory(){
        return url;
    }
    @Step("I send Get Detail Trash Category request")
    public void sendGetDetailTrashCategory() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetDetailTrashCategory());
    }

    @Step("I receive Get Detail Trash Category valid HTTP response code 200")
    public void receiveWrongGETDetailTrashCategoryResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST Detail Trash Category Endpoint with Wrong HTTP Request")
    public String setDetailTrashCategoryEndpoint() {
        return url;
    }

    @Step("I send POST Detail Trash Category HTTP request2")
    public void sendPostDetailTrashCategoryHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setDetailTrashCategoryEndpoint());
    }

    @Step("I receive POST Detail Trash Category valid HTTP response code 405")
    public void receivePostDetailTrashCategoryHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Detail Trash Category Endpoint With Wrong URL")
    public String setWrongDetailTrashCategoryURL(){
        return url + "mas";
    }
    @Step("I send Get Detail Trash Category HTTP request3")
    public void sendGetDetailTrashCategoryHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongDetailTrashCategoryURL());
    }

    @Step("I receive Get Detail Trash Category valid HTTP response code 404")
    public void receiveWrongGetDetailTrashCategoryURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
