package UserPointAndVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ExchangePoint {
    protected String url = "https://api.recything.my.id/vouchers";
    protected String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDMwODgxNTgsImlkIjoiMDM2ODMwMTUtODE4Ny00MmM0LTkwMDItNGM4MzE1ZDk2ZmNjIiwicm9sZSI6IiJ9.UjC05FjOMM-WSI7pvEn-IMvfHOObBMKqxAfgubYgJpI";
    @Step("I set Post Exchange Point with Voucher Endpoint With Correct Data")
    public String setWrongExchangePointEndpointEndpoint() {
        return url;
    }

    @Step("I send Post Exchange Point with Voucher request")
    public void sendPostWrongExchangePointEndpointHttpRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id_voucher", "08404aaa-d201-4824-a8a0-d584bdac2dfa");
        requestBody.put("phone", "082298667543");

        SerenityRest.given()
                .header("Authorization",
                        token)
                .contentType("application/json").body(requestBody.toJSONString()).post(setWrongExchangePointEndpointEndpoint());
    }

    @Step("I receive Post Exchange Point with Voucher valid HTTP response code 201")
    public void receivePostExchangePointHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(201));
    }


    @Step("I set Put Exchange Point with Voucher Endpoint with Wrong HTTP Request")
    public String setWrongExchangePointEndpoint(){
        return url;
    }

    @Step("I send Put Exchange Point with Voucher HTTP request2")
    public void sendPutExchangePointHttpRequest2() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("id_voucher", "08404aaa-d201-4824-a8a0-d584bdac2dfa");
        requestBody.put("phone", "082298667543");

        SerenityRest.given()
                .header("Authorization",
                        token)
                .contentType("application/json").body(requestBody.toJSONString()).put(setWrongExchangePointEndpoint());
    }

    @Step("I receive Put Exchange Point with Voucher valid HTTP response code 404")
    public void receiveWrongPostExchangePointHttpResponseCode405(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I set Post Exchange Point with Voucher Endpoint With Wrong Body")
    public String setExchangePointApiEndpoint() {
        return url;
    }

    @Step("I send Post Exchange Point with Voucher HTTP request3")
    public void sendExchangePointHttpRequest3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id_voucher", "08404aaa-d201-4824-a8a0-d584bdac2dfa");
        requestBody.put("phones", "082298667543");

        SerenityRest.given()
                .header("Authorization",
                        token)
                .when()
                .post(setExchangePointApiEndpoint());

    }

    @Step("I receive Post Exchange Point with Voucher valid HTTP response code 400")
    public void validateExchangePointHttpResponseCode400() {

        restAssuredThat(response -> response.statusCode(400));
    }
}
