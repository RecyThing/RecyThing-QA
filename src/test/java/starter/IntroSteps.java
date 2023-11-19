package starter;

import Intro.ForgotPassword;
import Intro.Login;
import Intro.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IntroSteps {
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    ForgotPassword fp;

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

    @Given("I set POST Login Endpoint")
    public void setLoginEndpoint() {
        login.setLoginEndpoint();
    }

    @When("I send POST Login HTTP request")
    public void sendPostLoginHttpRequest() {
        login.sendPostLoginHttpRequest();
    }

    @Then("I receive POST Login valid HTTP response code 200")
    public void receivePostLoginHttpResponseCode200() {
        login.receivePostLoginHttpResponseCode200();
    }

    @Given("I set Get Login Endpoint With Wrong HTTP Request")
    public void setWrongLoginEndpoint() {
        login.setWrongLoginEndpoint();
    }

    @When("I send Get Login HTTP request2")
    public void sendGetLoginHttpRequest2() {
        login.sendGetLoginHttpRequest2();
    }

    @Then("I receive Get Login valid HTTP response code 405")
    public void receiveWrongPostLoginHttpResponseCode405() {
        login.receiveWrongPostLoginHttpResponseCode405();
    }

    @Given("I set POST Login Endpoint with Wrong Body")
    public void setLoginApiEndpoint() {
        login.setLoginApiEndpoint();
    }

    @When("I send POST Login HTTP request3")
    public void sendLoginHttpRequest3() {
        login.sendLoginHttpRequest3();
    }

    @Then("I receive POST Login valid HTTP response code 400")
    public void validateLoginHttpResponseCode400(){
        login.validateLoginHttpResponseCode400();
    }

    @Given("I set POST Reset Password Endpoint")
    public void setResetPasswordEndpoint() {
        fp.setResetPasswordEndpoint();
    }

    @When("I send POST Reset Password request")
    public void sendPostResetPasswordHttpRequest() {
        fp.sendPostResetPasswordHttpRequest();
    }

    @Then("I receive POST Reset Password HTTP response code 200")
    public void receivePostResetPasswordHttpResponseCode200(){
        fp.receivePostResetPasswordHttpResponseCode200();
    }

    @Given("I set Get Reset Password with Wrong HTTP Request")
    public void setWrongResetPasswordHTTP() {
        fp.setWrongResetPasswordHTTP();
    }

    @When("I send Get Reset Password HTTP request2")
    public void sendGetResetPasswordHttpRequest2() {
        fp.sendGetResetPasswordHttpRequest2();
    }

    @Then("I receive Get Reset Password valid HTTP response code 405")
    public void receiveWrongPostResetPasswordHttpResponseCode405(){
        fp.receiveWrongPostResetPasswordHttpResponseCode405();
    }

    @Given("I set POST Reset Password with Wrong Body")
    public void setResetPasswordApiEndpoint() {
        fp.setResetPasswordApiEndpoint();
    }

    @When("I send POST Reset Password HTTP request3")
    public void sendResetPasswordHttpRequest3() {
        fp.sendResetPasswordHttpRequest3();
    }

    @Then("I receive POST Reset Password valid HTTP response code 400")
    public void validateResetPasswordHttpResponseCode400(){
        fp.validateResetPasswordHttpResponseCode400();
    }
}
