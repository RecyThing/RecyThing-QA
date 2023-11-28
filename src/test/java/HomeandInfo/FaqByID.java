package HomeandInfo;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class FaqByID {
    protected String url = "https://api.recything.my.id/faq/2";
    @Step("I set Get FAQ with ID Endpoint With Correct Data")
    public String setGetFAQWithID(){
        return url;
    }
    @Step("I send Get FAQ with ID request")
    public void sendGetFAQWithID() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDA5NTIzMjMsImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.ydbBVN_D6EyGqJPu6qyTB-4noFuurNy7Ushhp7bQMRA")
                .when()
                .get(setGetFAQWithID());
    }

    @Step("I receive Get FAQ with ID valid HTTP response code 200")
    public void receiveWrongGETFAQWithIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST FAQ with ID Endpoint with Wrong HTTP Request")
    public String setFAQWithIDEndpoint() {
        return url;
    }

    @Step("I send POST FAQ with ID HTTP request2")
    public void sendPostFAQWithIDHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDA5NTIzMjMsImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.ydbBVN_D6EyGqJPu6qyTB-4noFuurNy7Ushhp7bQMRA")
                .contentType("application/json").body(requestBody.toJSONString()).post(setFAQWithIDEndpoint());
    }

    @Step("I receive POST FAQ with ID valid HTTP response code 405")
    public void receivePostFAQWithIDHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("I set Get FAQ with ID Endpoint With Wrong URL")
    public String setWrongFAQWithIDURL(){
        return url + "900000";
    }
    @Step("I send Get FAQ with ID HTTP request3")
    public void sendGetFAQWithIDHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDA1MDQ2NjIsImlkIjoiZGYwNmU5ZjctYzBmZS00MDcyLThjN2YtMTA1OGIxNDcxYzEyIiwicm9sZSI6IiJ9.4uw-4komFk1wHdVEMpnatW_FrFSwFlY3j9G--_gKfOk")
                .when()
                .get(setWrongFAQWithIDURL());
    }

    @Step("I receive Get FAQ with ID valid HTTP response code 404")
    public void receiveWrongPostFAQWithIDURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
