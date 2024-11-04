package comtricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://demowebshop.tricentis.com/";
        // Launch the Edge browser
        WebDriver driver = new EdgeDriver();
        //open the URL into Browser
        driver.get(baseUrl);

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Print the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url " + currentUrl);

        // Print page source
        System.out.println("The page source : " +driver.getPageSource());

        //Navigate to URL
        String loginUrl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginUrl);

        //Print current url
        System.out.println("Get Current URL : " + driver.getCurrentUrl());

        //Navigate back to home page
        driver.navigate().back();
        System.out.println("Get home page : "+ driver.getCurrentUrl());

        //Navigate to the login page
        driver.navigate().forward();

        // Print current url
        System.out.println("Get Current URL : " + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("xyz.123@gmail.com");

        // Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("1234");

        // click on the login button
        WebElement loginLink = driver.findElement(By.linkText("Log in") );
        loginLink.click();

        // Close the Browser
        driver.quit();

    }
}

