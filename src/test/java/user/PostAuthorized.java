package user;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class PostAuthorized {

    private static String url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST authorized account")
    public String setPostEndpoint(){
        return url + "Authorized";
    }

    @Step("I request POST authorized account")
    public void reqPostAuthorized(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre3333");
        requestData.put("password", "Password1234!");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step("I request POST authorized account with invalid password")
    public void reqInvalidPostAuthorized(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre3333");
        requestData.put("password", "pass");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step("validate the data detail after failed authorized account")
    public void validateDataDetailFailedAuthorized(){
        then().body("code", equalTo("1207"));
    }

    @Step("I request POST authorized account without password")
    public void reqInvalidPostAuthorizedPass(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre3333");
        requestData.put("password", "");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step("validate the data detail after failed authorized account without password")
    public void validateDataDetailFailedAuthorizedPass(){
        then().body("code", equalTo("1200"));
    }
}
