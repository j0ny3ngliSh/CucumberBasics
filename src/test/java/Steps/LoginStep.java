package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;


public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {

    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("The driver is: " + base.stepInfo + "\n");
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<User> users;
        users = table.asList(User.class);

        for(User user: users){
            System.out.println("username " + user.username);
            System.out.println("password " + user.password);
        }

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) throws Throwable {

    }

    @And("^I enter the users email address Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
        System.out.println((String.format("The email is: %s \n", email)));
    }

    public class User{
        private String username;
        private String password;

        public User(String username, String password){
            this.username = username;
            this.password = password;
        }

    }
}
