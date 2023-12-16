package API_Web.ManageVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllVoucher {
    protected String url = "https://api.recything.my.id/admins/manage/vouchers";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTA5MjQsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.jjc2bB4caqblO9F-jOapftdgU7k3kKBYuvsY7xgPgcs";

    @Step("I set GET method to view All Voucher with valid request")
    public String setAllVoucher1(){
        return url;
    }

    @Step("I send GET for All Voucher endpoint requests to connect to APIs MV1")
    public void sendAllVoucher1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setAllVoucher1());
    }

    @Step("I receive HTTP response code 200 for view All Voucher")
    public void receiveAllVoucherResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view All Voucher with invalid request method")
    public String setAllVoucher2(){
        return url;
    }

    @Step("I send POST for All Voucher endpoint requests to connect to APIs MV1")
    public void sendAllVoucher2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setAllVoucher2());
    }

    @Step("I receive HTTP response code 400 for view All Voucher")
    public void receiveAllVoucherResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
