package API_Web.ManageAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAdmin {
    protected String url = "https://api.recything.my.id/admins/4c6cd060-379b-49cf-b637-5902f1177311";

    @Step("I set DEL method to delete All Admin with valid request")
    public String setDelAdmin(){
        return url;
    }

    @Step("I send DEL for detail Admin endpoint requests to connect to APIs MA3")
    public void sendDelAdmin(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzODU1MjUsImlkIjoiNGM2Y2QwNjAtMzc5Yi00OWNmLWI2MzctNTkwMmYxMTc3MzExIiwicm9sZSI6ImFkbWluIn0.Igp5kSMC_w2k8Tw6buCuzbwePcQaK0a3PFu7TGeFpU0")
                .when().delete(setDelAdmin());
    }

    @Step("I receive HTTP response code 200 for delete Admin")
    public void receiveAdminDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
