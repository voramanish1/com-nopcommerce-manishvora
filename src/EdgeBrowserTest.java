import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set Edge driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Start Edge browser
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get  web elements or page source
        System.out.println("Page source is : " + driver.getPageSource());

        //Find and enter email in email field ele
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        //Find nad enter password in password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");

        //Close browser
        driver.quit();


    }
}
