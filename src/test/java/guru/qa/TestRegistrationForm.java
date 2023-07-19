package guru.qa;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestRegistrationForm extends BaseTest{

    @Test
    void testRegistrationForm(){

        TestData data = new TestData();

        //Открытие браузера и вкладки с заданным адресом
        open("/automation-practice-form");

        //Удаление рекламного блока и футера
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        //Ввод параметров в текстовые поля
        $("#firstName").setValue(data.firstname);
        $("#lastName").setValue(data.lastname);
        $("#userEmail").setValue(data.email);
        $("#userNumber").setValue(data.phone);
        $("#currentAddress").setValue(data.current_address);
        $("#subjectsInput").setValue(data.subject).sendKeys(Keys.ENTER);

        //Выбор пола
        $("#genterWrapper").$(byText("Male")).click();

        //Выбор хобби
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        //Выбор даты рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText("October");
        $(".react-datepicker__year-select").selectOptionContainingText("1995");
        $(".react-datepicker__day.react-datepicker__day--015").click();


        //Загрузка изображения
        $("#uploadPicture").uploadFromClasspath("foto.jpg");

        //Выбор штата и города
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Merrut")).click();

        //Отправка формы
        $("#submit").click();

        //Проверка на появление модального окна
        $(".modal-content").should(Condition.appear);

        //Проверки на соответствие введенных значений и полученного ответа в модальном окне.
        $(".table-responsive").$(byText("Student Name")).parent()
                .shouldHave(text(data.firstname + " " + data.lastname));
        $(".table-responsive").$(byText("Student Email")).parent()
                .shouldHave(text(data.email));
        $(".table-responsive").$(byText("Gender")).parent()
                .shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent()
                .shouldHave(text(data.phone));
        $(".table-responsive").$(byText("Date of Birth")).parent()
                .shouldHave(text("15 October,1995"));
        $(".table-responsive").$(byText("Subjects")).parent()
                .shouldHave(text(data.subject));
        $(".table-responsive").$(byText("Hobbies")).parent()
                .shouldHave(text("Sports, Music"));
        $(".table-responsive").$(byText("Picture")).parent()
                .shouldHave(text("foto.jpg"));
        $(".table-responsive").$(byText("Address")).parent()
                .shouldHave(text(data.current_address));
        $(".table-responsive").$(byText("State and City")).parent()
                .shouldHave(text("Uttar Pradesh Merrut"));

    }

}
