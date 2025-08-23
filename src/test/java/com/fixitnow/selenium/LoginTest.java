package com.fixitnow.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {

        // Set path to chromedriver if needed
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://your-login-page.com");

            // Wait up to 10 seconds for username field to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement usernameField = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("username"))
            );
            usernameField.sendKeys("yourUsername");

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("yourPassword");

            // Wait until login button is clickable
            WebElement loginButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("loginButton"))
            );
            loginButton.click();

            // Optional: wait for next page to load
            wait.until(ExpectedConditions.urlContains("dashboard"));
            System.out.println("Login successful!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
