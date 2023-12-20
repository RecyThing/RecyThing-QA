package API_Web.ManageArticle;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllArticle {
    protected String url = "https://api.recything.my.id/admins/manage/articles";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Article with valid request")
    public String setGetAllArticle1(){
        return url;
    }

    @Step("I send GET for All Article endpoint requests to connect to APIs MA2")
    public void sendGetAllArticle1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllArticle1());
    }

    @Step("I receive HTTP response code 200 for view All Article")
    public void receiveAllArticleResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Article with invalid request method")
    public String setGetAllArticle2(){
        return url;
    }

    @Step("I send POST for All Article endpoint requests to connect to APIs MA2")
    public void sendGetAllArticle2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "Inovasi Terkini dalam Pengelolaan Sampah Kertas");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllArticle2());
    }

    @Step("I receive HTTP response code 400 for view All Article")
    public void receiveAllArticleResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
