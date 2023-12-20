package API_Web.ManageAcheivement;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllAchievements {
    protected String url = "https://api.recything.my.id/admins/manage/achievements";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view Achievement with valid request")
    public String setGetAllAchievement1(){
        return url;
    }

    @Step("I send GET for Achievement endpoint requests to connect to APIs MPA1")
    public void sendGetAllAchievement1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllAchievement1());
    }

    @Step("I receive HTTP response code 200 for view Achievement")
    public void receiveAllAchievementResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view Achievement with invalid request method")
    public String setGetAllAchievement2(){
        return url;
    }

    @Step("I send POST for Achievement endpoint requests to connect to APIs MPA1")
    public void sendGetAllAchievement2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "Inovasi Terkini dalam Pengelolaan Sampah Kertas");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllAchievement2());
    }

    @Step("I receive HTTP response code 404 for view Achievement")
    public void receiveAllAchievementResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
