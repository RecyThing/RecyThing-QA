package API_Web.ManageTrashCategory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateTrashCategory {
    protected String url = "https://api.recything.my.id/admins/manage/trashes";
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set POST method to create Trash Category 1")
    public String setCreateTC1(){
        return url;
    }

    @Step("I send POST for create Trash Category with valid body and endpoint requests to connect to APIs MTC1")
    public void sendPostToCreateTC1(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("trash_type", "Kerdus");
        requestBody.put("unit", "kilogram");
        requestBody.put("point", 1000);

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setCreateTC1());
    }

    @Step("I receive HTTP response code 201 for create a Trash Category")
    public void receiveCreateTCResp1(){
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I set POST method to create Trash Category 2")
    public String setCreateTC2(){
        return url;
    }

    @Step("I send POST for create a Trash Category with invalid or blank body to connect to APIs MTC1")
    public void sendPostToCreateTC2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("trash_type", "testTC2");
        requestBody.put("unit", "");
        requestBody.put("point", 10);

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setCreateTC2());
    }

    @Step("I receive HTTP response code 400 for create a Trash Category 2")
    public void receiveCreateTCResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I set GET method to create Trash Category with invalid request method")
    public String setCreateTC3(){
        return url;
    }

    @Step("I send GET for create Trash Category with valid body and endpoint requests to connect to APIs MTC1")
        public void sendGetToCreateTC3(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("trash_type", "testTC3");
        requestBody.put("unit", "kilogram");
        requestBody.put("point", 10);

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setCreateTC3());
    }

    @Step("I receive HTTP response code 400 for create a Trash Category 3")
    public void receiveCreateTCResp3(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
