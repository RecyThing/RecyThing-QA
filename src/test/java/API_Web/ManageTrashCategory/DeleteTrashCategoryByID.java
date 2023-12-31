package API_Web.ManageTrashCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteTrashCategoryByID {
    protected String url = "https://api.recything.my.id/admins/manage/trashes/09694266-7407-45b1-80c7-ec3073ac361c";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set DEL method to delete Trash Category with valid request")
    public String setDelTC(){
        return url;
    }

    @Step("I send DEL for Trash Category endpoint requests to connect to APIs MTC5")
    public void sendDelTC(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelTC());
    }

    @Step("I receive HTTP response code 200 for delete a Trash Category")
    public void receiveTCDelResp(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
