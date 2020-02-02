package com.firstSite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.testng.Assert.assertTrue;

public class PdffillerPage extends FirstClass {

    @Test()
    public void downloadDoc() {
        driver.get("https://www.pdffiller.com/en/login.htm");
        WebElement login = wait.until(visibilityOfElementLocated(By.cssSelector("input[name='username']")));
        login.sendKeys("test555@gmail.com");
        WebElement pass = wait.until(visibilityOfElementLocated(By.cssSelector("input[name='password']")));
        pass.sendKeys("test12345", Keys.ENTER);

        WebElement add = wait.until(elementToBeClickable(By.cssSelector("button[class='g-btn g-btn--primary g-btn--sm']")));
        actions.moveToElement(add).build().perform();
        WebElement addDocumentBtn = wait.until(visibilityOfElementLocated(By.cssSelector("ul[class='md-head-options'] > li:nth-child(1) > button")));
        addDocumentBtn.click();

        WebElement input = wait.until(presenceOfElementLocated(By.cssSelector("div[class='drop-zone'] input[accept]")));
        input.sendKeys("/home/igor/Ihor_Volkov_CV.pdf");

        wait.until(presenceOfElementLocated(By.cssSelector("div[id='DoneButton'] > button")));
        String s = driver.getCurrentUrl();
        assertTrue(s.contains("jsfiller"));
    }


}
