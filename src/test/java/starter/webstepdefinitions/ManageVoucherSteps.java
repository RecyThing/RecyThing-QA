package starter.webstepdefinitions;

import API_Web.ManageVoucher.DeleteVoucherByID;
import API_Web.ManageVoucher.GetAllVoucher;
import API_Web.ManageVoucher.GetDetailVoucher;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageVoucherSteps {

    @Steps
    GetAllVoucher MV1;

    @Steps
    GetDetailVoucher MV2;

    @Steps
    DeleteVoucherByID MV3;

    @Given("I set GET method to view All Voucher with valid request")
    public void setAllVoucherMV1(){
        MV1.setAllVoucher1();
    }

    @When("I send GET for All Voucher endpoint requests to connect to APIs MV1")
    public void sendAllVoucherMV1(){
        MV1.sendAllVoucher1();
    }

    @Then("I receive HTTP response code 200 for view All Voucher")
    public void receiveAllVoucherMV1(){
        MV1.receiveAllVoucherResp1();
    }

    @Given("I set POST method to view All Voucher with invalid request method")
    public void setAllVoucherMV2(){
        MV1.setAllVoucher2();
    }

    @When("I send POST for All Voucher endpoint requests to connect to APIs MV1")
    public void sendAllVoucherMV2(){
        MV1.sendAllVoucher2();
    }

    @Then("I receive HTTP response code 400 for view All Voucher")
    public void receiveAllVoucherMV2(){
        MV1.receiveAllVoucherResp2();
    }


    @Given("I set GET method to view detail Voucher with valid request")
    public void setDetailVoucherMV1(){
        MV2.setGetVoucher1();
    }

    @When("I send GET for detail Voucher endpoint requests to connect to APIs MV2")
    public void sendDetailVoucherMV1(){
        MV2.sendGetVoucher1();
    }

    @Then("I receive HTTP response code 200 for view detail Voucher")
    public void receiveDetailVoucherMV1(){
        MV2.receiveGetVoucherResp1();
    }

    @Given("I set POST method to view detail Voucher with invalid request method")
    public void setDetailVoucherMV2(){
        MV2.setGetVoucher2();
    }

    @When("I send POST for detail Voucher endpoint requests to connect to APIs MV2")
    public void sendDetailVoucherMV2(){
        MV2.sendGetVoucher2();
    }

    @Then("I receive HTTP response code 400 for view detail Voucher")
    public void receiveDetailVoucherMV2(){
        MV2.receiveGetVoucherResp2();
    }


    @Given("I set DEL method to delete All Voucher with valid request")
    public void setDelVoucherMV1(){
        MV3.setDelVoucher();
    }

    @When("I send DEL for detail Voucher endpoint requests to connect to APIs MV3")
    public void sendDelVoucherMV1(){
        MV3.sendDelVoucher();
    }

    @Then("I receive HTTP response code 200 for delete Voucher")
    public void receiveDelVoucherMV1(){
        MV3.receiveDelVoucherResp();
    }
}
