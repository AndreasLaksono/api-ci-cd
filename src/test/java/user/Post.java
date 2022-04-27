package user;

import io.restassured.response.Response;
import kotlin.random.URandomKt;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.jruby.RubyProcess;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Post {

    private static String url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST new user")
    public String setPostEndpoint(){
        return url + "User";
    }

    @Step("I request POST detail user")
    public void requestPostDetailUser(){
        JSONObject reqData = new JSONObject();
        reqData.put("userName", "andre1234567");
        reqData.put("password", "Password1234!");

        SerenityRest.given().header("Content-Type", "application/json").body(reqData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("I validate the status code is {int}")
    public void validateStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail after create user")
    public void validateDataDetail(){
        SerenityRest.then().body("username", equalTo("andre1234567"));
    }

    @Step("get UserID for other request")
    public String getUserId(){
        Response response = SerenityRest.lastResponse();
        String userId = response.body().path("userId");
        System.out.println(userId);
        return userId;
    }

    @Step("I request POST detail user with invalid password")
    public void requestInvalidPost(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre1234567");
        requestData.put("password", "test");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step("validate the data detail after failed create user")
    public void validateDataDetailFailed(){
        then().body("code", equalTo("1300"));
    }

    @Step("I request POST detail user with the username and password that was already registered")
    public void requestRegisteredPost(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre1234567");
        requestData.put("password", "Password1234!");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step("validate the data detail after failed create user")
    public void validateDataDetailRegisteredUser(){
        then().body("code", equalTo("1204"));
    }

    @Step("I request POST detail user with the username and password that was already registered")
    public void requestRegisteredUserPost(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre1234567");
        requestData.put("password", "Password1234!");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setPostEndpoint());
    }

    @Step("validate the data detail after failed create user")
    public void validateDataDetailRegisteredUserPost(){
        then().body("code", equalTo("1204"));
    }
}
