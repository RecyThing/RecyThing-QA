package API_Web.ManageExchangePoint;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllExchangePoint {
    protected String url = "https://api.recything.my.id/admins/manage/exchange-point";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set GET method to view All Exchange Point with valid request")
    public String setGetAllExchangePoint1(){
        return url;
    }

    @Step("I send GET for All Exchange Point endpoint requests to connect to APIs MEP1")
    public void sendGetAllExchangePoint1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllExchangePoint1());
    }

    @Step("I receive HTTP response code 200 for view All Exchange Point")
    public void receiveAllExchangePointResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Exchange Point with invalid request method")
    public String setGetAllExchangePoint2(){
        return url;
    }

    @Step("I send POST for All Exchange Point endpoint requests to connect to APIs MEP1")
    public void sendGetAllExchangePoint2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllExchangePoint2());
    }

    @Step("I receive HTTP response code 404 for view All Exchange Point")
    public void receiveAllExchangePointResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
