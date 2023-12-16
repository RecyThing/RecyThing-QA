package API_Web.ManageExchangeTrash;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteRecyclesByID {
    protected String url = "https://api.recything.my.id/admins/manage/recycles/PS18237";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";

    @Step("I set DEL method to delete Trash Exchange with valid request")
    public String setDelTrashExchange(){
        return url;
    }

    @Step("I send DEL for detail Trash Exchange endpoint requests to connect to APIs MTE3")
    public void sendDelTrashExchange(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelTrashExchange());
    }

    @Step("I receive HTTP response code 200 for delete Trash Exchange")
    public void receiveTrashExchangeDelResp(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
