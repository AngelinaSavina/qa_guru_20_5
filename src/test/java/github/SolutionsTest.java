package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SolutionsTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = CHROME;
        Configuration.holdBrowserOpen = true;
    }
    

    @Test
    void selenideWiki(){
        Selenide.open("/selenide/selenide");
        $$(".HeaderMenu-item").findBy(text("Solution")).hover();
        $("[href='/enterprise']").click();
        $(byText("Build like the best")).shouldHave(visible);
    }
}
