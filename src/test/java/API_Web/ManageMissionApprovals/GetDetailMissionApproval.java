package API_Web.ManageMissionApprovals;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailMissionApproval {
    protected String url = "https://api.recything.my.id/admins/manage/missions/approvals/6a2adc2d-cfd9-4c20-af97-34f4d73e8b88";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set GET method to view Mission Approvals with valid request")
    public String setGetDetailMissionApproval1(){
        return url;
    }

    @Step("I send GET for Mission Approvals endpoint requests to connect to APIs MMA2")
    public void sendGetDetailMissionApproval1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetDetailMissionApproval1());
    }

    @Step("I receive HTTP response code 200 for view Mission Approvals")
    public void receiveGetDetailMissionApprovalResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view Mission Approvals with invalid request method")
    public String setGetDetailMissionApproval2(){
        return url;
    }

    @Step("I send POST for Mission Approvals endpoint requests to connect to APIs MMA2")
    public void sendGetDetailMissionApproval2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetDetailMissionApproval2());
    }

    @Step("I receive HTTP response code 404 for view Mission Approvals")
    public void receiveGetDetailMissionApprovalResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
