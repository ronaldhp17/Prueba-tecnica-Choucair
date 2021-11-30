package co.com.choucair.pruebatecnica.utest.stepdefinitions;

import co.com.choucair.pruebatecnica.utest.model.UTestFormData;
import co.com.choucair.pruebatecnica.utest.questions.Answer;
import co.com.choucair.pruebatecnica.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SingUpUTestStepDefinitions {
    @Before()
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Ronald wants register at utest$")
    public void thanRonaldWantsRegisterAtUtest() {
        OnStage.theActorCalled("Ronald").wasAbleTo(OpenUp.thePage(), (Signup.onThePage()));
    }

    @When("^he fill the fields$")
    public void heFillTheFields(List<UTestFormData> uTestFormData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FirstFormSignup.addBasicInformation(uTestFormData.get(0)),
                SecondFormSingup.addLocationInformation(uTestFormData.get(0)),
                ThirdFormSignup.addDevices(uTestFormData.get(0)),
                FourthFormSignup.addSecureInformation(uTestFormData.get(0)));
    }

    @Then("^he completes the registration and redirects to home page$")
    public void heCompletesTheRegistrationAndRedirectsToHomePage(List<UTestFormData> uTestFormData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestFormData.get(0).getHomePage())));
    }
}
