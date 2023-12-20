package API_Web.ManageCommunity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCommunity {
    protected String url = "https://api.recything.my.id/admins/manage/communities";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Community with valid request")
    public String setGetAllCommunity1(){
        return url;
    }

    @Step("I send GET for All Community endpoint requests to connect to APIs C1")
    public void sendGetAllCommunity1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllCommunity1());
    }

    @Step("I receive HTTP response code 200 for view All Community")
    public void receiveAllCommunityResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Community with invalid request method")
    public String setGetAllCommunity2(){
        return url;
    }

    @Step("I send POST for All Community endpoint requests to connect to APIs C1")
    public void sendGetAllCommunity2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllCommunity2());
    }

    @Step("I receive HTTP response code 400 for view All Community")
    public void receiveAllCommunityResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
