package starter;

import UserPointAndVoucher.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PointAndVoucherSteps {
    @Steps
    Voucher vo;
    @Steps
    VoucherByID vob;
    @Steps
    ClaimDailyPoint cdp;
    @Steps
    ExchangePoint ep;
    @Steps
    GetAllHistoryByID gahbi;
    @Steps
    GetAllHistory gah;
    @Steps
    ViewClaimedDaily vcd;


    @Given("I set Get Voucher Endpoint With Correct Data")
    public void setGetVoucher() {
        vo.setGetVoucher();
    }

    @When("I send Get Voucher request")
    public void sendGetVoucher() {
        vo.sendGetVoucher();
    }

    @Then("I receive Get Voucher valid HTTP response code 200")
    public void receiveWrongGETVoucherResponseCode200(){
        vo.receiveWrongGETVoucherResponseCode200();}

    @Given("I set POST Voucher Endpoint with Wrong HTTP Request")
    public void setVoucherEndpoint() {
        vo.setVoucherEndpoint();
    }

    @When("I send POST Voucher HTTP request2")
    public void sendPostVoucherHttpRequest() {
        vo.sendPostVoucherHttpRequest();
    }

    @Then("I receive POST Voucher valid HTTP response code 405")
    public void receivePostVoucherHttpResponseCode405(){
        vo.receivePostVoucherHttpResponseCode405();}

    @Given("I set Get Voucher Endpoint With Wrong URL")
    public void setWrongVoucherURL() {
        vo.setWrongVoucherURL();
    }

    @When("I send Get Voucher HTTP request3")
    public void sendGetVouchersHttpRequest2() {
        vo.sendGetVouchersHttpRequest2();
    }

    @Then("I receive Get Voucher valid HTTP response code 404")
    public void receiveWrongGetVoucherURLResponseCode404(){
        vo.receiveWrongGetVoucherURLResponseCode404();}

    @Given("I set Get Voucher By ID Endpoint With Correct Data")
    public void setGetVoucherByID() {
        vob.setGetVoucherByID();
    }

    @When("I send Get Voucher By ID request")
    public void sendGetVoucherByID() {
        vob.sendGetVoucherByID();
    }

    @Then("I receive Get Voucher By ID valid HTTP response code 200")
    public void receiveWrongGETVoucherByIDResponseCode200(){
        vob.receiveWrongGETVoucherByIDResponseCode200();}

    @Given("I set POST Voucher By ID Endpoint with Wrong HTTP Request")
    public void setVoucherByIDEndpoint() {
        vob.setVoucherByIDEndpoint();
    }

    @When("I send POST Voucher By ID HTTP request2")
    public void sendPostVoucherByIDHttpRequest() {
        vob.sendPostVoucherByIDHttpRequest();
    }

    @Then("I receive POST Voucher By ID valid HTTP response code 405")
    public void receivePostVoucherByIDHttpResponseCode405(){
        vob.receivePostVoucherByIDHttpResponseCode405();}

    @Given("I set Get Voucher By ID Endpoint With Wrong URL")
    public void setWrongVoucherByIDURL() {
        vob.setWrongVoucherByIDURL();
    }

    @When("I send Get Voucher By ID HTTP request3")
    public void sendGetVouchersByIDHttpRequest2() {
        vob.sendGetVouchersByIDHttpRequest2();
    }

    @Then("I receive Get Voucher By ID valid HTTP response code 404")
    public void receiveWrongGetVoucherByIDURLResponseCode404(){
        vob.receiveWrongGetVoucherByIDURLResponseCode404();}

    @Given("I set Post Claim Daily Point Endpoint With Correct Data")
    public void setClaimDailyPointEndpoint() {
        cdp.setClaimDailyPointEndpoint();
    }

    @When("I send Post Claim Daily Point request")
    public void sendPostClaimDailyPointHttpRequest() {
        cdp.sendPostClaimDailyPointHttpRequest();
    }

    @Then("I receive Post Claim Daily Point valid HTTP response code 201")
    public void receivePostClaimDailyPointHttpResponseCode201(){
        cdp.receivePostClaimDailyPointHttpResponseCode201();}

    @Given("I set Get Claim Daily Point Endpoint with Wrong HTTP Request")
    public void setWrongClaimDailyPointEndpoint() {
        cdp.setWrongClaimDailyPointEndpoint();
    }

    @When("I send Get Claim Daily Point HTTP request2")
    public void sendGetClaimDailyPointHttpRequest2() {
        cdp.sendGetClaimDailyPointHttpRequest2();
    }

    @Then("I receive Get Claim Daily Point valid HTTP response code 403")
    public void receiveWrongGetClaimDailyPointHttpResponseCode405(){
        cdp.receiveWrongGetClaimDailyPointHttpResponseCode405();}

    @Given("I set Get Claim Daily Point Endpoint With Wrong Body")
    public void setClaimDailyPointApiEndpoint() {
        cdp.setClaimDailyPointApiEndpoint();
    }

    @When("I send Get Claim Daily Point HTTP request3")
    public void sendClaimDailyPointHttpRequest3() {
        cdp.sendClaimDailyPointHttpRequest3();
    }

    @Then("I receive Get Claim Daily Point valid HTTP response code 400")
    public void validatClaimDailyPointHttpResponseCode400(){
        cdp.validatClaimDailyPointHttpResponseCode400();}

    @Given("I set Post Exchange Point with Voucher Endpoint With Correct Data")
    public void setWrongExchangePointEndpointEndpoint() {
        ep.setWrongExchangePointEndpointEndpoint();
    }

    @When("I send Post Exchange Point with Voucher request")
    public void sendPostWrongExchangePointEndpointHttpRequest() {
        ep.sendPostWrongExchangePointEndpointHttpRequest();
    }

    @Then("I receive Post Exchange Point with Voucher valid HTTP response code 201")
    public void receivePostExchangePointHttpResponseCode200(){
        ep.receivePostExchangePointHttpResponseCode200();}

    @Given("I set Put Exchange Point with Voucher Endpoint with Wrong HTTP Request")
    public void setWrongExchangePointEndpoint() {
        ep.setWrongExchangePointEndpoint();
    }

    @When("I send Put Exchange Point with Voucher HTTP request2")
    public void sendPutExchangePointHttpRequest2() {
        ep.sendPutExchangePointHttpRequest2();
    }

    @Then("I receive Put Exchange Point with Voucher valid HTTP response code 404")
    public void receiveWrongPostExchangePointHttpResponseCode405(){
        ep.receiveWrongPostExchangePointHttpResponseCode405();}

    @Given("I set Post Exchange Point with Voucher Endpoint With Wrong Body")
    public void setExchangePointApiEndpoint() {
        ep.setExchangePointApiEndpoint();
    }

    @When("I send Post Exchange Point with Voucher HTTP request3")
    public void sendExchangePointHttpRequest3() {
        ep.sendExchangePointHttpRequest3();
    }

    @Then("I receive Post Exchange Point with Voucher valid HTTP response code 400")
    public void validateExchangePointHttpResponseCode400(){
        ep.validateExchangePointHttpResponseCode400();}

    @Given("I set Get All History By ID Endpoint With Correct Data")
    public void setGetSeeAllHistoryByID() {
        gahbi.setGetSeeAllHistoryByID();
    }

    @When("I send Get All History By ID request")
    public void sendGetSeeAllHistoryByID() {
        gahbi.sendGetSeeAllHistoryByID();
    }

    @Then("I receive Get All History By ID valid HTTP response code 200")
    public void receiveWrongGETAllHistoryByIDResponseCode200(){
        gahbi.receiveWrongGETAllHistoryByIDResponseCode200();}

    @Given("I set POST All History By ID Endpoint with Wrong HTTP Request")
    public void setSeeAllHistoryByIDEndpoint() {
        gahbi.setSeeAllHistoryByIDEndpoint();
    }

    @When("I send POST All History By ID HTTP request2")
    public void sendPostSeeAllHistoryByIDHttpRequest() {
        gahbi.sendPostSeeAllHistoryByIDHttpRequest();
    }

    @Then("I receive POST All History By ID valid HTTP response code 405")
    public void receivePostSeeAllHistoryByIDHttpResponseCode405(){
        gahbi.receivePostSeeAllHistoryByIDHttpResponseCode405();}

    @Given("I set Get All History By ID Endpoint With Wrong URL")
    public void setWrongSeeAllHistoryByIDURL() {
        gahbi.setWrongSeeAllHistoryByIDURL();
    }

    @When("I send Get All History By ID HTTP request3")
    public void sendGetSeeAllHistoryByIDHttpRequest2() {
        gahbi.sendGetSeeAllHistoryByIDHttpRequest2();
    }

    @Then("I receive Get All History By ID valid HTTP response code 404")
    public void receiveWrongGetAllHistoryByIDResponseCode404(){
        gahbi.receiveWrongGetAllHistoryByIDResponseCode404();}

    @Given("I set Get All History Endpoint With Correct Data")
    public void setGetSeeAllHistory() {
        gah.setGetSeeAllHistory();
    }

    @When("I send Get All History request")
    public void sendGetSeeAllHistory() {
        gah.sendGetSeeAllHistory();
    }

    @Then("I receive Get All History valid HTTP response code 200")
    public void receiveWrongGETAllHistoryResponseCode200(){
        gah.receiveWrongGETAllHistoryResponseCode200();}

    @Given("I set POST All History Endpoint with Wrong HTTP Request")
    public void setSeeAllHistoryEndpoint() {
        gah.setSeeAllHistoryEndpoint();
    }

    @When("I send POST All History HTTP request2")
    public void sendPostSeeAllHistoryHttpRequest() {
        gah.sendPostSeeAllHistoryHttpRequest();
    }

    @Then("I receive POST All History valid HTTP response code 405")
    public void receivePostSeeAllHistoryHttpResponseCode405(){
        gah.receivePostSeeAllHistoryHttpResponseCode405();}

    @Given("I set Get All History Endpoint With Wrong URL")
    public void setWrongSeeAllHistoryURL() {
        gah.setWrongSeeAllHistoryURL();
    }

    @When("I send Get All History HTTP request3")
    public void sendGetSeeAllHistoryHttpRequest2() {
        gah.sendGetSeeAllHistoryHttpRequest2();
    }

    @Then("I receive Get All History valid HTTP response code 404")
    public void receiveWrongGetAllHistoryResponseCode404(){
        gah.receiveWrongGetAllHistoryResponseCode404();}

    @Given("I set Get Claimed Point Endpoint With Correct Data")
    public void setGetSeeClaimedPoint() {
        vcd.setGetSeeClaimedPoint();
    }

    @When("I send Get Claimed Point request")
    public void sendGetSeeClaimedPoint() {
        vcd.sendGetSeeClaimedPoint();
    }

    @Then("I receive Get Claimed Point valid HTTP response code 200")
    public void receiveWrongGETClaimedPointResponseCode200(){
        vcd.receiveWrongGETClaimedPointResponseCode200();}

    @Given("I set POST Claimed Point Endpoint with Wrong HTTP Request")
    public void setSeeClaimedPointEndpoint() {
        vcd.setSeeClaimedPointEndpoint();
    }

    @When("I send POST Claimed Point HTTP request2")
    public void sendPostSeeClaimedPointHttpRequest() {
        vcd.sendPostSeeClaimedPointHttpRequest();
    }

    @Then("I receive POST Claimed Point valid HTTP response code 405")
    public void receivePostSeeClaimedPointHttpResponseCode405(){
        vcd.receivePostSeeClaimedPointHttpResponseCode405();}

    @Given("I set Get Claimed Point Endpoint With Wrong URL")
    public void setWrongSeeClaimedPointURL() {
        vcd.setWrongSeeClaimedPointURL();
    }

    @When("I send Get Claimed Point HTTP request3")
    public void sendGetSeeClaimedPointHttpRequest2() {
        vcd.sendGetSeeClaimedPointHttpRequest2();
    }

    @Then("I receive Get Claimed Point valid HTTP response code 404")
    public void receiveWrongGetClaimedPointResponseCode404(){
        vcd.receiveWrongGetClaimedPointResponseCode404();}
}
