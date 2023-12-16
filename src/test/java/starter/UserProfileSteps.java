package starter;

import UserProfile.EditUserProfile;
import UserProfile.ResetPassword;
import UserProfile.ViewUserProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserProfileSteps {
    @Steps
    ViewUserProfile vup;
    @Steps
    ResetPassword rp;
    @Steps
    EditUserProfile eup;
    @Given("I set Get View User Profile Endpoint With Correct Data")
    public void setGetViewUserProfile() {
        vup.setGetViewUserProfile();
    }

    @When("I send Get View User Profile request")
    public void sendGetViewUserProfile() {
        vup.sendGetViewUserProfile();
    }

    @Then("I receive Get View User Profile valid HTTP response code 200")
    public void receiveWrongGETtViewUserProfileResponseCode200() {
        vup.receiveWrongGETtViewUserProfileResponseCode200();
    }

    @Given("I set POST View User Profile Endpoint with Wrong HTTP Request")
    public void setViewUserProfileEndpoint() {
        vup.setViewUserProfileEndpoint();
    }

    @When("I send POST View User Profile HTTP request2")
    public void sendPostViewUserProfileHttpRequest() {
        vup.sendPostViewUserProfileHttpRequest();
    }

    @Then("I receive POST View User Profile valid HTTP response code 405")
    public void receivePostViewUserProfileHttpResponseCode405() {
        vup.receivePostViewUserProfileHttpResponseCode405();
    }


    @Given("I set Get View User Profile Endpoint With Wrong URL")
    public void setWrongViewUserProfileHTTP() {
        vup.setWrongViewUserProfileHTTP();
    }

    @When("I send Get View User Profile HTTP request3")
    public void sendGetViewUserProfileHttpRequest2() {
        vup.sendGetViewUserProfileHttpRequest2();
    }

    @Then("I receive Get View User Profile valid HTTP response code 404")
    public void receiveWrongPostViewUserProfileHttpResponseCode404() {
        vup.receiveWrongPostViewUserProfileHttpResponseCode404();
    }

    @Given("I set Patch Reset Password On Profile Endpoint With Correct Data")
    public void setRPOPPEndpoint1() {
        rp.setRPOPPEndpoint1();
    }

    @When("I send Patch Reset Password On Profile request")
    public void sendPatchRPOPPHttpRequest() {
        rp.sendPatchRPOPPHttpRequest();
    }

    @Then("I receive Patch Reset Password On Profile response code 200")
    public void receivePatchMakeRPOPPHttpResponseCode200() {
        rp.receivePatchMakeRPOPPHttpResponseCode200();
    }

    @Given("I set POST Reset Password On Profile Endpoint with Wrong HTTP Request")
    public void setRPOPPEndpoint() {
        rp.setRPOPPEndpoint();
    }

    @When("I send POST Reset Password On Profile HTTP request2")
    public void sendPostRPOPHttpRequest2() {
        rp.sendPostRPOPHttpRequest2();
    }

    @Then("I receive POST Reset Password On Profile valid HTTP response code 405")
    public void receivePostRPOPPHttpResponseCode405() {
        rp.receivePostRPOPPHttpResponseCode405();
    }

    @Given("I set Patch Reset Password On Profile Endpoint With Wrong URL")
    public void setRPOPPasswordApiEndpoint3() {
        rp.setRPOPPasswordApiEndpoint3();
    }

    @When("I send Patch Reset Password On Profile HTTP request3")
    public void sendRPOPPPasswordHttpRequest3() {
        rp.sendRPOPPPasswordHttpRequest3();
    }

    @Then("I receive Patch Reset Password On Profile valid HTTP response code 404")
    public void validateRPOPHttpResponseCode400() {
        rp.validateRPOPHttpResponseCode400();
    }

    @Given("I set Put Edit User Profile Endpoint With Correct Data")
    public void setEditUserProfileEndpoint1() {
        eup.setEditUserProfileEndpoint1();
    }

    @When("I send Put Edit User Profile request")
    public void sendPutEditUserProfileHttpRequest() {
        eup.sendPutEditUserProfileHttpRequest();
    }

    @Then("I receive Put Edit User Profile response code 200")
    public void receivePutEditUserProfileHttpResponseCode200() {
        eup.receivePutEditUserProfileHttpResponseCode200();
    }

    @Given("I set POST Edit User Profile Endpoint with Wrong HTTP Request")
    public void setEditUserProfileEndpoint() {
        eup.setEditUserProfileEndpoint();
    }

    @When("I send POST Edit User Profile HTTP request2")
    public void sendPostEditUserProfileHttpRequest2() {
        eup.sendPostEditUserProfileHttpRequest2();
    }

    @Then("I receive POST Edit User Profile valid HTTP response code 405")
    public void receivePostEditUserProfileHttpResponseCode405() {
        eup.receivePostEditUserProfileHttpResponseCode405();
    }

    @Given("I set Put Edit User Profile Endpoint With Wrong URL")
    public void setEditUserProfileApiEndpoint3() {
        eup.setEditUserProfileApiEndpoint3();
    }

    @When("I send Put Edit User Profile HTTP request3")
    public void sendEditUserProfileHttpRequest3() {
        eup.sendEditUserProfileHttpRequest3();
    }

    @Then("I receive Put Edit User Profile valid HTTP response code 404")
    public void validateEditUserProfileHttpResponseCode400() {
        eup.validateEditUserProfileHttpResponseCode400();
    }


}
