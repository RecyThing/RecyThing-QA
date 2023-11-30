package API_Web.ManageAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllAdmin {
    protected String url = "https://api.recything.my.id/admins";

    @Step("I set GET method to view All Admin with valid request")
    public String setGetAllAdmin1(){
        return url;
    }

    @Step("I send GET for All Admin endpoint requests to connect to APIs MA1")
    public void sendGetAllAdmin1(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .when().get(setGetAllAdmin1());
    }

    @Step("I receive HTTP response code 200 for view All Admin")
    public void receiveAllAdminResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Admin with invalid request method")
    public String setGetAllAdmin2(){
        return url;
    }

    @Step("I send POST for All Admin endpoint requests to connect to APIs MA1")
    public void sendGetAllAdmin2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", "");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzMzY3MjgsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.05Bh0vu27xqFiTup0omJQ8tZr8qUE20KgA9VJw2uAls")
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllAdmin2());
    }

    @Step("I receive HTTP response code 404 for view All Admin")
    public void receiveAllAdminResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
