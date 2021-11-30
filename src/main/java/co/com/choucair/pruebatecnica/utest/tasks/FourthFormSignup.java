package co.com.choucair.pruebatecnica.utest.tasks;

import co.com.choucair.pruebatecnica.utest.model.UTestFormData;
import co.com.choucair.pruebatecnica.utest.userinterface.FourthFormSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FourthFormSignup implements Task {
    UTestFormData uTestFormData;

    public FourthFormSignup(UTestFormData uTestFormData) {
        this.uTestFormData = uTestFormData;
    }

    public static FourthFormSignup addSecureInformation(UTestFormData uTestFormData) {
        return Tasks.instrumented(FourthFormSignup.class,uTestFormData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestFormData.getPassword()).into(FourthFormSignupPage.INPUT_PASSWORD),
                Enter.theValue(uTestFormData.getConfirmPassword()).into(FourthFormSignupPage.INPUT_CONFIRM_PASSWORD),
                Click.on(FourthFormSignupPage.CHECK_STAY_INFORMED),
                Click.on(FourthFormSignupPage.CHECK_TERMS),
                Click.on(FourthFormSignupPage.CHECK_POLICY),
                Click.on(FourthFormSignupPage.BUTTON_COMPLETE));
    }
}
