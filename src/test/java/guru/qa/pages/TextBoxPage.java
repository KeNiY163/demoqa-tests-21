package guru.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {

    SelenideElement
                    userName = $("#userName"),
                    userEmail = $("#userEmail"),
                    currentAddress = $("#currentAddress"),
                    permanentAddress = $("#permanentAddress"),
                    submitButton = $("#submit"),
                    outputName = $("#output #name"),
                    outputEmail = $("#output #email"),
                    outputCurrentAddress = $("#output #currentAddress"),
                    outputPermanentAddress = $("#output #permanentAddress");


    public TextBoxPage openPage(){

        open("text-box");
        deleteAdBanner();

        return this;
    }

    public void deleteAdBanner(){

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

    }

    public TextBoxPage setUserName(String value){

        userName.setValue(value);

        return this;

    }

    public TextBoxPage setUserEmail(String value){

        userEmail.setValue(value);

        return this;

    }

    public TextBoxPage setCurrentAddress(String value){

        currentAddress.setValue(value);

        return this;

    }

    public TextBoxPage setPermanentAddress(String value){

        permanentAddress.setValue(value);

        return this;

    }

    public void submitForm(){

        submitButton.click();

    }

    public TextBoxPage checkSubmitResultName(String value){

        outputName.shouldHave(Condition.text(value));

        return this;

    }

    public TextBoxPage checkSubmitResultEmail(String value){

        outputEmail.shouldHave(Condition.text(value));

        return this;

    }

    public TextBoxPage checkSubmitResultCurrentAddress(String value){

        outputCurrentAddress.shouldHave(Condition.text(value));

        return this;

    }

    public void checkSubmitResultPermanentAddress(String value){

        outputPermanentAddress.shouldHave(Condition.text(value));

    }


}
