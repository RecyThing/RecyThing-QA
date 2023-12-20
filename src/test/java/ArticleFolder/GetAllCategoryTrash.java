package ArticleFolder;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategoryTrash {
    protected String url = "https://api.recything.my.id/trashes";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set All Trash Category Endpoint With Correct Data")
    public String setGetAllTrashCategory(){
        return url;
    }
    @Step("I send Get All Trash Category request")
    public void sendGetAllTrashCategory() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetAllTrashCategory());
    }

    @Step("I receive Get All Trash Category valid HTTP response code 200")
    public void receiveWrongGETAllTrashCategoryResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST All Trash Category Endpoint with Wrong HTTP Request")
    public String setAllTrashCategoryEndpoint() {
        return url;
    }

    @Step("I send POST All Trash Category HTTP request2")
    public void sendPostAllTrashCategoryHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setAllTrashCategoryEndpoint());
    }

    @Step("I receive POST All Trash Category valid HTTP response code 405")
    public void receivePostAllTrashCategoryHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get All Trash Category Endpoint With Wrong URL")
    public String setWrongAllTrashCategoryURL(){
        return url + "mas";
    }
    @Step("I send Get All Trash Category HTTP request3")
    public void sendGetAllTrashCategoryHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongAllTrashCategoryURL());
    }

    @Step("I receive Get All Trash Category valid HTTP response code 404")
    public void receiveWrongGetAllTrashCategoryURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
