package API_Web.ManageReport;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailReport {
    protected String url = "https://api.recything.my.id/admins/manage/reports/TS-1C598162B4DA4E3";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";

    @Step("I set GET method to view detail Report with valid request")
    public String setDetailReport1(){
        return url;
    }

    @Step("I send GET for detail Report endpoint requests to connect to APIs MR2")
    public void sendDetailReport1(){
        SerenityRest.given()
                .header("Authorization", token)
                .when().get(setDetailReport1());
    }

    @Step("I receive HTTP response code 200 for view detail Report")
    public void receiveDetailReportResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set PATCH method to view detail Report with invalid request method")
    public String setDetailReport2(){
        return url;
    }

    @Step("I send PATCH for detail Report endpoint requests to connect to APIs MR2")
    public void sendDetailReport2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", "TS-1");

        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setDetailReport2());
    }

    @Step("I receive HTTP response code 400 for view detail Report")
    public void receiveDetailReportResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
