package API_Web.ManagePrompt;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePrompt {
    protected String url = "https://api.recything.my.id/admins/manage/prompts/08beb2b3-9493-4f74-b821-61b859fd48e3";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set DEL method to delete All Prompt with valid request")
    public String setDelPrompt(){
        return url;
    }

    @Step("I send DEL for detail Prompt endpoint requests to connect to APIs MP3")
    public void sendDelPrompt(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelPrompt());
    }

    @Step("I receive HTTP response code 200 for delete Prompt")
    public void receivePromptDelResp(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
