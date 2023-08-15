package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;


public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();

    SelenideElement
                    firstName = $("#firstName"),
                    lastName = $("#lastName"),
                    userEmail = $("#userEmail"),
                    userNumber = $("#userNumber"),
                    currentAddress = $("#currentAddress"),
                    subjectsInput = $("#subjectsInput"),
                    genderSelect = $("#genterWrapper"),
                    hobbiesSelect =  $("#hobbiesWrapper"),
                    uploadPicture = $("#uploadPicture"),
                    birthInput = $("#dateOfBirthInput"),
                    state = $("#state"),
                    city = $("#city"),
                    stateCityWrapper = $("#stateCity-wrapper"),
                    submit = $("#submit"),
                    tableResponsive = $(".table-responsive");

    public RegistrationPage openPage(){

        open("automation-practice-form");
        deleteAdBanner();

        return this;

    }

    public void deleteAdBanner(){

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

    }

    public RegistrationPage setFirstName(String value){

        firstName.setValue(value);
        return this;

    }

    public RegistrationPage setLastName(String value){

        lastName.setValue(value);
        return this;

    }

    public RegistrationPage setUserEmail(String value){

        userEmail.setValue(value);
        return this;

    }

    public RegistrationPage setUserNumber(String value){

        userNumber.setValue(value);
        return this;

    }

    public RegistrationPage setCurrentAddress(String value){

        currentAddress.setValue(value);
        return this;

    }

    public RegistrationPage setSubject(String value){

        subjectsInput.setValue(value).pressEnter();
        return this;

    }

    public RegistrationPage selectGender(String value){

        genderSelect.$(byText(value)).click();
        return this;

    }

    public RegistrationPage selectHobbies(String value){

        hobbiesSelect.$(byText(value)).click();
        return this;

    }

    public RegistrationPage uploadPicture(String value){

        uploadPicture.uploadFromClasspath(value);
        return this;

    }

    public RegistrationPage setState(String value){

        state.click();
        stateCityWrapper.$(byText(value)).click();
        return this;

    }

    public RegistrationPage setCity(String value){

        city.click();
        stateCityWrapper.$(byText(value)).click();
        return this;

    }

    public void clickSubmit(){

        submit.click();

    }

    public RegistrationPage setBirthDay(String month, String year, String day){

        birthInput.click();
        calendar.setCalendarDate(month, year, day);

        return this;
    }

    public RegistrationPage checkResults(String value, String valueCheck) {

        tableResponsive.$(byText(value)).parent().shouldHave(Condition.text(valueCheck));

        return this;

    }






















}
