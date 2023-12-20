package API_Web.ManageMissionApprovals;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllMissionApprovals {
    protected String url = "https://api.recything.my.id/admins/manage/missions/approvals";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Mission Approvals with valid request")
    public String setGetAllMissionApprovals1(){
        return url;
    }

    @Step("I send GET for All Mission Approvals endpoint requests to connect to APIs MMA1")
    public void sendGetAllMissionApprovals1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllMissionApprovals1());
    }

    @Step("I receive HTTP response code 200 for view All Mission Approvals")
    public void receiveAllMissionApprovalsResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Mission Approvals with invalid request method")
    public String setGetAllMissionApprovals2(){
        return url;
    }

    @Step("I send POST for All Mission Approvals endpoint requests to connect to APIs MMA1")
    public void sendGetAllMissionApprovals2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllMissionApprovals2());
    }

    @Step("I receive HTTP response code 404 for view All Mission Approvals")
    public void receiveAllMissionApprovalsResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
