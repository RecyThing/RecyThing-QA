package API_Web.ManageCommunityEvent;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCommunityEvent {
    protected String url = "https://api.recything.my.id/admins/manage/event/5540bf99-f89e-4b98-9a64-c1bc7b46c68d";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Community Event with valid request")
    public String setGetAllCommunityEvent1(){
        return url;
    }

    @Step("I send GET for All Community Event endpoint requests to connect to APIs CE1")
    public void sendGetAllCommunityEvent1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllCommunityEvent1());
    }

    @Step("I receive HTTP response code 200 for view All Community Event")
    public void receiveAllCommunityEventResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Community Event with invalid request method")
    public String setGetAllCommunityEvent2(){
        return url;
    }

    @Step("I send POST for All Community Event endpoint requests to connect to APIs CE1")
    public void sendGetAllCommunityEvent2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllCommunityEvent2());
    }

    @Step("I receive HTTP response code 400 for view All Community Event")
    public void receiveAllCommunityEventResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
