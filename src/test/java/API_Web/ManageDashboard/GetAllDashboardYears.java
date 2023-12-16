package API_Web.ManageDashboard;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDashboardYears {
    protected String url = "https://api.recything.my.id/dashboard/years";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set GET method to view All Dashboard Years with valid request")
    public String setGetDashboardYears1(){
        return url;
    }

    @Step("I send GET for All Dashboard Years endpoint requests to connect to APIs MD2")
    public void sendGetDashboardYears1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetDashboardYears1());
    }

    @Step("I receive HTTP response code 200 for view All Dashboard Years")
    public void receiveDashboardYearsResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Dashboard Years with invalid request method")
    public String setGetDashboardYears2(){
        return url;
    }

    @Step("I send POST for All Dashboard Years endpoint requests to connect to APIs MD2")
    public void sendGetDashboardYears2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetDashboardYears2());
    }

    @Step("I receive HTTP response code 404 for view All Dashboard Years")
    public void receiveDashboardYearsResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
