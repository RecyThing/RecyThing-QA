package API_Web.ManageAcheivement;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdatePointAchievement {
    protected String url = "https://api.recything.my.id/admins/manage/achievements/1";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set GET method to update Point Achievement with valid request")
    public String setUpdatePointAchievement(){
        return url;
    }

    @Step("I send GET for update Point Achievement endpoint requests to connect to APIs MPA2")
    public void sendPutToUpdatePointAchievement(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("target_point", 150000);

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).patch(setUpdatePointAchievement());
    }

    @Step("I receive HTTP response code 200 for update Point Achievement")
    public void receiveUpdatePointAchievementResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
