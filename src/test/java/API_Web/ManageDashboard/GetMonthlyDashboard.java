package API_Web.ManageDashboard;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetMonthlyDashboard {
    protected String url = "https://api.recything.my.id/dashboard/monthly";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set GET method to view Monthly Dashboard with valid request")
    public String setGetAllMonthlyDashboard1(){
        return url;
    }

    @Step("I send GET for Monthly Dashboard endpoint requests to connect to APIs MD1")
    public void sendGetAllMonthlyDashboard1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllMonthlyDashboard1());
    }

    @Step("I receive HTTP response code 200 for view Monthly Dashboard")
    public void receiveAllMonthlyDashboardResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view Monthly Dashboard with invalid request method")
    public String setGetAllMonthlyDashboard2(){
        return url;
    }

    @Step("I send POST for Monthly Dashboard endpoint requests to connect to APIs MD1")
    public void sendGetAllMonthlyDashboard2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllMonthlyDashboard2());
    }

    @Step("I receive HTTP response code 404 for view Monthly Dashboard")
    public void receiveAllMonthlyDashboardResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
