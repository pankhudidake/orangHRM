package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass{

private static LoginPage log;
@Given("user on LoginPage")
public void user_on_login_page() {
    BaseClass.inialization();
}

@When("User enter valid username and password")
public void user_enter_valid_username_and_password() {
   log=new LoginPage();
  log.LoginFunctionality(prop.getProperty("uname"), prop.getProperty("pass"));
}

@Then("Click on Login botton")
public void click_on_login_botton() {
   log.clickonloginbutton();
}


}
