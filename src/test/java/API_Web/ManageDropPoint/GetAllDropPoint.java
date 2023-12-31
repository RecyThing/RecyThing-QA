package API_Web.ManageDropPoint;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDropPoint {
    protected String url = "https://api.recything.my.id/admins/manage/drop-points";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Drop Point with valid request")
    public String setGetAllDropPoint1(){
        return url;
    }

    @Step("I send GET for All Drop Point endpoint requests to connect to APIs MDP1")
    public void sendGetAllDropPoint1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllDropPoint1());
    }

    @Step("I receive HTTP response code 200 for view All Drop Point")
    public void receiveAllDropPointResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Drop Point with invalid request method")
    public String setGetAllDropPoint2(){
        return url;
    }

    @Step("I send POST for All Drop Point endpoint requests to connect to APIs MDP1")
    public void sendGetAllDropPoint2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString())
                .post(setGetAllDropPoint2());
    }

    @Step("I receive HTTP response code 400 for view All Drop Point")
    public void receiveAllDropPointResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
