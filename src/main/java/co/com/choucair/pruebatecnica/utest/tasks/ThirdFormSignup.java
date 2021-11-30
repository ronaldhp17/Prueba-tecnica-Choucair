package co.com.choucair.pruebatecnica.utest.tasks;

import co.com.choucair.pruebatecnica.utest.model.UTestFormData;
import co.com.choucair.pruebatecnica.utest.userinterface.ThirdFormSingupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ThirdFormSignup implements Task {

    UTestFormData uTestFormData;

    public ThirdFormSignup(UTestFormData uTestFormData) {
        this.uTestFormData = uTestFormData;
    }

    public static ThirdFormSignup addDevices(UTestFormData uTestFormData) {
        return Tasks.instrumented(ThirdFormSignup.class, uTestFormData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ThirdFormSingupPage.INPUT_MOBILE),
                Click.on(ThirdFormSingupPage.SELECT_MOBILE),
                Click.on(ThirdFormSingupPage.INPUT_MODEL),
                Click.on(ThirdFormSingupPage.SELECT_MODEL),
                Click.on(ThirdFormSingupPage.INPUT_OS),
                Click.on(ThirdFormSingupPage.SELECT_OS),
                Click.on(ThirdFormSingupPage.BUTOON_LAST_STEP));
    }
}
