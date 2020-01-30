package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class CucumberPage {

    private static WebDriver driver = Driver.getDriver();
    public CucumberPage () {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//span[text()='Testing']")
    public WebElement testingTab;

    @FindBy (xpath = "//a[@href='/cucumber-tutorials.html']")
    public WebElement cucumber_Btn;

    @FindBy (xpath = "//ul/li/a[contains(@id,'link')]/span")
    public List<WebElement> trendingCourses;

}
