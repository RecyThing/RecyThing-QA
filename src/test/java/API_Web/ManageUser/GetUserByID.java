package API_Web.ManageUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserByID {
    protected String url = "https://api.recything.my.id/admins/manage/users/332fcf30-69e4-4e79-9415-03dc3a4b8277";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";
    @Step("I set GET method to view User By ID with valid request")
    public String setGetUser1(){
        return url;
    }

    @Step("I send GET for User By ID endpoint requests to connect to APIs MU2")
    public void sendGetUser1(){
        SerenityRest.given()
                .header("Authorization", token)
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
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetUser2());
    }

    @Step("I receive HTTP response code 404 for view User By ID")
    public void receiveUserResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
