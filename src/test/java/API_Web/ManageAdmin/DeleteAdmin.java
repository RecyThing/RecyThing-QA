package API_Web.ManageAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAdmin {
    protected String url = "https://api.recything.my.id/admins/82b9573c-c937-4c4a-989a-95889f8c9528";

    @Step("I set DEL method to delete All Admin with valid request")
    public String setDelAdmin(){
        return url;
    }

    @Step("I send DEL for detail Admin endpoint requests to connect to APIs MA3")
    public void sendDelAdmin(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMTExMDgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.NDvUjBLEjPDF4uxjv7dA9Ko4nKwn6dA2iiUIwc_aQhM")
                .when().delete(setDelAdmin());
    }

    @Step("I receive HTTP response code 200 for delete Admin")
    public void receiveAdminDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
