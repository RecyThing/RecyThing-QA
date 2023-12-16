package starter.webstepdefinitions;

import API_Web.ManagePrompt.CreatePrompt;
import API_Web.ManagePrompt.DeletePrompt;
import API_Web.ManagePrompt.GetAllPrompt;
import API_Web.ManagePrompt.GetDetailPrompt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManagePromptSteps {
    @Steps
    GetAllPrompt MP1;

    @Steps
    GetDetailPrompt MP2;

    @Steps
    DeletePrompt MP3;

    @Steps
    CreatePrompt MP4;

    @Given("I set GET method to view All Prompt with valid request")
    public void setAllPromptAPIs1(){
        MP1.setGetAllPrompt1();
    }

    @When("I send GET for All Prompt endpoint requests to connect to APIs MP1")
    public void sendAllPromptAPIs1(){
        MP1.sendGetAllPrompt1();
    }

    @Then("I receive HTTP response code 200 for view All Prompt")
    public void receiveAllPromptAPIs1(){
        MP1.receiveAllPromptResp1();
    }

    @Given("I set POST method to view All Prompt with invalid request method")
    public void setAllPromptAPIs2(){
        MP1.setGetAllPrompt2();
    }

    @When("I send POST for All Prompt endpoint requests to connect to APIs MP1")
    public void sendAllPromptAPIs2(){
        MP1.sendGetAllPrompt2();
    }

    @Then("I receive HTTP response code 404 for view All Prompt")
    public void receiveAllPromptAPIs2(){
        MP1.receiveAllPromptResp2();
    }

    @Given("I set GET method to view detail Prompt with valid request")
    public void setDetailPromptAPIs1(){
        MP2.setGetPrompt1();
    }

    @When("I send GET for detail Prompt endpoint requests to connect to APIs MP2")
    public void sendDetailPromptAPIs1(){
        MP2.sendGetPrompt1();
    }

    @Then("I receive HTTP response code 200 for view detail Prompt")
    public void receiveDetailPromptAPIs1(){
        MP2.receivePromptResp1();
    }

    @Given("I set POST method to view detail Prompt with invalid request method")
    public void setDetailPromptAPIs2(){
        MP2.setGetPrompt2();
    }

    @When("I send POST for detail Prompt endpoint requests to connect to APIs MP2")
    public void sendDetailPromptAPIs2(){
        MP2.sendGetPrompt2();
    }

    @Then("I receive HTTP response code 404 for view detail Prompt")
    public void receiveDetailPromptAPIs2(){
        MP2.receivePromptResp2();
    }

    @Given("I set DEL method to delete All Prompt with valid request")
    public void setDelPromptAPIs(){
        MP3.setDelPrompt();
    }

    @When("I send DEL for detail Prompt endpoint requests to connect to APIs MP3")
    public void sendDelPromptAPIs(){
        MP3.sendDelPrompt();
    }

    @Then("I receive HTTP response code 200 for delete Prompt")
    public void receiveDelPromptAPIs(){
        MP3.receivePromptDelResp();
    }


    @Given("I set POST method to create Prompt 1")
    public void setCreateMP1(){
        MP4.setCreatePromptMP1();
    }

    @When("I send POST for create Prompt with valid body and endpoint requests to connect to APIs MP4")
    public void sendCreateMP1(){
        MP4.sendPostToCreatePromptMP1();
    }

    @Then("I receive HTTP response code 201 for create a Prompt 1")
    public void receiveCreateMP1(){
        MP4.receiveCreatePromptMP1Resp();
    }

    @Given("I set POST method to create Prompt 2")
    public void setCreateMP2(){
        MP4.setCreatePromptMP2();
    }

    @When("I send POST for create a Prompt with invalid or blank body to connect to APIs MP4")
    public void sendCreateMP2(){
        MP4.sendPostToCreatePromptMP2();
    }

    @Then("I receive HTTP response code 400 for create a Prompt 2")
    public void receiveCreateMP2(){
        MP4.receiveCreatePromptMP2Resp();
    }

    @Given("I set GET method to create Prompt with invalid request method")
    public void setCreateMP3(){
        MP4.setCreatePromptMP3();
    }

    @When("I send GET for create Prompt with valid body and endpoint requests to connect to APIs MP4")
    public void sendCreateMP3(){
        MP4.sendGetToCreatePromptMP3();
    }

    @Then("I receive HTTP response code 400 for create a Prompt 3")
    public void receiveCreateMP3(){
        MP4.receiveCreatePromptMP3Resp();
    }
}
