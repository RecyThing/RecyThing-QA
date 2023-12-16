package API_Web.ManageExchangeTrash;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllRecycles {
    protected String url = "https://api.recything.my.id/admins/manage/recycles";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set GET method to view All Trash Exchange with valid request")
    public String setGetAllTrashExchange1(){
        return url;
    }

    @Step("I send GET for All Trash Exchange endpoint requests to connect to APIs MTE1")
    public void sendGetAllTrashExchange1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllTrashExchange1());
    }

    @Step("I receive HTTP response code 200 for view All Trash Exchange")
    public void receiveAllTrashExchangeResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Trash Exchange with invalid request method")
    public String setGetAllTrashExchange2(){
        return url;
    }

    @Step("I send POST for All Trash Exchange endpoint requests to connect to APIs MTE1")
    public void sendGetAllTrashExchange2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllTrashExchange2());
    }

    @Step("I receive HTTP response code 404 for view All Trash Exchange")
    public void receiveAllTrashExchangeResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
