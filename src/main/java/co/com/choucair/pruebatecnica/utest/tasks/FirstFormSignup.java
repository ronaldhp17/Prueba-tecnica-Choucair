package co.com.choucair.pruebatecnica.utest.tasks;

import co.com.choucair.pruebatecnica.utest.model.UTestFormData;
import co.com.choucair.pruebatecnica.utest.userinterface.FirstFormSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FirstFormSignup implements Task {
    UTestFormData uTestFormData;

    public FirstFormSignup(UTestFormData uTestFormData) {
        this.uTestFormData = uTestFormData;
    }

    public static FirstFormSignup addBasicInformation(UTestFormData uTestFormData) {
        return Tasks.instrumented(FirstFormSignup.class, uTestFormData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestFormData.getFirstName()).into(FirstFormSignupPage.INPUT_FIRSTNAME),
                Enter.theValue(uTestFormData.getLastName()).into(FirstFormSignupPage.INPUT_LASTNAME),
                Enter.theValue(uTestFormData.getEmail()).into(FirstFormSignupPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(uTestFormData.getBirthMonth()).from(FirstFormSignupPage.SELECT_BIRTHMONTH),
                SelectFromOptions.byVisibleText(uTestFormData.getBirthDay()).from(FirstFormSignupPage.SELECT_BIRTHDAY),
                SelectFromOptions.byVisibleText(uTestFormData.getBirthYear()).from(FirstFormSignupPage.SELECT_BIRTHYEAR),
                Enter.theValue(uTestFormData.getLanguage()).into(FirstFormSignupPage.LANGUAGES),
                Click.on(FirstFormSignupPage.SELECT_LANGUAGE),
                Click.on(FirstFormSignupPage.NEXT_BUTTON));
    }
}
