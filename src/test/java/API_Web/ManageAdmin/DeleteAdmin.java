package API_Web.ManageAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAdmin {
    protected String url = "https://api.recything.my.id/admins/f26ccb44-305d-47be-8327-ddc28cdf4810";

    @Step("I set DEL method to delete All Admin with valid request")
    public String setDelAdmin(){
        return url;
    }

    @Step("I send DEL for detail Admin endpoint requests to connect to APIs MA3")
    public void sendDelAdmin(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .when().delete(setDelAdmin());
    }

    @Step("I receive HTTP response code 200 for delete Admin")
    public void receiveAdminDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
