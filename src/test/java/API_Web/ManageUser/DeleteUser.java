package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url = "https://api.recything.my.id/admins/manage/users/9ce9458f-cecd-42c9-8bcb-d380325d9d23";

    @Step("I set DEL method to delete All Users with valid request")
    public String setDelUser(){
        return url;
    }

    @Step("I send DEL for User By ID endpoint requests to connect to APIs MU3")
    public void sendDelUser(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMTExMDgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.NDvUjBLEjPDF4uxjv7dA9Ko4nKwn6dA2iiUIwc_aQhM")
                .when().delete(setDelUser());
    }

    @Step("I receive HTTP response code 200 for delete User By ID")
    public void receiveUserDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
