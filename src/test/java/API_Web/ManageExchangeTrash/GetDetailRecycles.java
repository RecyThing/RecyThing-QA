package API_Web.ManageExchangeTrash;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailRecycles {
    protected String url = "https://api.recything.my.id/admins/manage/recycles/PS16616";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set GET method to view detail Trash Exchange with valid request")
    public String setGetTrashExchange1(){
        return url;
    }

    @Step("I send GET for detail Trash Exchange endpoint requests to connect to APIs MTE2")
    public void sendGetTrashExchange1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetTrashExchange1());
    }

    @Step("I receive HTTP response code 200 for view detail Trash Exchange")
    public void receiveGetTrashExchangeResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Trash Exchange with invalid request method")
    public String setGetTrashExchange2(){
        return url;
    }

    @Step("I send POST for detail Trash Exchange endpoint requests to connect to APIs MTE2")
    public void sendGetTrashExchange2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetTrashExchange2());
    }

    @Step("I receive HTTP response code 400 for view detail Trash Exchange")
    public void receiveGetTrashExchangeResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
