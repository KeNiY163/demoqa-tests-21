package guru.qa.tests;

import guru.qa.TestData;
import guru.qa.pages.RegistrationPage;
import guru.qa.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestRegistrationForm extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData data = new TestData();

    @Tag("JenkinsTest")
    @DisplayName("Successful Registration")
    @Test
    void testRegistrationForm() {

        step("Open page and form", () -> {
                    registrationPage
                            .openPage("https://demoqa.com/automation-practice-form");
        });
        step("Fill form", () -> {
                    registrationPage
                            .setFirstName(data.firstName)
                            .setLastName(data.lastName)
                            .setUserEmail(data.email)
                            .setBirthDay(data.month, data.year, data.day)
                            .setSubject(data.subject)
                            .setUserNumber(data.phone)
                            .setCurrentAddress(data.currentAddress)
                            .selectGender(data.gender)
                            .selectHobbies(data.hobbie)
                            .setState(data.state)
                            .setCity(data.city)
                            .uploadPicture(data.foto)
                            .clickSubmit();
        });
        step("Check result in modal window", () -> {
            registrationPage.checkResults("Student Name", data.firstName + " " + data.lastName)
                    .checkResults("Student Email", data.email)
                    .checkResults("Gender", data.gender)
                    .checkResults("Mobile", data.phone)
                    .checkResults("Date of Birth", data.day + " " + data.month + "," + data.year)
                    .checkResults("Subjects", data.subject)
                    .checkResults("Hobbies", data.hobbie)
                    .checkResults("Picture", data.foto)
                    .checkResults("Address", data.currentAddress)
                    .checkResults("State and City", data.state + " " + data.city);
        });

    }
}
