package co.com.choucair.pruebatecnica.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirstFormSignupPage extends PageObject {
    public static Target INPUT_FIRSTNAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));

    public static Target INPUT_LASTNAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));

    public static Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));

    public static Target SELECT_BIRTHMONTH = Target.the("where do we select the month birthday")
            .located(By.id("birthMonth"));

    public static Target SELECT_BIRTHDAY = Target.the("where do we select the day birthday")
            .located(By.id("birthDay"));

    public static Target SELECT_BIRTHYEAR = Target.the("where do we select the year birthday")
            .located(By.id("birthYear"));

    public static Target LANGUAGES= Target.the("where do we select the languages")
            .located(By.xpath("//form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));

    public static Target SELECT_LANGUAGE= Target.the("where do we select the language")
            .located(By.className("ui-select-match"));

    public static Target NEXT_BUTTON = Target.the("Press button Next:Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
