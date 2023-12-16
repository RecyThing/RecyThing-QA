package starter.webstepdefinitions;

import API_Web.ManageArticle.DeleteArticleByID;
import API_Web.ManageArticle.GetAllArticle;
import API_Web.ManageArticle.GetAllCategoriesOfTrashType;
import API_Web.ManageArticle.GetDetailArticle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ManageArticleSteps {
    @Steps
    GetAllCategoriesOfTrashType MA1;

    @Steps
    GetAllArticle MA2;

    @Steps
    GetDetailArticle MA3;

    @Steps
    DeleteArticleByID MA4;

    @Given("I set GET method to view All Categories of Trash Type with valid request")
    public void setCategoriesMA1(){
        MA1.setGetAllTrashType1();
    }

    @When("I send GET for All Categories of Trash Type endpoint requests to connect to APIs MA1")
    public void sendCategoriesMA1(){
        MA1.sendGetAllTrashType1();
    }

    @Then("I receive HTTP response code 200 for view All Categories of Trash Type")
    public void receiveCategoriesMA1(){
        MA1.receiveAllTrashType1();
    }

    @Given("I set POST method to view All Categories of Trash Type with invalid request method")
    public void setCategoriesMA2(){
        MA1.setGetAllTrashType2();
    }

    @When("I send POST for All Categories of Trash Type endpoint requests to connect to APIs MA1")
    public void sendCategoriesMA2(){
        MA1.sendGetAllTrashType2();
    }

    @Then("I receive HTTP response code 404 for view All Categories of Trash Type")
    public void receiveCategoriesMA2(){
        MA1.receiveAllTrashType2();
    }


    @Given("I set GET method to view All Article with valid request")
    public void setAllArticleMA1(){
        MA2.setGetAllArticle1();
    }

    @When("I send GET for All Article endpoint requests to connect to APIs MA2")
    public void sendAllArticleMA1(){
        MA2.sendGetAllArticle1();
    }

    @Then("I receive HTTP response code 200 for view All Article")
    public void receiveAllArticleMA1(){
        MA2.receiveAllArticleResp1();
    }

    @Given("I set POST method to view All Article with invalid request method")
    public void setAllArticleMA2(){
        MA2.setGetAllArticle2();
    }

    @When("I send POST for All Article endpoint requests to connect to APIs MA2")
    public void sendAllArticleMA2(){
        MA2.sendGetAllArticle2();
    }

    @Then("I receive HTTP response code 400 for view All Article")
    public void receiveAllArticleMA2(){
        MA2.receiveAllArticleResp2();
    }


    @Given("I set GET method to view detail Article with valid request")
    public void setDetailArticleMA1(){
        MA3.setGetArticle1();
    }

    @When("I send GET for detail Article endpoint requests to connect to APIs MA3")
    public void sendDetailArticleMA1(){
        MA3.sendGetArticle1();
    }

    @Then("I receive HTTP response code 200 for view detail Article")
    public void receiveDetailArticleMA1(){
        MA3.receiveGetArticleResp1();
    }

    @Given("I set POST method to view detail Article with invalid request method")
    public void setDetailArticleMA2(){
        MA3.setGetArticle2();
    }

    @When("I send POST for detail Article endpoint requests to connect to APIs MA3")
    public void sendDetailArticleMA2(){
        MA3.sendGetArticle2();
    }

    @Then("I receive HTTP response code 400 for view detail Article")
    public void receiveDetailArticleMA2(){
        MA3.receiveGetArticleResp2();
    }


    @Given("I set DEL method to delete All Article with valid request")
    public void setDelArticleMA1(){
        MA4.setDelArticle();
    }

    @When("I send DEL for detail Article endpoint requests to connect to APIs MA4")
    public void sendDelArticleMA1(){
        MA4.sendDelArticle();
    }

    @Then("I receive HTTP response code 200 for delete Article")
    public void receiveDelArticleMA1(){
        MA4.receiveArticleDelResp();
    }
}
