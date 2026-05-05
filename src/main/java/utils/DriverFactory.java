package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Maximaize browser with feature/login-test branch");
        return driver;
    }

    public void loginTest() {
        System.out.println("Login Test - Changed by Branch feature/login");
    }

    public void loginTest2() {
        System.out.println("Login Test2 - feature/login Code");
    }
}
