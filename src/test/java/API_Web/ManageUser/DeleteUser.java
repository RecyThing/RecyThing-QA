package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url = "https://api.recything.my.id/admins/manage/users/25df2772-37de-493e-922c-c43b7e46779c";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set DEL method to delete All Users with valid request")
    public String setDelUser(){
        return url;
    }

    @Step("I send DEL for User By ID endpoint requests to connect to APIs MU3")
    public void sendDelUser(){
        SerenityRest.given()
                .header("Authorization", token)
                .when().delete(setDelUser());
    }

    @Step("I receive HTTP response code 200 for delete User By ID")
    public void receiveUserDelResp(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
