package co.com.choucair.pruebatecnica.utest.tasks;

import co.com.choucair.pruebatecnica.utest.model.UTestFormData;
import co.com.choucair.pruebatecnica.utest.userinterface.SecondFormSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SecondFormSingup implements Task {

    UTestFormData uTestFormData;

    public SecondFormSingup(UTestFormData uTestFormData) {
        this.uTestFormData = uTestFormData;
    }

    public static SecondFormSingup addLocationInformation(UTestFormData uTestFormData) {
        return Tasks.instrumented(SecondFormSingup.class,uTestFormData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestFormData.getCity()).into(SecondFormSignupPage.SELECT_CITY),
                Click.on(SecondFormSignupPage.CITIES),
                Enter.theValue(uTestFormData.getZipCode()).into(SecondFormSignupPage.INPUT_ZIP_CODE),
                Click.on(SecondFormSignupPage.BUTTON_NEXT_DEVICES));
    }
}
