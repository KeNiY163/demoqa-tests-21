package guru.qa.tests;

import guru.qa.BaseTest;
import guru.qa.TestData;
import guru.qa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TestTextBox extends BaseTest {

    TestData data = new TestData();
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void testTextBox() {

        textBoxPage.openPage()
                .setUserName(data.firstName + " " + data.lastName)
                .setUserEmail(data.email)
                .setCurrentAddress(data.currentAddress)
                .setPermanentAddress(data.currentAddress)
                .submitForm();

        textBoxPage.checkSubmitResultName(data.firstName + " " + data.lastName)
                .checkSubmitResultEmail(data.email)
                .checkSubmitResultCurrentAddress(data.currentAddress)
                .checkSubmitResultPermanentAddress(data.currentAddress);

    }

}
