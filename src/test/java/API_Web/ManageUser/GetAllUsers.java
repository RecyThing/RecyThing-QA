package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsers {
    protected String url = "https://api.recything.my.id/admins/manage/users";

    @Step("I set GET method to view All Users with valid request")
    public String setGetAllUsers1(){
        return url;
    }

    @Step("I send GET for All User endpoint requests to connect to APIs MU1")
    public void sendGetAllUsers1(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .when().get(setGetAllUsers1());
    }

    @Step("I receive HTTP response code 200 for view All User")
    public void receiveAllUserResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Users with invalid request method")
    public String setGetAllUsers2(){
        return url;
    }

    @Step("I send POST for All User endpoint requests to connect to APIs MU1")
    public void sendGetAllUsers2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", "4a8617e7-2653-4966-9f6f-6242d3085b9e");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllUsers2());
    }

    @Step("I receive HTTP response code 404 for view All User")
    public void receiveAllUserResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}