package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launch the Firefox Driver
        WebDriver driver = new FirefoxDriver();

        //Get the url in to browser
        driver.get(baseUrl);

        //Maximize the browser
        driver.manage().window().maximize();

        //Set the implicit wait for the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the URL of the page
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Username field element and type the username into username field element
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        //Find the password field element and type the password in to password field element
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        //Close the browser
        driver.quit();
    }
}
