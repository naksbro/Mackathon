package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class AWSPage {

    private static WebDriver driver = Driver.getDriver();
    public AWSPage () {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Big Data']")
    public WebElement bigDataTab;

    @FindBy (xpath = "//a[@href='/aws-tutorial.html']")
    public WebElement aws_Btn;

    @FindBy (xpath = "//ul/li/a[contains(@id,'link')]/span")
    public List<WebElement> trendingCourses;
}
