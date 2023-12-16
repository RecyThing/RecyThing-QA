package API_Web.ManageExchangePoint;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateExchangePoint {
    protected String url = "https://api.recything.my.id/admins/manage/exchange-point/4230075264";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set PATCH method to update Exchange Point with valid request")
    public String setUpdateExchangePoint(){
        return url;
    }

    @Step("I send PATCH for update Exchange Point endpoint requests to connect to APIs MEP3")
    public void sendPutToUpdateExchangePoint(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("status", "diproses");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).patch(setUpdateExchangePoint());
    }

    @Step("I receive HTTP response code 200 for update Exchange Point")
    public void receiveUpdateExchangePointResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
