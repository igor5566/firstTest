package com.firstSite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.awt.event.MouseEvent;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static org.testng.Assert.assertTrue;

public class GooglePage extends FirstClass {
    @Test
    public void getSearchPage() throws InterruptedException {
       driver.get("https://www.pdffiller.com/en/login.htm");
       WebElement login = wait.until(visibilityOfElementLocated(By.cssSelector("input[name='username']")));
       login.sendKeys("******");
       WebElement pass = wait.until(visibilityOfElementLocated(By.cssSelector("input[name='password']")));
       pass.sendKeys("******", Keys.ENTER);

       WebElement add = wait.until(visibilityOfElementLocated(By.cssSelector("button[class='g-btn g-btn--primary g-btn--sm']")));
       actions.moveToElement(add).build().perform();
       WebElement addDocumentBtn = wait.until(visibilityOfElementLocated(By.cssSelector("ul[class='md-head-options'] > li:nth-child(1) > button")));
       addDocumentBtn.click();

       WebElement input = wait.until(presenceOfElementLocated(By.cssSelector("div[class='drop-zone'] input[accept]")));
       input.sendKeys("/Users/ihor/Documents/apps/27-08-2019-Bicycle-Suppliers.pdf");

       wait.until(presenceOfElementLocated(By.cssSelector("div[id='DoneButton'] > button")));
       String s = driver.getCurrentUrl();
       assertTrue(s.contains("jsfiller"));
    }

}
