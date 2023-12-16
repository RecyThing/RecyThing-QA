package API_Web.ManageCommunity;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCommunity {
    protected String url = "https://api.recything.my.id/admins/manage/communities/4d0c2e5d-48d3-4374-adae-bcca1fc9df99";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";

    @Step("I set DEL method to delete Community with valid request")
    public String setDelCommunityByID(){
        return url;
    }

    @Step("I send DEL for detail Community endpoint requests to connect to APIs C3")
    public void sendDelCommunityByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelCommunityByID());
    }

    @Step("I receive HTTP response code 200 for delete Community")
    public void receiveDelCommunityByIDResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
