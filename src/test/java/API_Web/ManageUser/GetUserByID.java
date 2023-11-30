package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserByID {
    protected String url = "https://api.recything.my.id/admins/manage/users/635c4156-5245-412d-a918-3e52fc4d81b0";

    @Step("I set GET method to view User By ID with valid request")
    public String setGetUser1(){
        return url;
    }

    @Step("I send GET for User By ID endpoint requests to connect to APIs MU2")
    public void sendGetUser1(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .when().get(setGetUser1());
    }

    @Step("I receive HTTP response code 200 for view User By ID")
    public void receiveUserResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view User By ID with invalid request method")
    public String setGetUser2(){
        return url;
    }

    @Step("I send POST for User By ID endpoint requests to connect to APIs MU2")
    public void sendGetUser2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", "4a8617e7-2653-4966-9f6f-6242d3085b9e");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetUser2());
    }

    @Step("I receive HTTP response code 404 for view User By ID")
    public void receiveUserResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
