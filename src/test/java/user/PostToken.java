package user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class PostToken {

    private static String url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST generate token")
    public String setEndpointForGenerate(){
        return url + "GenerateToken";
    }

    @Step("I request POST generate token")
    public void reqPostGenerateToken(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre3333");
        requestData.put("password", "Password1234!");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setEndpointForGenerate());
    }

    @Step("validate the data detail after generate token")
    public void validateDataDetailGenerateToken(){
        then().body("result", equalTo("User authorized successfully."));
    }

    @Step("get token for other request")
    public String getToken(){
        Response response = SerenityRest.lastResponse();
        String token = response.body().path("token");
        System.out.println(token);
        return token;
    }

    @Step("I request POST generate token with null password")
    public void reqPostGenerateTokenWithNullPass(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "andre3333");
        requestData.put("password", "");

        given().header("Content-Type", "application/json")
                .body(requestData.toJSONString())
                .when().post(setEndpointForGenerate());
    }

    @Step("validate the data detail after failed generate token")
    public void validateDataDetailFailedGenerateToken(){
        then().body("code", equalTo("1200"));
    }
}
