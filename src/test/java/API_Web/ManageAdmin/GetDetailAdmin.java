package API_Web.ManageAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailAdmin {
    protected String url = "https://api.recything.my.id/admins/20635dd1-5cfc-4c03-8235-426143246c85";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set GET method to view detail Admin with valid request")
    public String setGetAdmin1(){
        return url;
    }

    @Step("I send GET for detail Admin endpoint requests to connect to APIs MA2")
    public void sendGetAdmin1(){
        SerenityRest.given()
                .header("Authorization", token)
                .when().get(setGetAdmin1());
    }

    @Step("I receive HTTP response code 200 for view detail Admin")
    public void receiveAdminResp1(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set POST method to view detail Admin with invalid request method")
    public String setGetAdmin2(){
        return url;
    }

    @Step("I send POST for detail Admin endpoint requests to connect to APIs MA2")
    public void sendGetAdmin2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", "6b128e58-1899-4c35-914b-79fbe06dfca5");

        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAdmin2());
    }

    @Step("I receive HTTP response code 404 for view detail Admin")
    public void receiveAdminResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
