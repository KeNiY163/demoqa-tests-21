package guru.qa.tests;

import guru.qa.pages.RegistrationPage;
import guru.qa.BaseTest;
import org.junit.jupiter.api.Test;

import static guru.qa.TestData.*;

public class TestRegistrationForm extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void testRegistrationForm() {

        registrationPage
                .openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(email)
                .setBirthDay(month, year, day)
                .setSubject(subject)
                .setUserNumber(phone)
                .setCurrentAddress(currentAddress)
                .selectGender(gender)
                .selectHobbies(hobbie)
                .setState(state)
                .setCity(city)
                .uploadPicture(foto)
                .clickSubmit();

        registrationPage.checkResults("Student Name", firstName + " " + lastName)
                .checkResults("Student Email", email)
                .checkResults("Gender", gender)
                .checkResults("Mobile", phone)
                .checkResults("Date of Birth", day + " " + month + "," + year)
                .checkResults("Subjects", subject)
                .checkResults("Hobbies", hobbie)
                .checkResults("Picture", foto)
                .checkResults("Address", currentAddress)
                .checkResults("State and City", state + " " + city);

    }

}
