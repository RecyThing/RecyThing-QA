package UserPointAndVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllHistoryByID {
    protected String url = "https://api.recything.my.id/users/point/history/873776057";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Get All History By ID Endpoint With Correct Data")
    public String setGetSeeAllHistoryByID(){
        return url;
    }
    @Step("I send Get All History By ID request")
    public void sendGetSeeAllHistoryByID() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetSeeAllHistoryByID());
    }

    @Step("I receive Get All History By ID valid HTTP response code 200")
    public void receiveWrongGETAllHistoryByIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST All History By ID Endpoint with Wrong HTTP Request")
    public String setSeeAllHistoryByIDEndpoint() {
        return url;
    }

    @Step("I send POST All History By ID HTTP request2")
    public void sendPostSeeAllHistoryByIDHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setSeeAllHistoryByIDEndpoint());
    }

    @Step("I receive POST All History By ID valid HTTP response code 405")
    public void receivePostSeeAllHistoryByIDHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get All History By ID Endpoint With Wrong URL")
    public String setWrongSeeAllHistoryByIDURL(){
        return url + "mas";
    }
    @Step("I send Get All History By ID HTTP request3")
    public void sendGetSeeAllHistoryByIDHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongSeeAllHistoryByIDURL());
    }

    @Step("I receive Get All History By ID valid HTTP response code 404")
    public void receiveWrongGetAllHistoryByIDResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
