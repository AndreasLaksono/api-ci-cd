package user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.eclipse.jetty.client.api.Request;

import static org.hamcrest.Matchers.equalTo;

public class Get {

    protected static String url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for GET detail user")
    public String setAnEndpointForGet(String userId){
        return url + "User/" + userId;
    }

    @Step("I request GET detail user")
    public void reqGetDetailUser(String userId, String token){
        SerenityRest.given()
                .header("Authorization", "Bearer" + token)
                .when()
                .get(setAnEndpointForGet(userId));
    }

    @Step("I validate the status code is {int}")
    public void validateStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the data detail")
    public void validateDataDetail(String userId){
        SerenityRest.then().body("userId", equalTo(userId));
    }
}
