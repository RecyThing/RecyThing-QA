package starter;

import Intro.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IntroSteps {
    @Steps
    Register register;

    @Given("I set POST Register Endpoint")
    public void setRegisterEndpoint() {
        register.setRegisterEndpoint();
    }

    @When("I send POST Register HTTP request")
    public void sendPostRegisterHttpRequest() {
        register.sendPostRegisterHttpRequest();
    }

    @Then("I receive POST Register valid HTTP response code 200")
    public void receivePostRegisterHttpResponseCode200() {
        register.receivePostRegisterHttpResponseCode200();
    }

    @Given("I set Get Register Endpoint With Wrong HTTP Request")
    public void setWrongRegisterEndpoint() {
        register.setWrongRegisterEndpoint();
    }

    @When("I send Get Register HTTP request2")
    public void sendGetRegisterHttpRequest2() {
        register.sendGetRegisterHttpRequest2();
    }

    @Then("I receive Get Register valid HTTP response code 405")
    public void receiveWrongPostRegisterHttpResponseCode405() {
        register.receiveWrongPostRegisterHttpResponseCode405();
    }

    @Given("I set POST Register Endpoint with Wrong Body")
    public void setRegisterApiEndpoint() {
        register.setWrongRegisterEndpoint();
    }

    @When("I send POST Register HTTP request3")
    public void sendRegisterHttpRequest3() {
        register.sendRegisterHttpRequest3();
    }

    @Then("I receive POST Register valid HTTP response code 400")
    public void validateRegisterHttpResponseCode400() {
        register.validateRegisterHttpResponseCode400();
    }
}
