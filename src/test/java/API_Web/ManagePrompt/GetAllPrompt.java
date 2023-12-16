package API_Web.ManagePrompt;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllPrompt {
    protected String url = "https://api.recything.my.id/admins/manage/prompts";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";
    @Step("I set GET method to view All Prompt with valid request")
    public String setGetAllPrompt1(){
        return url;
    }

    @Step("I send GET for All Prompt endpoint requests to connect to APIs MP1")
    public void sendGetAllPrompt1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllPrompt1());
    }

    @Step("I receive HTTP response code 200 for view All Prompt")
    public void receiveAllPromptResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Prompt with invalid request method")
    public String setGetAllPrompt2(){
        return url;
    }

    @Step("I send POST for All Prompt endpoint requests to connect to APIs MP1")
    public void sendGetAllPrompt2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("question", "ini question?");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllPrompt2());
    }

    @Step("I receive HTTP response code 404 for view All Prompt")
    public void receiveAllPromptResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
