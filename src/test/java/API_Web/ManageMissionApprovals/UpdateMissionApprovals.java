package API_Web.ManageMissionApprovals;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateMissionApprovals {
    protected String url = "https://api.recything.my.id/admins/manage/missions/approvals/5b66951a-26f4-47f2-9764-5f20ed365d21";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

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
