package com.fixitnow.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testLogin() {
        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login"); // Replace with your app URL

        // You can add Selenium steps here, e.g., fill username/password and submit
        // Example:
        // driver.findElement(By.id("username")).sendKeys("admin");
        // driver.findElement(By.id("password")).sendKeys("1234");
        // driver.findElement(By.id("loginButton")).click();

        System.out.println("Login test ran successfully!");

        driver.quit();
    }
}
