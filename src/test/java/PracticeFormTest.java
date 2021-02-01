import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest {

    @Test
    public void fillFieldsPracticeForm() {

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
        $("#currentAddress").setValue("moscow,1,3,2");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

    }
}
