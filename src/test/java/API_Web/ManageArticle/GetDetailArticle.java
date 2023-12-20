package API_Web.ManageArticle;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailArticle {
    protected String url = "https://api.recything.my.id/admins/manage/articles/ff9252d7-bdee-4f48-b6f9-69520eb9968b";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view detail Article with valid request")
    public String setGetArticle1(){
        return url;
    }

    @Step("I send GET for detail Article endpoint requests to connect to APIs MA3")
    public void sendGetArticle1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetArticle1());
    }

    @Step("I receive HTTP response code 200 for view detail Article")
    public void receiveGetArticleResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Article with invalid request method")
    public String setGetArticle2(){
        return url;
    }

    @Step("I send POST for detail Article endpoint requests to connect to APIs MA3")
    public void sendGetArticle2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("trash_type", "testTC1");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetArticle2());
    }

    @Step("I receive HTTP response code 400 for view detail Article")
    public void receiveGetArticleResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
