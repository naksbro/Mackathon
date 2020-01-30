package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class JavaPage {

    private static WebDriver driver = Driver.getDriver();
    public JavaPage () {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Web']")
    public WebElement webTab;

    @FindBy (xpath = "//a[@href='/java-tutorial.html']")
    public WebElement java_Btn;

    @FindBy (xpath = "//ul/li/a[contains(@id,'link')]/span")
    public List<WebElement> trendingCourses;

}
