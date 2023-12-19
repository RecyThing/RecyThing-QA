package API_Web.ManageVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDetailVoucher {
    protected String url = "https://api.recything.my.id/admins/manage/vouchers/3b6ce01a-2b67-4da2-9d88-6cc6006d5315";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMjU3OTYsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Te2WTF9iniKdPzUYC6iCbGN0FPi7sNwshcascO_Qs2o";

    @Step("I set GET method to view detail Voucher with valid request")
    public String setGetVoucher1(){
        return url;
    }

    @Step("I send GET for detail Voucher endpoint requests to connect to APIs MV2")
    public void sendGetVoucher1(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().get(setGetVoucher1());
    }

    @Step("I receive HTTP response code 200 for view detail Voucher")
    public void receiveGetVoucherResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST method to view detail Voucher with invalid request method")
    public String setGetVoucher2(){
        return url;
    }

    @Step("I send POST for detail Voucher endpoint requests to connect to APIs MV2")
    public void sendGetVoucher2(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "Made in Taksa");

        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .contentType("application/json").body(requestBody.toJSONString()).get(setGetVoucher2());
    }

    @Step("I receive HTTP response code 400 for view detail Voucher")
    public void receiveGetVoucherResp2(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
