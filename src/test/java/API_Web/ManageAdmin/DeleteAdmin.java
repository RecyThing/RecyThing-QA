package API_Web.ManageAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAdmin {
    protected String url = "https://api.recything.my.id/admins/49d5129b-22df-4674-a0f6-67ccfdfd9acb";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set DEL method to delete All Admin with valid request")
    public String setDelAdmin(){
        return url;
    }

    @Step("I send DEL for detail Admin endpoint requests to connect to APIs MA3")
    public void sendDelAdmin(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelAdmin());
    }

    @Step("I receive HTTP response code 200 for delete Admin")
    public void receiveAdminDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
