package API_Web.ManageMission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailMission {
    protected String url = "https://api.recything.my.id/admins/manage/missions/MIS-1A5D1C71A94140B";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set GET method to view detail Mission with valid request")
    public String setGetDetailMission1(){
        return url;
    }

    @Step("I send GET for detail Mission endpoint requests to connect to APIs MM2")
    public void sendGetDetailMission1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetDetailMission1());
    }

    @Step("I receive HTTP response code 200 for view detail Mission")
    public void receiveGetDetailMission1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Mission with invalid request method")
    public String setGetDetailMission2(){
        return url;
    }

    @Step("I send POST for detail Mission endpoint requests to connect to APIs MM2")
    public void sendGetDetailMission2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetDetailMission2());
    }

    @Step("I receive HTTP response code 400 for view detail Mission")
    public void receiveGetDetailMissionResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
