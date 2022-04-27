package books;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Get {

    protected static String url = "https://demoqa.com/BookStore/v1";

    @Step("I set an endpoint for GET detail books")
    public String setAnEndpointForGetBooks(){
        return url + "/Books";
    }

    @Step("I request GET detail books")
    public void reqGetDetailBooks(){
        SerenityRest.given()
                .when()
                .get(setAnEndpointForGetBooks());
    }

    @Step("I validate books status code is {int}")
    public void validateBooksStatusCode(int statusCode){
        SerenityRest.then().statusCode(statusCode);
    }

    @Step("validate the books detail")
    public void validateDataBooksDetail(){
        SerenityRest.then().body("data", equalTo("books") );
    }
}
