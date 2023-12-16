//package API_Web.ManageTrashCategory;
//
//import net.serenitybdd.rest.SerenityRest;
//import net.thucydides.core.annotations.Step;
//import org.json.simple.JSONObject;
//
//import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
//
//public class UpdateTrashCategoryByID {
//    protected String url = "https://api.recything.my.id/admins/manage/trashes/29a14bb0-f1ff-45e3-afd9-1a4c35e28b73";
//    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MDI0NjMwNTIsImlkIjoiMGM5N2UxN2UtZDFiZS00YjU0LWE0MGMtNzgwOThjNTcxNGFjIiwicm9sZSI6InN1cGVyX2FkbWluIn0.cbg4xRxuGFW1aWb7czEl-NPsL970VahIgcLWsE2s5QU";
//
//    @Step("I set PUT method to update Trash Category")
//    public String setUpdateTC1(){
//        return url;
//    }
//
//    @Step("I send PUT for create Trash Category with valid body and endpoint requests to connect to APIs MTC2")
//    public void sendPutToUpdateTC1(){
//        JSONObject requestBody = new JSONObject();
//
//        requestBody.put("trash_type", "Buku");
//        requestBody.put("unit", "Barang");
//        requestBody.put("point", 5);
//
//        SerenityRest.given()
//                .header("Authorization", "Bearer " + token)
//                .contentType("application/json").body(requestBody.toJSONString()).put(setUpdateTC1());
//    }
//
//    @Step("I receive HTTP response code 200 for update a Trash Category")
//    public void receiveUpdateTCResp1(){
//        restAssuredThat(response -> response.statusCode(200));
//    }
//
//    @Step("I set GET method to update Trash Category with invalid request method")
//    public String setUpdateTC2(){
//        return url;
//    }
//
//    @Step("I send GET for update Trash Category with valid body and endpoint requests to connect to APIs MTC2")
//    public void sendPutToUpdateTC2(){
//        JSONObject requestBody = new JSONObject();
//
//        requestBody.put("trash_type", "Buku");
//        requestBody.put("unit", "Barang");
//        requestBody.put("point", 5);
//
//        SerenityRest.given()
//                .header("Authorization", "Bearer " + token)
//                .contentType("application/json").body(requestBody.toJSONString()).get(setUpdateTC2());
//    }
//
//    @Step("I receive HTTP response code 400 for update a Trash Category")
//    public void receiveUpdateTCResp2(){
//        restAssuredThat(response -> response.statusCode(400));
//    }
//}
