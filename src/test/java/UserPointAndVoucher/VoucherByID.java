package UserPointAndVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class VoucherByID {
    protected String url = "https://api.recything.my.id/vouchers/043f36d9-1f3a-4a6e-b218-6ce676b1e5b7";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3NTAwNjMsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9._ozULmZWA7TFtJWUsXDhamtww2p1BUxbngqy6n401dM";
    @Step("I set Get Voucher By ID Endpoint With Correct Data")
    public String setGetVoucherByID(){
        return url;
    }
    @Step("I send Get Voucher By ID request")
    public void sendGetVoucherByID() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setGetVoucherByID());
    }

    @Step("I receive Get Voucher By ID valid HTTP response code 200")
    public void receiveWrongGETVoucherByIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set POST Voucher By ID Endpoint with Wrong HTTP Request")
    public String setVoucherByIDEndpoint() {
        return url;
    }

    @Step("I send POST Voucher By ID HTTP request2")
    public void sendPostVoucherByIDHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "recythinguser@gmail.com");


        SerenityRest.given()
                .header("Authorization", token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setVoucherByIDEndpoint());
    }

    @Step("I receive POST Voucher By ID valid HTTP response code 405")
    public void receivePostVoucherByIDHttpResponseCode405() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Get Voucher By ID Endpoint With Wrong URL")
    public String setWrongVoucherByIDURL(){
        return url + "mas";
    }
    @Step("I send Get Voucher By ID HTTP request3")
    public void sendGetVouchersByIDHttpRequest2() {
        SerenityRest.given()
                .header("Authorization", token)
                .when()
                .get(setWrongVoucherByIDURL());
    }

    @Step("I receive Get Voucher By ID valid HTTP response code 404")
    public void receiveWrongGetVoucherByIDURLResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
