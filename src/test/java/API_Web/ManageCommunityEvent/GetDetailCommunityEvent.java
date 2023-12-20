package API_Web.ManageCommunityEvent;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailCommunityEvent {
    protected String url = "https://api.recything.my.id/admins/manage/event/5540bf99-f89e-4b98-9a64-c1bc7b46c68d/d9628c7e-99a6-43cb-8b3b-b2a1043c06d8";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view detail Community Event with valid request")
    public String setGetDetailCommunityEvent1(){
        return url;
    }

    @Step("I send GET for detail Community Event endpoint requests to connect to APIs CE2")
    public void sendGetDetailCommunityEvent1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetDetailCommunityEvent1());
    }

    @Step("I receive HTTP response code 200 for view detail Community Event")
    public void receiveGetDetailCommunityEvent1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Community Event with invalid request method")
    public String setGetDetailCommunityEvent2(){
        return url;
    }

    @Step("I send POST for detail Community Event endpoint requests to connect to APIs CE2")
    public void sendGetDetailCommunityEvent2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetDetailCommunityEvent2());
    }

    @Step("I receive HTTP response code 400 for view detail Community Event")
    public void receiveGetDetailCommunityEventResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
