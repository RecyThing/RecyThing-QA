package API_Web.ManageTrashCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllTrashCategory {
    protected String url = "https://api.recything.my.id/admins/manage/trashes";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Trash Category with valid request")
    public String setGetAllTC1(){
        return url;
    }

    @Step("I send GET for Trash Category endpoint requests to connect to APIs MTC3")
    public void sendGetAllTC1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllTC1());
    }

    @Step("I receive HTTP response code 200 for view All Trash Category")
    public void receiveAllTCResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Trash Category with invalid request method")
    public String setGetAllTC2(){
        return url;
    }

    @Step("I send POST for All Trash Category endpoint requests to connect to APIs MTC3")
    public void sendGetAllTC2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("trash_type", "testTC1");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllTC2());
    }

    @Step("I receive HTTP response code 404 for view All Trash Category")
    public void receiveAllTCResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
