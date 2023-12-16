package API_Web.ManageReport;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllReport {
    protected String url = "https://api.recything.my.id/admins/manage/reports";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set GET method to view All Report with valid request")
    public String setGetAllReport1(){
        return url;
    }

    @Step("I send GET for All Report endpoint requests to connect to APIs MR1")
    public void sendGetAllReport1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllReport1());
    }

    @Step("I receive HTTP response code 200 for view All Report")
    public void receiveAllReportResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Report with invalid request method")
    public String setGetAllReport2(){
        return url;
    }

    @Step("I send POST for All Report endpoint requests to connect to APIs MR1")
    public void sendGetAllReport2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", "");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllReport2());
    }

    @Step("I receive HTTP response code 404 for view All Report")
    public void receiveAllAdminResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
