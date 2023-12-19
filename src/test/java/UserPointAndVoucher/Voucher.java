package UserPointAndVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Voucher {
    protected String url = "https://api.recything.my.id/vouchers";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwMTI5MTksImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.y_9b3osd5IkNPDlYca2yX3fvDpXqTRI3CFAnsnNjSWQ";
    @Step("I set Get Voucher Endpoint With Correct Data")
    public String setGetVoucher(){
        return url;
    }
    @Step("I send Get Voucher request")
    public void sendGetVoucher() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetVoucher());
    }

    @Step("I receive Get Voucher valid HTTP response code 200")
    public void receiveWrongGETVoucherResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set POST Voucher Endpoint with Wrong HTTP Request")
    public String setVoucherEndpoint() {
        return url;
    }

    @Step("I send POST Voucher HTTP request2")
    public void sendPostVoucherHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setVoucherEndpoint());
    }

    @Step("I receive POST Voucher valid HTTP response code 405")
    public void receivePostVoucherHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I set Get Voucher Endpoint With Wrong URL")
    public String setWrongVoucherURL(){
        return url + "mas";
    }
    @Step("I send Get Voucher HTTP request3")
    public void sendGetVouchersHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongVoucherURL());
    }

    @Step("I receive Get Voucher valid HTTP response code 404")
    public void receiveWrongGetVoucherURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
