package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.SeleniumUtils;

public class ClientPage {

    public ClientPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id = "name_input_text")
    public WebElement searchBar;

    @FindBy(xpath = "//span[text()='List is empty']")
    public  WebElement listIsEmpty;

    public void search(String stringToSearch) {
        searchBar.sendKeys(stringToSearch + Keys.ENTER);
    }

    public static void main(String[] args) {
        System.out.println();
    }



}
