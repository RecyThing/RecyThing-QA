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
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzODU1MjUsImlkIjoiNGM2Y2QwNjAtMzc5Yi00OWNmLWI2MzctNTkwMmYxMTc3MzExIiwicm9sZSI6ImFkbWluIn0.Igp5kSMC_w2k8Tw6buCuzbwePcQaK0a3PFu7TGeFpU0")
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
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDEzODU1MjUsImlkIjoiNGM2Y2QwNjAtMzc5Yi00OWNmLWI2MzctNTkwMmYxMTc3MzExIiwicm9sZSI6ImFkbWluIn0.Igp5kSMC_w2k8Tw6buCuzbwePcQaK0a3PFu7TGeFpU0")
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllUsers2());
    }

    @Step("I receive HTTP response code 404 for view All User")
    public void receiveAllUserResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}