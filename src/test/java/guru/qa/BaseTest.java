package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    @BeforeAll
    public static void beforeAll(){

        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        //Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        //DesiredCapabilities capabilities = new DesiredCapabilities();

        //capabilities.setCapability("enableVNC", true);
        //capabilities.setCapability("enableVideo", true);

        //Configuration.browserCapabilities = capabilities;

    }

    @BeforeEach
    void addListener(){

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

    }

    @AfterAll
    public static void afterAll(){

        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
    }

}
