package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.DriverFactory;

    public class LoginTest {

        @Test
        public void testLogin() {
            WebDriver driver = DriverFactory.getDriver();
            driver.get("https://www.google.com");
            System.out.println("Login Test Executed");
            driver.quit();
        }

        public void loginTest() {
            System.out.println("Login Test - Updated by feature branch");
        }
    }

