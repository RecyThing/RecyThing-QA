package API_Web.ManageDropPoint;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailDropPoint {
    protected String url = "https://api.recything.my.id/admins/manage/drop-points/05cb0304-42cc-4d12-b7d1-10701ddfc1a7";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set GET method to view detail Drop Point with valid request")
    public String setGetDetailDropPoint1(){
        return url;
    }

    @Step("I send GET for detail Drop Point endpoint requests to connect to APIs MDP2")
    public void sendGetDetailDropPoint1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetDetailDropPoint1());
    }

    @Step("I receive HTTP response code 200 for view detail Drop Point")
    public void receiveGetDetailDropPoint1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Drop Point with invalid request method")
    public String setGetDetailDropPoint2(){
        return url;
    }

    @Step("I send POST for detail Drop Point endpoint requests to connect to APIs MDP2")
    public void sendGetDetailDropPoint2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString())
                .get(setGetDetailDropPoint2());
    }

    @Step("I receive HTTP response code 400 for view detail Drop Point")
    public void receiveGetDetailDropPointResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
