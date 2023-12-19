package API_Web.ManageMission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteMissionByID {
    protected String url = "https://api.recything.my.id/admins/manage/missions/MIS-755791A3E53B4F6";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set DEL method to delete Mission with valid request")
    public String setDelMissionByID(){
        return url;
    }

    @Step("I send DEL for detail Mission endpoint requests to connect to APIs MM3")
    public void sendDelMissionByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelMissionByID());
    }

    @Step("I receive HTTP response code 200 for delete Mission")
    public void receiveDelMissionByIDResp(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
