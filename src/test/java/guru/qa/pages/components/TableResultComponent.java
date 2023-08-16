package guru.qa.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableResultComponent {

    SelenideElement tableResponsive = $(".table-responsive");

    public void checkResults(String value, String valueCheck) {

        tableResponsive.$(byText(value)).parent().shouldHave(Condition.text(valueCheck));


    }


}
