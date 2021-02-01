import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;

    }

    @Test
    public void fillFieldsPracticeForm() throws InterruptedException {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alexandr");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("useremail@here.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("9851234567");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").$(byValue("1994")).click();
        $(".react-datepicker__month-select").$(byValue("0")).click();
        $(".react-datepicker__month").$(byText("5")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $(byText("Sports")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/frog.jpg"));
        $("#currentAddress").setValue("moscow,1,3,2");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();



        Thread.sleep(3000);

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
    }
}
