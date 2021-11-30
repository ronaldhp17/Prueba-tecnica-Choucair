package co.com.choucair.pruebatecnica.utest.tasks;

import co.com.choucair.pruebatecnica.utest.userinterface.UTestSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Signup implements Task {

    public static Signup onThePage() {
        return Tasks.instrumented(Signup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSignupPage.BUTTON_SIGNUP));
    }
}
