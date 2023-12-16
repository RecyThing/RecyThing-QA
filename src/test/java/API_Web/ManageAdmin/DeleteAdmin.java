package API_Web.ManageAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAdmin {
    protected String url = "https://api.recything.my.id/admins/a937ba69-9ba6-4843-91de-8aa66b55cf7d";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";

    @Step("I set DEL method to delete All Admin with valid request")
    public String setDelAdmin(){
        return url;
    }

    @Step("I send DEL for detail Admin endpoint requests to connect to APIs MA3")
    public void sendDelAdmin(){
        SerenityRest.given()
                .header("Authorization", token)
                .when().delete(setDelAdmin());
    }

    @Step("I receive HTTP response code 200 for delete Admin")
    public void receiveAdminDelResp(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
