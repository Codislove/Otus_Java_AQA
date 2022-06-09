import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.*;

import org.testng.Assert;

public class BrowserTest {
    static WebDriver driver;

    @BeforeTest
    static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    void teardown() {
        driver.quit();
    }

    @Test
    @Parameters("siteAddress")
    void test(String siteAddress) {

        // Exercise
        driver.get(siteAddress);
        String title = driver.getTitle();
        System.out.println(title);
        // Verify
//        Assert.assertEquals(title, "Selenium WebDriver");
    }
}
