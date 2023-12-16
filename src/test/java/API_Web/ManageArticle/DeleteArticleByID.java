package API_Web.ManageArticle;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteArticleByID {
    protected String url = "https://api.recything.my.id/admins/manage/articles/92757434-bcce-4945-b842-7b1c86efba3e";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

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
        restAssuredThat(response -> response.statusCode(200));
    }
}
