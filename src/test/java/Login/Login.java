package Login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected String url = "https://api.recything.my.id/admins/login";

    @Step("I set POST method with valid endpoint and body requests Login Admin")
    public String setValidLoginAdminReq(){
        return url;
    }

    @Step("I send Login requests to connect to APIs L1")
    public void sendLoginAdminReq1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "12345678");

        SerenityRest.given().contentType("application/json").body(requestBody.toJSONString()).post(setValidLoginAdminReq());
    }

    @Step("I receive HTTP response code 200 for Valid Login Admin")
    public void receiveLoginAdminResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("I set POST method with valid endpoint and invalid body requests Login Admin")
//    public String setInvalidLoginAdminReq1(){
//        return url;
//    }
//
//    @Step("I send Login requests to connect to APIs L2")
//    public void sendLoginAdminReq2(){
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "admin@gmail.com");
//        requestBody.put("password", "123456");
//
//        SerenityRest.given().when().get(setInvalidLoginAdminReq1());
//    }
//
//    @Step("I receive HTTP response code 400 for Invalid Login Admin")
//    public void receiveLoginAdminResp2(){
//        restAssuredThat(response -> response.statusCode(400));
//    }
//
//    @Step("I set GET method with valid endpoint and body requests Login Admin")
//    public String setInvalidLoginAdminReq2(){
//        return url;
//    }
//
//    @Step("I send Login requests to connect to APIs L3")
//    public void sendLoginAdminReq3(){
//        SerenityRest.given().when().get(setInvalidLoginAdminReq2());
//    }
//
//    @Step("I receive HTTP response code 400 for Invalid Request Login Admin")
//    public void receiveLoginAdminResp3(){
//        restAssuredThat(response -> response.statusCode(400));
//    }

    @Step("I set POST method with valid endpoint and body requests Login SuperAdmin")
    public String setValidLoginSuperAdminReq(){
        return url;
    }

    @Step("I send Login requests to connect to APIs L4")
    public void sendLoginSuperAdminReq1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "superadmin@gmail.com");
        requestBody.put("password", "123456");

        SerenityRest.given().contentType("application/json").body(requestBody.toJSONString()).post(setValidLoginSuperAdminReq());
    }

    @Step("I receive HTTP response code 200 for Valid Login SuperAdmin")
    public void receiveLoginSuperAdminResp1(){
        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("I set POST method with valid endpoint and invalid body requests Login SuperAdmin")
//    public String setInvalidLoginSuperAdminReq1(){
//        return url;
//    }
//
//    @Step("I send Login requests to connect to APIs L5")
//    public void sendLoginSuperAdminReq2(){
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "admin@gmail.com");
//        requestBody.put("password", "123456");
//
//        SerenityRest.given().when().get(setInvalidLoginSuperAdminReq1());
//    }
//
//    @Step("I receive HTTP response code 400 for Invalid Login SuperAdmin")
//    public void receiveLoginSuperAdminResp2(){
//        restAssuredThat(response -> response.statusCode(400));
//    }
//
//    @Step("I set GET method with valid endpoint and body requests Login SuperAdmin")
//    public String setInvalidLoginSuperAdminReq2(){
//        return url;
//    }
//
//    @Step("I send Login requests to connect to APIs L6")
//    public void sendLoginSuperAdminReq3(){
//        SerenityRest.given().when().get(setInvalidLoginAdminReq2());
//    }
//
//    @Step("I receive HTTP response code 400 for Invalid Request Login SuperAdmin")
//    public void receiveLoginSuperAdminResp3(){
//        restAssuredThat(response -> response.statusCode(400));
//    }
}
