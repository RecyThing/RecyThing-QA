package API_Web.ManageCommunity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailCommunity {
    protected String url = "https://api.recything.my.id/admins/manage/communities/9b7233b9-409b-40da-b6f0-b77328608610";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set GET method to view detail Community with valid request")
    public String setGetDetailCommunity1(){
        return url;
    }

    @Step("I send GET for detail Community endpoint requests to connect to APIs C2")
    public void sendGetDetailCommunity1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetDetailCommunity1());
    }

    @Step("I receive HTTP response code 200 for view detail Community")
    public void receiveGetDetailCommunity1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Community with invalid request method")
    public String setGetDetailCommunity2(){
        return url;
    }

    @Step("I send POST for detail Community endpoint requests to connect to APIs C2")
    public void sendGetDetailCommunity2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetDetailCommunity2());
    }

    @Step("I receive HTTP response code 400 for view detail Community")
    public void receiveGetDetailCommunityResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
