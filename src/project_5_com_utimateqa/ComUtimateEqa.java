package project_5_com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class ComUtimateEqa {
    //1. Setup Chrome Browser
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        //Open Url.
        driver.get(baseUrl);
        //Print the title of the page.
        System.out.println("Page Title: " + driver.getTitle());
        //Print the current url.
        System.out.println("Current Url: " + driver.getCurrentUrl());
        //Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());
        //Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();
        //Print the current url
        System.out.println("Current url: " + driver.getCurrentUrl());
        //Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime123@gmail.com");
        //Enter the password to password field.
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("Prime321");
        //Click on Login Button.
        WebElement loginButton = driver.findElement(By.className("form__button-group"));
        loginButton.click();
        //Navigate to baseUrl.
        driver.get(baseUrl);
        //Navigate forward to Homepage.
        driver.navigate().forward();
        //Navigate back to baseUrl.
        driver.navigate().back();
        //Refresh the page.
        driver.navigate().refresh();
        //Close the browser.
        driver.close();
    }
}
