import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest {

    @Test
    public void fillFieldsPracticeForm() throws InterruptedException {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Alexandr");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("useremail@here.ru");
        // $(By.name("gender")).selectRadio("Male");
        //$("#dateOfBirthInput").setValue("05 Jan 1994");


        Thread.sleep(1000);



    }
}
