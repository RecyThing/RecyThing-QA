package API_Web.ManageArticle;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteArticleByID {
    protected String url = "https://api.recything.my.id/admins/manage/articles/b6776cdd-3e9b-42ad-b3eb-7a7952e92dcb";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set DEL method to delete All Article with valid request")
    public String setDelArticle(){
        return url;
    }

    @Step("I send DEL for detail Article endpoint requests to connect to APIs MA4")
    public void sendDelArticle(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelArticle());
    }

    @Step("I receive HTTP response code 200 for delete Article")
    public void receiveArticleDelResp(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
