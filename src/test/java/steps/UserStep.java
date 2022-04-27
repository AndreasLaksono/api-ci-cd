package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import user.Get;
import user.Post;
import user.PostAuthorized;
import user.PostToken;

public class UserStep {

    public String userId, token;

    @Steps
    Post post;

    @Steps
    Get get;

    @Steps
    PostToken postToken;

    @Steps
    PostAuthorized postAuthorized;

    // POST - As an user I want to authorized my account
    @Given("I set an endpoint for POST authorized account")
    public void iSetAnEndpointForPOSTAuthorizedAccount() {
        postAuthorized.setPostEndpoint();
    }

    @When("I request POST authorized account")
    public void iRequestPOSTAuthorizedAccount() {
        postAuthorized.reqPostAuthorized();
    }

    @Then("I validate the authorized status code is {int}")
    public void iValidateTheAuthorizedStatusCodeIs(int arg0) {
        get.validateStatusCode(200);
    }

    @And("validate the data detail after authorized account")
    public void validateTheDataDetailAfterAuthorizedAccount() {
        System.out.println("");
    }

    @And("get response is true")
    public void getResponseIsTrue() {
        System.out.println("");
    }

    @When("I request POST authorized account with invalid password")
    public void iRequestPOSTAuthorizedAccountWithInvalidPassword() {
        postAuthorized.reqInvalidPostAuthorized();
    }

    @And("validate the data detail after failed authorized account")
    public void validateTheDataDetailAfterFailedAuthorizedAccount() {
        postAuthorized.validateDataDetailFailedAuthorized();
    }

    @When("I request POST authorized account without password")
    public void iRequestPOSTAuthorizedAccountWithoutPassword() {
        postAuthorized.reqInvalidPostAuthorizedPass();
    }

    @And("validate the data detail after failed authorized account without password")
    public void validateTheDataDetailAfterFailedAuthorizedAccountWithoutPassword() {
        postAuthorized.validateDataDetailFailedAuthorizedPass();
    }
    // END

    /*POST - As an user I want to create new user*/
    @Given("I set an endpoint for POST new user")
    public void iSetAnEndpointForPOSTNewUser(){
        post.setPostEndpoint();
    }

    @When("I request POST detail user")
    public void iRequestPOSTDetailUser() {
        post.requestPostDetailUser();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int arg0) {
        post.validateStatusCode(arg0);
    }

    @And("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser() {
        post.validateDataDetail();
    }

    @And("get UserID for other request")
    public void getUserIDForOtherRequest() {
        post.getUserId();
    }

    @When("I request POST detail user with invalid password")
    public void iRequestPOSTDetailUserWithInvalidPassword() {
        post.requestInvalidPost();
    }

    @And("validate the data detail after failed create")
    public void validateTheDataDetailAfterFailedCreate() {
        post.validateDataDetailFailed();
    }

    @When("I request POST detail user with the username and password that was already registered")
    public void iRequestPOSTDetailUserWithTheUsernameAndPasswordThatWasAlreadyRegistered() {
        post.requestRegisteredUserPost();
    }

    @And("validate the data detail after failed create user with username and password that was already registered")
    public void validateTheDataDetailAfterFailedCreateUserWithUsernameAndPasswordThatWasAlreadyRegistered() {
        post.validateDataDetailRegisteredUserPost();
    }
    // END

    // POST - As an user I have to generate token
    @Given("I set an endpoint for POST generate token")
    public void iSetAnEndpointForPOSTGenerateToken() {
        postToken.setEndpointForGenerate();
    }

    @When("I request POST generate token")
    public void iRequestPOSTGenerateToken() {
        postToken.reqPostGenerateToken();
    }

    @And("validate the data detail after generate token")
    public void validateTheDataDetailAfterGenerateToken() {
        postToken.validateDataDetailGenerateToken();
    }

    @And("get token for other request")
    public void getTokenForOtherRequest() {
        postToken.getToken();
    }

    @When("I request POST generate token with null password")
    public void iRequestPOSTGenerateTokenWithNullPassword() {
        postToken.reqPostGenerateTokenWithNullPass();
    }

    @And("validate the data detail after failed generate token")
    public void validateTheDataDetailAfterFailedGenerateToken() {
        postToken.validateDataDetailFailedGenerateToken();
    }
    // END

    // DELETE
    @Given("I set an endpoint for the DELETE user")
    public void iSetAnEndpointForTheDELETEUser() {
        System.out.println("");
    }

    @When("I request DELETE user using userId")
    public void iRequestDELETEUserUsingUserId() {
        System.out.println("");
    }

    @And("validate the data detail after DELETE user")
    public void validateTheDataDetailAfterDELETEUser() {
        System.out.println("");
    }

    @When("I request DELETE user using userId with unauthorized")
    public void iRequestDELETEUserUsingUserIdWithUnauthorized() {
        System.out.println("");
    }

    @And("validate the data detail after DELETE user with unauthorized")
    public void validateTheDataDetailAfterDELETEUserWithUnauthorized() {
        System.out.println("");
    }

    @When("I request DELETE user using userId with unauthorized and wrong userId")
    public void iRequestDELETEUserUsingUserIdWithUnauthorizedAndWrongUserId() {
        System.out.println("");
    }

    @And("validate the data detail after DELETE user with unauthorized and wrong userId")
    public void validateTheDataDetailAfterDELETEUserWithUnauthorizedAndWrongUserId() {
        System.out.println("");
    }
    // END



    // GET
    @Given("I set an endpoint for GET detail user")
    public void iSetAnEndpointForGETDetailUser() {
        get.setAnEndpointForGet(this.userId);
    }

    @When("I request GET detail user")
    public void iRequestGETDetailUser() {
        get.reqGetDetailUser(this.userId, this.token);
    }

    @And("validate the data detail")
    public void validateTheDataDetail() {
        get.validateDataDetail(this.userId);
    }

    @When("I request GET valid detail user")
    public void iRequestGETValidDetailUser() {
        System.out.println("");
    }

    @And("validate the valid data detail")
    public void validateTheValidDataDetail() {
        System.out.println("");
    }
    // END


}
