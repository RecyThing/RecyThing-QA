package API_Web.ManageTrashCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailTrashCategory {
    protected String url = "https://api.recything.my.id/admins/manage/trashes/15535392-b0fb-4c7a-aa2e-673989832ffd";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set GET method to view detail Trash Category with valid request")
    public String setGetTC1(){
        return url;
    }

    @Step("I send GET for detail Trash Category endpoint requests to connect to APIs MTC4")
    public void sendGetTC1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetTC1());
    }

    @Step("I receive HTTP response code 200 for view detail Trash Category")
    public void receiveTCResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Trash Category with invalid request method")
    public String setGetTC2(){
        return url;
    }

    @Step("I send POST for detail Trash Category endpoint requests to connect to APIs MTC4")
    public void sendGetTC2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("trash_type", "testTC1");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetTC2());
    }

    @Step("I receive HTTP response code 400 for view detail Trash Category")
    public void receiveTCResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
