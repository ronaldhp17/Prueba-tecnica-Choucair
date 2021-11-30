package co.com.choucair.pruebatecnica.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FourthFormSignupPage {

    public static Target INPUT_PASSWORD = Target.the("where do we write the pasword")
            .located(By.name("password"));

    public static Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the pasword")
            .located(By.name("confirmPassword"));

    public static Target CHECK_STAY_INFORMED = Target.the("Check the check box ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static Target CHECK_TERMS = Target.the("Check the check box ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static Target CHECK_POLICY = Target.the("Check the check box ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static  Target BUTTON_COMPLETE = Target.the("Press button to complete signup")
            .located(By.id("laddaBtn"));

    public static Target WELCOME_HOME_PAGE= Target.the("Welcome message")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
