package API_Web.ManageMission;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteMissionByID {
    protected String url = "https://api.recything.my.id/admins/manage/missions/MIS-B138FBE68DA3427";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

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
        restAssuredThat(response -> response.statusCode(200));
    }
}
