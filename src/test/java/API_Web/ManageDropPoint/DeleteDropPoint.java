package API_Web.ManageDropPoint;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteDropPoint {
    protected String url = "https://api.recything.my.id/admins/manage/drop-points/1a89bd99-a59d-44f9-802b-5d705e85edc3";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set DEL method to delete Drop Point with valid request")
    public String setDelDropPointByID(){
        return url;
    }

    @Step("I send DEL for detail Drop Point endpoint requests to connect to APIs MDP3")
    public void sendDelDropPointByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelDropPointByID());
    }

    @Step("I receive HTTP response code 200 for delete Drop Point")
    public void receiveDelDropPointByIDResp(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
