package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url = "https://api.recything.my.id/admins/manage/users";

    @Step("I set DEL method to delete All Users with valid request")
    public String setDelUser(){
        return url;
    }

    @Step("I send DEL for User By ID endpoint requests to connect to APIs MU3")
    public void sendDelUser(){
        JSONObject requestParams=new JSONObject();
        requestParams.put("id", "4a8617e7-2653-4966-9f6f-6242d3085b9e");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEyNjg0MzgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.5orzYcR_3E5V5HWK1qz7MOkL2ReLFNs8wlz_j6M7Vs0")
                .contentType("application/json").body(requestParams.toJSONString()).delete(setDelUser());
    }

    @Step("I receive HTTP response code 200 for delete User By ID")
    public void receiveUserDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
