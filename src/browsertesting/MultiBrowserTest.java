package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        //Open the url into the browser
        driver.get(baseUrl);

        //Maximize the window
        driver.manage().window().maximize();

        //Set the implicit wait for the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the current Url
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Username field element and type username into the username field element
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        //Find the Password field element and type password into the password field element
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        //Close the browser.
        driver.close();
    }
}
