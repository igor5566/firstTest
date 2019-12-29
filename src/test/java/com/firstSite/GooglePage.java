package com.firstSite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.testng.Assert.assertTrue;

public class GooglePage extends FirstClass {

    @Test()
    public void getSearchPage() {
        driver.get("https://www.pdffiller.com/en/login.htm");
//        WebElement login = wait.until(visibilityOfElementLocated(By.cssSelector("input[name='username']")));
//        login.sendKeys("test555@gmail.com");
//        WebElement pass = wait.until(visibilityOfElementLocated(By.cssSelector("input[name='password']")));
//        pass.sendKeys(password, Keys.ENTER);
//
//        WebElement add = wait.until(elementToBeClickable(By.cssSelector("button[class='g-btn g-btn--primary g-btn--sm']")));
//        actions.moveToElement(add).build().perform();
//        WebElement addDocumentBtn = wait.until(visibilityOfElementLocated(By.cssSelector("ul[class='md-head-options'] > li:nth-child(1) > button")));
//        addDocumentBtn.click();
//
//        WebElement input = wait.until(presenceOfElementLocated(By.cssSelector("div[class='drop-zone'] input[accept]")));
//        input.sendKeys("/home/igor/doc1");
//
//        wait.until(presenceOfElementLocated(By.cssSelector("div[id='DoneButton'] > button")));
//        String s = driver.getCurrentUrl();
//        assertTrue(s.contains("jsfiller"));
    }


}
