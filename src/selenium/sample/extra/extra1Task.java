package selenium.sample.extra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.utility.BootcampUtils;

import java.io.File;

public class extra1Task {
    WebDriver driver;
    String base_url = "https://kristinek.github.io/site/examples/act";
    String new_url = "https://kristinek.github.io/site/examples/link1";

    // method which is being run before each test
    @BeforeEach
    public void startingTests() throws Exception {
        // Initialize driver
        driver = BootcampUtils.initializeChromeDriver();

        //open page:
        driver.get(base_url);
    }

    // method which is being run after each test
    @AfterEach
    public void endingTests() throws Exception {
        driver.close();
    }

    @Test
    public void navigateBack() throws Exception {
//        TODO
//        open page with url "https://kristinek.github.io/site/examples/po"
//        click "More > " for the top left element
//        check that the url now "https://kristinek.github.io/site/examples/po1"
//        using driver navigation go back to "https://kristinek.github.io/site/examples/po"
//        check that the page now is "https://kristinek.github.io/site/examples/po"
    }

    @Test
    public void navigateForward() throws Exception {
//        TODO
//        open page with url "https://kristinek.github.io/site/examples/po"
//        click "More > " for the top left element
//        using driver navigation go back to "https://kristinek.github.io/site/examples/po"
//        using driver navigation go forward to "https://kristinek.github.io/site/examples/po1"
//        check that the page now is "https://kristinek.github.io/site/examples/po1"
    }

    @Test
    public void refresh() throws Exception {
//        TODO
//        open page "https://kristinek.github.io/site/examples/act"
//        click on "Show" button in 'Button' section
//        check that text "I am here!" is seen
//        refresh page
//        check that text "I am here!" is not seen
    }
}
