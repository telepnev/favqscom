package favqs.test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SimpleTest {
    @Test
    public void openSite() {
        open("https://favqs.com/");
        $("#search").sendKeys("Hello");
        $(".results").shouldHave(Condition.text("Hello"));

    }
}
