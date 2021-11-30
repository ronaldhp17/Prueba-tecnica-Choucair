package co.com.choucair.pruebatecnica.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignupPage extends PageObject {
    public static final Target BUTTON_SIGNUP =Target.the("button that leads to the registration form")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
