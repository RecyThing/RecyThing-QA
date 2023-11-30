package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url = "https://api.recything.my.id/admins/manage/users/a7bb2859-ad53-480e-af84-7fc8c59c225c";

    @Step("I set DEL method to delete All Users with valid request")
    public String setDelUser(){
        return url;
    }

    @Step("I send DEL for User By ID endpoint requests to connect to APIs MU3")
    public void sendDelUser(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .when().delete(setDelUser());
    }

    @Step("I receive HTTP response code 200 for delete User By ID")
    public void receiveUserDelResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
