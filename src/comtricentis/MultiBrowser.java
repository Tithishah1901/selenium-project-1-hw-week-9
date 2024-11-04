package comtricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseUrl = " https://demowebshop.tricentis.com/";
    static WebDriver driver;
    static String loginUrl = "https://demowebshop.tricentis.com/login";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.navigate().to(loginUrl);
        System.out.println("Get Current URL : " + driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("Get home page : "+ driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println("Get Current URL : " + driver.getCurrentUrl());
        driver.navigate().refresh();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("xyz.123@gmail.com");
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("1234");
        WebElement loginLink = driver.findElement(By.linkText("Log in") );
        loginLink.click();


        driver.quit();
    }
}
