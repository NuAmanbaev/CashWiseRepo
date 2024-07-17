package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class HomePageTests {
    WebDriver driver = Driver.getDriver();

    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get("https://cashwise.us");
        HomePage homePage = new HomePage();
        SeleniumUtils seleniumUtils = new SeleniumUtils();
        homePage.login("amanbaev62@gmail.com","Amanbaev1997");
        SeleniumUtils.waitForSeconds(1);

    }










}



