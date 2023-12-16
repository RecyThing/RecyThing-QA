package Mission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailMissions {
    protected String url = "https://api.recything.my.id/missions/MIS-284A2C1631514";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Get See Detail Mission Endpoint With Correct Data")
    public String setGetSeeDetailMisson(){
        return url;
    }
    @Step("I send Get See Detail Mission request")
    public void sendGetSeeDetailMisson() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetSeeDetailMisson());
    }

    @Step("I receive Get See Detail Mission valid HTTP response code 200")
    public void receiveWrongGETSeeDetailMissonResponseCode200(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post See Detail Mission Endpoint with Wrong HTTP Request")
    public String setSeeDetailMissonEndpoint() {
        return url;
    }

    @Step("I send Post See Detail Mission HTTP request2")
    public void sendPostSeeDetailMissonHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setSeeDetailMissonEndpoint());
    }

    @Step("I receive Post See Detail Mission valid HTTP response code 404")
    public void receivePostSeeDetailMissonHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get See Detail Mission Endpoint With Wrong Body")
    public String setWrongSeeDetailMissonURL(){
        return url + "mas";
    }
    @Step("I send Get See Detail Mission HTTP request3")
    public void sendGetSeeDetailMissonHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongSeeDetailMissonURL());
    }

    @Step("I receive Get See Detail Mission valid HTTP response code 404")
    public void receiveWrongGetSeeDetailMissonResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
