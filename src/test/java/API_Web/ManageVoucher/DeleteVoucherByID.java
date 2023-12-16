package API_Web.ManageVoucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteVoucherByID {
    protected String url = "https://api.recything.my.id/admins/manage/vouchers/9ff91237-3ab3-411e-8710-b2a9a229689e";

    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI3Mjg2MjAsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.Y20Fgr2wbMcL2PbZNlk0B14WYSIxSDi8ULePxvMcnwY";

    @Step("I set DEL method to delete All Voucher with valid request")
    public String setDelVoucher(){
        return url;
    }

    @Step("I send DEL for detail Voucher endpoint requests to connect to APIs MV3")
    public void sendDelVoucher(){
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .when().delete(setDelVoucher());
    }

    @Step("I receive HTTP response code 200 for delete Voucher")
    public void receiveDelVoucherResp(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
