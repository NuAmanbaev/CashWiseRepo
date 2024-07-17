package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClientPage;
import pages.CommonPage;
import pages.HomePage;
import utilities.Config;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    ClientPage clientPage = new ClientPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void  verifyEmptyResults() throws InterruptedException {
        driver.get("https://cashwise.us/main");
        homePage.login("amanbaev62@gmail.com","Amanbaev1997");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(commonPage.sales));
        commonPage.sales.click();
        Thread.sleep(2000);
        clientPage.search("Apple");
        Assert.assertTrue(clientPage.listIsEmpty.isDisplayed());


    }








}
