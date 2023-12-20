package API_Web.ManageMission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllMission {
    protected String url = "https://api.recything.my.id/admins/manage/missions";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Mission with valid request")
    public String setGetAllMission1(){
        return url;
    }

    @Step("I send GET for All Mission endpoint requests to connect to APIs MM1")
    public void sendGetAllMission1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllMission1());
    }

    @Step("I receive HTTP response code 200 for view All Mission")
    public void receiveAllMissionResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Mission with invalid request method")
    public String setGetAllMission2(){
        return url;
    }

    @Step("I send POST for All Mission endpoint requests to connect to APIs MM1")
    public void sendGetAllMission2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllMission2());
    }

    @Step("I receive HTTP response code 400 for view All Mission")
    public void receiveAllMissionResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
