package co.com.choucair.pruebatecnica.utest.questions;

import co.com.choucair.pruebatecnica.utest.userinterface.FourthFormSignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String homePage) {
        return new Answer(homePage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String welcome= Text.of(FourthFormSignupPage.WELCOME_HOME_PAGE).viewedBy(actor).asString();
        if (question.equals(welcome)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
