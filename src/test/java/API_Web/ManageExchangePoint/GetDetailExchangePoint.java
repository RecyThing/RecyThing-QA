package API_Web.ManageExchangePoint;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailExchangePoint {
    protected String url = "https://api.recything.my.id/admins/manage/exchange-point/1056008209";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";

    @Step("I set GET method to view Exchange Point with valid request")
    public String setGetDetailExchangePoint1(){
        return url;
    }

    @Step("I send GET for Exchange Point endpoint requests to connect to APIs MEP2")
    public void sendGetDetailExchangePoint1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetDetailExchangePoint1());
    }

    @Step("I receive HTTP response code 200 for view Exchange Point")
    public void receiveGetDetailExchangePointResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view Exchange Point with invalid request method")
    public String setGetDetailExchangePoint2(){
        return url;
    }

    @Step("I send POST for Exchange Point endpoint requests to connect to APIs MEP2")
    public void sendGetDetailExchangePoint2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetDetailExchangePoint2());
    }

    @Step("I receive HTTP response code 404 for view Exchange Point")
    public void receiveGetDetailExchangePointResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
