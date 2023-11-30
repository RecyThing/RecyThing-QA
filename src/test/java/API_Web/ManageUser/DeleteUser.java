package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url = "https://api.recything.my.id/admins/manage/users/3c2d474c-1f8f-4cf8-ac6d-5f04b5caa4ad";

    @Step("I set DEL method to delete All Users with valid request")
    public String setDelUser(){
        return url;
    }

    @Step("I send DEL for User By ID endpoint requests to connect to APIs MU3")
    public void sendDelUser(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzODU1MjUsImlkIjoiNGM2Y2QwNjAtMzc5Yi00OWNmLWI2MzctNTkwMmYxMTc3MzExIiwicm9sZSI6ImFkbWluIn0.Igp5kSMC_w2k8Tw6buCuzbwePcQaK0a3PFu7TGeFpU0")
                .when().delete(setDelUser());
    }

    @Step("I receive HTTP response code 200 for delete User By ID")
    public void receiveUserDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
