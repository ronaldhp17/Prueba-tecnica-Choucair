package co.com.choucair.pruebatecnica.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ThirdFormSingupPage extends PageObject {

    public static Target INPUT_MOBILE=Target.the("Where do we write our mobil device")
            .located(By.name("handsetMakerId"));

    public static Target SELECT_MOBILE = Target.the("Where do we select our mobile device")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-6-17\"]/span/div"));

    public static Target INPUT_MODEL= Target.the("Where do we write our model of mobile")
            .located(By.name("handsetModelId"));

    public static Target SELECT_MODEL= Target.the("Where do we select our model of mobile")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-7-0\"]/span/div"));

    public static Target INPUT_OS = Target.the("Where do we write our version of os")
            .located(By.name("handsetOSId"));

    public static Target SELECT_OS = Target.the("Where do we select our version of os")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-8-0\"]/span/div"));

    public static Target BUTOON_LAST_STEP = Target.the("Press button to the last step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
