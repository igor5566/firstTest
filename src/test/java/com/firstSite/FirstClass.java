package com.firstSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class FirstClass {
    public WebDriver driver;
    public ChromeOptions options;
    public WebDriverWait wait;
    public Actions actions;

    @BeforeSuite
    public void setDriver() {
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--no-sandbox");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }
}
