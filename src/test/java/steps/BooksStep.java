package steps;

import books.Get;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BooksStep {

    @Steps
    Get get;

    @Given("I set an endpoint for POST new book isbn")
    public void setEndpointPOSTBook(){
        System.out.println("");
    }

    @When("I request POST detail isbn")
    public void iRequestPOSTDetailIsbn() {
        System.out.println("");
    }

    @Then("I validate the status code is 201")
    public void validateStatusCode201(){
        System.out.println("");
    }

    @And("validate the data detail after adding isbn")
    public void validateTheDataDetailAfterAddingIsbn() {
        System.out.println("");
    }

    @When("I request POST detail isbn without authorization token")
    public void iRequestPOSTDetailIsbnWithoutAuthorizationToken() {
        System.out.println("");
    }

    @And("validate the data detail after adding isbn without authorization token")
    public void validateTheDataDetailAfterAddingIsbnWithoutAuthorizationToken() {
        System.out.println("");
    }

    @When("I request POST detail isbn without authorization token and null isbn")
    public void iRequestPOSTDetailIsbnWithoutAuthorizationTokenAndNullIsbn() {
        System.out.println("");
    }

    @And("validate the data detail after adding isbn without authorization token and null isbn")
    public void validateTheDataDetailAfterAddingIsbnWithoutAuthorizationTokenAndNullIsbn() {
        System.out.println("");
    }


    @Given("I set an endpoint for the DELETE book")
    public void iSetAnEndpointForTheDELETEBook() {
        System.out.println("");
    }

    @When("I request DELETE book using userId")
    public void iRequestDELETEBookUsingUserId() {
        System.out.println("");
    }

    @And("validate the data detail after DELETE book")
    public void validateTheDataDetailAfterDELETEBook() {
        System.out.println("");
    }

    @When("I request DELETE books using userId with unauthorized")
    public void iRequestDELETEBooksUsingUserIdWithUnauthorized() {
        System.out.println("");
    }

    @And("validate the data detail after DELETE book with unauthorized")
    public void validateTheDataDetailAfterDELETEBookWithUnauthorized() {
        System.out.println("");
    }


    @Given("I set an endpoint for GET detail books")
    public void iSetAnEndpointForGETDetailBooks() {
        get.setAnEndpointForGetBooks();
    }

    @When("I request GET detail books")
    public void iRequestGETDetailBooks() {
        get.reqGetDetailBooks();
    }

    @Then("I validate books status code is {int}")
    public void iValidateBooksStatusCodeIs(int arg0) {
        get.validateBooksStatusCode(arg0);
    }

    @And("validate the books detail")
    public void validateTheBooksDetail() {
        get.reqGetDetailBooks();
    }

    @Given("I set an endpoint for GET detail book")
    public void iSetAnEndpointForGETDetailBook() {
        System.out.println("");
    }

    @When("I request GET detail book")
    public void iRequestGETDetailBook() {
        System.out.println("");
    }

    @And("validate the book data detail")
    public void validateTheBookDataDetail() {
        System.out.println("");
    }

    @When("I request GET detail book with null isbn")
    public void iRequestGETDetailBookWithNullIsbn() {
        System.out.println("");
    }

    @And("validate the book data detail with null isbn")
    public void validateTheBookDataDetailWithNullIsbn() {
        System.out.println("");
    }


    @And("validate the book detail")
    public void validateTheBookDetail() {
        System.out.println("");
    }


    @When("I request DELETE book using isbn")
    public void iRequestDELETEBookUsingIsbn() {
        System.out.println("");
    }

    @Then("I validate the request, status code is {int}")
    public void iValidateTheRequestStatusCodeIs(int arg0) {
        System.out.println("");
    }

    @When("I request DELETE book using isbn with unauthorized")
    public void iRequestDELETEBookUsingIsbnWithUnauthorized() {
        System.out.println("");
    }

    @When("I request DELETE book using isbn with unauthorized and null isbn")
    public void iRequestDELETEBookUsingIsbnWithUnauthorizedAndNullIsbn() {
        System.out.println("");
    }

    @And("validate the data detail after DELETE book with unauthorized and null isbn")
    public void validateTheDataDetailAfterDELETEBookWithUnauthorizedAndNullIsbn() {
        System.out.println("");
    }


    @Given("I set an endpoint for PUT new book isbn")
    public void iSetAnEndpointForPUTNewBookIsbn() {
        System.out.println("");
    }

    @When("I request PUT detail book after replacing book data")
    public void iRequestPUTDetailBookAfterReplacingBookData() {
        System.out.println("");
    }

    @And("validate the data detail after replacing book data")
    public void validateTheDataDetailAfterReplacingBookData() {
        System.out.println("");
    }

    @When("I request PUT detail book after replacing book data with null isbn")
    public void iRequestPUTDetailBookAfterReplacingBookDataWithNullIsbn() {
        System.out.println("");
    }

    @And("validate the data detail after replacing book data with null isbn")
    public void validateTheDataDetailAfterReplacingBookDataWithNullIsbn() {
        System.out.println("");
    }

    @When("I request PUT detail book after replacing book data with unauthorized")
    public void iRequestPUTDetailBookAfterReplacingBookDataWithUnauthorized() {
        System.out.println("");
    }

    @And("validate the data detail after replacing book data with unauthorized")
    public void validateTheDataDetailAfterReplacingBookDataWithUnauthorized() {
        System.out.println("");
    }
}
