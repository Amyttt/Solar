package org.designer.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    private WebDriver driver;

    //Locaters
    /*
    WebElement HomeMenu = driver.findElement(By.xpath("//a[@title='Home']"));
    WebElement SegenLogo = driver.findElement(By.xpath());
    WebElement SearchIcon = driver.findElement(By.xpath());
    WebElement Searchtextfield = driver.findElement(By.xpath());
    WebElement ContactName = driver.findElement(By.xpath());
    */

    //By Locaters
    private By Homemenuby = By.xpath("//a[@title='Home']");
    private By SegenLogoby = By.xpath("//div[@class='searchIcon']");
    private By SearchIconby = By.xpath("//input[@id='SearchText']");
    private By Searchtextfieldby = By.xpath("//button[@id='searchBtn']");
    private By ContactNameby = By.xpath("//span[contains(text(), 'Welcome ')]");

    //Constructor
    public Homepage(WebDriver driver){
        this.driver = driver;
    }


    //public methods
    public void clickHomeMenu(){
        WebElement Homemenu = driver.findElement(Homemenuby);
        Homemenu.click();
    }


}
