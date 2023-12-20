package API_Web.ManagePrompt;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailPrompt {
    protected String url = "https://api.recything.my.id/admins/manage/prompts/be4ea6ad-2d9c-4e2e-82ad-bd3fdaae158e";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view detail Prompt with valid request")
    public String setGetPrompt1(){
        return url;
    }

    @Step("I send GET for detail Prompt endpoint requests to connect to APIs MP2")
    public void sendGetPrompt1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetPrompt1());
    }

    @Step("I receive HTTP response code 200 for view detail Prompt")
    public void receivePromptResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Prompt with invalid request method")
    public String setGetPrompt2(){
        return url;
    }

    @Step("I send POST for detail Prompt endpoint requests to connect to APIs MP2")
    public void sendGetPrompt2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("id", "6b128e58-1899-4c35-914b-79fbe06dfca5");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetPrompt2());
    }

    @Step("I receive HTTP response code 404 for view detail Prompt")
    public void receivePromptResp2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
