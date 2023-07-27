package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestGitHub {

    @Test
    void testGitHub(){

        TestData data = new TestData();

        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();

        $("#wiki-body").shouldHave(text("Soft assertions"));

        $("#wiki-body").$(withText("Soft assertions")).click();

        $("#repo-content-pjax-container h1").shouldHave(text("SoftAssertions"));

        $("#wiki-body").$(byText("3. Using JUnit5 extend test class:")).sibling(0).shouldHave(text(data.jUnitText));

    }




}
