package starter;

import ArticleFolder.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ArticleSteps {
    @Steps
    Article ar;
    @Steps
    ArticleByID arbi;
    @Steps
    GetAllCategoryTrash gact;
    @Steps
    GetTrashDetail gtd;
    @Steps
    ViewPopularArticle vpa;
    @Steps
    LikeArticlesByID labi;


    @Given("I set Get Article Endpoint With Correct Data")
    public void setGetArticles() {
        ar.setGetArticles();
    }

    @When("I send Get Article request")
    public void sendGetArticles() {
        ar.sendGetArticles();
    }

    @Then("I receive Get Article valid HTTP response code 200")
    public void receiveWrongGETArticlesResponseCode200(){
        ar.receiveWrongGETArticlesResponseCode200();
    }

    @Given("I set POST Article Endpoint with Wrong HTTP Request")
    public void setArticlesEndpoint() {
        ar.setArticlesEndpoint();
    }

    @When("I send POST Article HTTP request2")
    public void sendPostArticlesHttpRequest() {
        ar.sendPostArticlesHttpRequest();
    }

    @Then("I receive POST Article valid HTTP response code 404")
    public void receivePostArticlesHttpResponseCode405(){
        ar.receivePostArticlesHttpResponseCode405();
    }

    @Given("I set Get Article Endpoint With Wrong URL")
    public void setWrongArticlesURL() {
        ar.setGetArticles();
    }

    @When("I send Get Article HTTP request3")
    public void sendGetArticlesHttpRequest2() {
        ar.sendGetArticlesHttpRequest2();
    }

    @Then("I receive Get Article valid HTTP response code 404")
    public void receiveWrongGetArtcilesURLResponseCode404(){
        ar.receiveWrongGetArtcilesURLResponseCode404();
    }

    @Given("I set Get Article By ID Endpoint With Correct Data")
    public void setGetArticlesByID() {
        arbi.setGetArticlesByID();
    }

    @When("I send Get Article By ID request")
    public void sendGetArticlesByID() {
        arbi.sendGetArticlesByID();
    }

    @Then("I receive Get Article By ID valid HTTP response code 200")
    public void receiveWrongGETArticlesByIDResponseCode200(){
        arbi.receiveWrongGETArticlesByIDResponseCode200();}

    @Given("I set POST Article By ID Endpoint with Wrong HTTP Request")
    public void setArticlesByIDEndpoint() {
        arbi.setArticlesByIDEndpoint();
    }

    @When("I send POST Article By ID HTTP request2")
    public void sendPostArticlesByIDHttpRequest() {
        arbi.sendPostArticlesByIDHttpRequest();
    }

    @Then("I receive POST Article By ID valid HTTP response code 405")
    public void receivePostArticlesByIDHttpResponseCode405(){
        arbi.receivePostArticlesByIDHttpResponseCode405();}

    @Given("I set Get Article By ID Endpoint With Wrong URL")
    public void setWrongArticlesByIDURL() {
        arbi.setWrongArticlesByIDURL();
    }

    @When("I send Get Article By ID HTTP request3")
    public void sendGetArticlesByIDHttpRequest2() {
        arbi.sendGetArticlesByIDHttpRequest2();
    }

    @Then("I receive Get Article By ID valid HTTP response code 404")
    public void receiveWrongGetArtcilesByIDURLResponseCode404(){
        arbi.receiveWrongGetArtcilesByIDURLResponseCode404();}

    @Given("I set All Trash Category Endpoint With Correct Data")
    public void setGetAllTrashCategory() {
        gact.setGetAllTrashCategory();
    }

    @When("I send Get All Trash Category request")
    public void sendGetAllTrashCategory() {
        gact.sendGetAllTrashCategory();
    }

    @Then("I receive Get All Trash Category valid HTTP response code 200")
    public void receiveWrongGETAllTrashCategoryResponseCode200(){
        gact.receiveWrongGETAllTrashCategoryResponseCode200();}

    @Given("I set POST All Trash Category Endpoint with Wrong HTTP Request")
    public void setAllTrashCategoryEndpoint() {
        gact.setAllTrashCategoryEndpoint();
    }

    @When("I send POST All Trash Category HTTP request2")
    public void sendPostAllTrashCategoryHttpRequest() {
        gact.sendPostAllTrashCategoryHttpRequest();
    }

    @Then("I receive POST All Trash Category valid HTTP response code 405")
    public void receivePostAllTrashCategoryHttpResponseCode405(){
        gact.receivePostAllTrashCategoryHttpResponseCode405();}

    @Given("I set Get All Trash Category Endpoint With Wrong URL")
    public void setWrongAllTrashCategoryURL() {
        gact.setWrongAllTrashCategoryURL();
    }

    @When("I send Get All Trash Category HTTP request3")
    public void sendGetAllTrashCategoryHttpRequest2() {
        gact.sendGetAllTrashCategoryHttpRequest2();
    }

    @Then("I receive Get All Trash Category valid HTTP response code 404")
    public void receiveWrongGetAllTrashCategoryURLResponseCode404(){
        gact.receiveWrongGetAllTrashCategoryURLResponseCode404();}

    @Given("I set Detail Trash Category Endpoint With Correct Data")
    public void setGetDetailTrashCategory() {
        gtd.setGetDetailTrashCategory();
    }

    @When("I send Get Detail Trash Category request")
    public void sendGetDetailTrashCategory() {
        gtd.sendGetDetailTrashCategory();
    }

    @Then("I receive Get Detail Trash Category valid HTTP response code 200")
    public void receiveWrongGETDetailTrashCategoryResponseCode200(){
        gtd.receiveWrongGETDetailTrashCategoryResponseCode200();}

    @Given("I set POST Detail Trash Category Endpoint with Wrong HTTP Request")
    public void setDetailTrashCategoryEndpoint() {
        gtd.setDetailTrashCategoryEndpoint();
    }

    @When("I send POST Detail Trash Category HTTP request2")
    public void sendPostDetailTrashCategoryHttpRequest() {
        gtd.sendPostDetailTrashCategoryHttpRequest();
    }

    @Then("I receive POST Detail Trash Category valid HTTP response code 405")
    public void receivePostDetailTrashCategoryHttpResponseCode405(){
        gtd.receivePostDetailTrashCategoryHttpResponseCode405();}

    @Given("I set Get Detail Trash Category Endpoint With Wrong URL")
    public void setWrongDetailTrashCategoryURL() {
        gtd.setWrongDetailTrashCategoryURL();
    }

    @When("I send Get Detail Trash Category HTTP request3")
    public void sendGetDetailTrashCategoryHttpRequest2() {
        gtd.sendGetDetailTrashCategoryHttpRequest2();
    }

    @Then("I receive Get Detail Trash Category valid HTTP response code 404")
    public void receiveWrongGetDetailTrashCategoryURLResponseCode404(){
        gtd.receiveWrongGetDetailTrashCategoryURLResponseCode404();}

    @Given("I set  Popular Article Endpoint With Correct Data")
    public void setGetPopularArticles() {
        vpa.setGetPopularArticles();
    }

    @When("I send Get  Popular Article request")
    public void sendGetPopularArticles() {
        vpa.sendGetPopularArticles();
    }

    @Then("I receive Get  Popular Article valid HTTP response code 200")
    public void receiveWrongGETPopularArticlesResponseCode200(){
        vpa.receiveWrongGETPopularArticlesResponseCode200();}

    @Given("I set POST Popular Article Endpoint with Wrong HTTP Request")
    public void setPopularArticlesEndpoint() {
        vpa.setPopularArticlesEndpoint();
    }

    @When("I send POST Popular Article HTTP request2")
    public void sendPostPopularArticlesHttpRequest() {
        vpa.sendPostPopularArticlesHttpRequest();
    }

    @Then("I receive POST Popular Article valid HTTP response code 405")
    public void receivePostPopularArticlesHttpResponseCode405(){
        vpa.receivePostPopularArticlesHttpResponseCode405();}

    @Given("I set Get Popular Article Endpoint With Wrong URL")
    public void setWrongPopularArticlesURL() {
        vpa.setWrongPopularArticlesURL();
    }

    @When("I send Get Popular Article HTTP request3")
    public void sendGetPopularArticlesHttpRequest2() {
        vpa.sendGetPopularArticlesHttpRequest2();
    }

    @Then("I receive Get Popular Article valid HTTP response code 404")
    public void receiveWrongGetPopularArticlesURLResponseCode404(){
        vpa.receiveWrongGetPopularArticlesURLResponseCode404();}

    @Given("I set  Like Article Endpoint With Correct Data")
    public void setLikeAnArticleEndpoint() {
        labi.setLikeAnArticleEndpoint();
    }

    @When("I send Get  Like Article request")
    public void sendPostLikeAnArticleHttpRequest() {
        labi.sendPostLikeAnArticleHttpRequest();
    }

    @Then("I receive Get  Like Article valid HTTP response code 200")
    public void receivePostLikeAnArticleHttpResponseCode201(){
        labi.receivePostLikeAnArticleHttpResponseCode201();}

    @Given("I set POST Like Article Endpoint with Wrong HTTP Request")
    public void setWrongLikeAnArticleEndpoint() {
        labi.setWrongLikeAnArticleEndpoint();
    }

    @When("I send POST Like Article HTTP request2")
    public void sendGetLikeAnArticleHttpRequest2() {
        labi.sendGetLikeAnArticleHttpRequest2();
    }

    @Then("I receive POST Like Article valid HTTP response code 404")
    public void receiveWrongGetLikeAnArticleHttpResponseCode405(){
        labi.receiveWrongGetLikeAnArticleHttpResponseCode405();}

    @Given("I set Get Like Article Endpoint With Wrong URL")
    public void setLikeAnArticleApiEndpoint() {
        labi.setLikeAnArticleApiEndpoint();
    }

    @When("I send Get Like Article HTTP request3")
    public void sendLikeAnArticleHttpRequest3() {
        labi.sendLikeAnArticleHttpRequest3();
    }

    @Then("I receive Get Like Article valid HTTP response code 400")
    public void validateLikeAnArticleHttpResponseCode400(){
        labi.validateLikeAnArticleHttpResponseCode400();}


}
