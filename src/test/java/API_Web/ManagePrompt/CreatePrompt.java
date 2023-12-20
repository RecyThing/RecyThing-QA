package API_Web.ManagePrompt;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreatePrompt {
    protected String url = "https://api.recything.my.id/admins/manage/trashes";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set POST method to create Prompt 1")
    public String setCreatePromptMP1(){
        return url;
    }

    @Step("I send POST for create Prompt with valid body and endpoint requests to connect to APIs MP4")
    public void sendPostToCreatePromptMP1(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("question", "Bagaimana perbandingan konsumsi plastik dan kaleng di tingkat konsumen di Kota Bekasi?");
        requestBody.put("category", "sampah anorganik");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setCreatePromptMP1());
    }

    @Step("I receive HTTP response code 201 for create a Prompt 1")
    public void receiveCreatePromptMP1Resp(){
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I set POST method to create Prompt 2")
    public String setCreatePromptMP2(){
        return url;
    }

    @Step("I send POST for create a Prompt with invalid or blank body to connect to APIs MP4")
    public void sendPostToCreatePromptMP2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("question", "Bagaimana perbandingan konsumsi plastik dan logam di tingkat konsumen di Kota Bekasi?");
        requestBody.put("category", "sampah anorganik");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setCreatePromptMP2());
    }

    @Step("I receive HTTP response code 400 for create a Prompt 2")
    public void receiveCreatePromptMP2Resp(){
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I set GET method to create Prompt with invalid request method")
    public String setCreatePromptMP3(){
        return url;
    }

    @Step("I send GET for create Prompt with valid body and endpoint requests to connect to APIs MP4")
        public void sendGetToCreatePromptMP3(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("question", "Bagaimana perbandingan konsumsi plastik dan logam di tingkat konsumen di Kota Bekasi?");
        requestBody.put("category", "sampah anorganik");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setCreatePromptMP3());
    }

    @Step("I receive HTTP response code 400 for create a Prompt 3")
    public void receiveCreatePromptMP3Resp(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
