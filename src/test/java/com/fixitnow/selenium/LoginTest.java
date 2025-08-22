package com.fixitnow.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT) // starts app at localhost:8080
public class LoginTest {

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login");

        // Example login actions (uncomment after you have elements)
        // driver.findElement(By.id("username")).sendKeys("admin");
        // driver.findElement(By.id("password")).sendKeys("1234");
        // driver.findElement(By.id("loginButton")).click();

        System.out.println("Login test ran successfully!");
        //driver.quit();
    }
}
