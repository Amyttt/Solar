package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
    public static void main(String[] args) {

      WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
      //WebElement test = driver.findElement(By.ByXPath(""));
      driver.get("https://www.google.com/");
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript(driver.findElement(By.id("test")).getCssValue("Title"));
      System.out.println(driver.getTitle());
      driver.quit();

    }
}