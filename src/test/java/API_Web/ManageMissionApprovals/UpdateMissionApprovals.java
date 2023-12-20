package API_Web.ManageMissionApprovals;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateMissionApprovals {
    protected String url = "https://api.recything.my.id/admins/manage/missions/approvals/f8b22b6c-b0ad-4fcd-b752-03e71d4efdf1";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set PUT method to update Mission Approvals with valid request")
    public String setUpdateMissionApprovals(){
        return url;
    }

    @Step("I send PUT for update Mission Approvals endpoint requests to connect to APIs MMA3")
    public void sendPutToUpdateMissionApprovals(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("status", "disetujui");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).put(setUpdateMissionApprovals());
    }

    @Step("I receive HTTP response code 200 for update Mission Approvals")
    public void receiveUpdateMissionApprovalsResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
