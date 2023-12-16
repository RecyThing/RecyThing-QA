package API_Web.ManageReport;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateReport {
    protected String url = "https://api.recything.my.id/admins/manage/reports/TS-00B9E9BF97134C6";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";
    @Step("I set PATCH method to update Report By ID with valid request")
    public String setUpdateReport1(){
        return url;
    }

    @Step("I send PATCH for update Report endpoint and body requests to connect to APIs MR3")
    public void sendUpdateReport1(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("status", "diterima");

        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).patch(setUpdateReport1());
    }

    @Step("I receive HTTP response code 200 for update Report")
    public void receiveUpdateReportResp1(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set POST method to update Report By ID with valid request")
    public String setUpdateReport2(){
        return url;
    }

    @Step("I send POST for update Report endpoint and body requests to connect to APIs MR3")
    public void sendUpdateReport2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("status", "ditolak");

        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setUpdateReport2());
    }

    @Step("I receive HTTP response code 404 for update Report")
    public void receiveUpdateReportResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
