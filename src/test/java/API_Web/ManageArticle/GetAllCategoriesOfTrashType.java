package API_Web.ManageArticle;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategoriesOfTrashType {
    protected String url = "https://api.recything.my.id/admins/manage/trashes/categories";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODkzNjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.CQsZuYpLDLVxep2nsdouOmwowHAuzhTMR1lamn_tZYM";

    @Step("I set GET method to view All Categories of Trash Type with valid request")
    public String setGetAllTrashType1(){
        return url;
    }

    @Step("I send GET for All Categories of Trash Type endpoint requests to connect to APIs MA1")
    public void sendGetAllTrashType1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetAllTrashType1());
    }

    @Step("I receive HTTP response code 200 for view All Categories of Trash Type")
    public void receiveAllTrashType1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Categories of Trash Type with invalid request method")
    public String setGetAllTrashType2(){
        return url;
    }

    @Step("I send POST for All Categories of Trash Type endpoint requests to connect to APIs MA1")
    public void sendGetAllTrashType2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("trash_type", "Tekstil");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setGetAllTrashType2());
    }

    @Step("I receive HTTP response code 404 for view All Categories of Trash Type")
    public void receiveAllTrashType2(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
