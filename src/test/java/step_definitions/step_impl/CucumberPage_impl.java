package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AWSPage;
import pages.CucumberPage;
import pages.JavaPage;
import util.Driver;

public class CucumberPage_impl {

    private static WebDriver driver = Driver.getDriver();
    CucumberPage cuke = new CucumberPage();
    JavaPage java = new JavaPage();
    AWSPage aws = new AWSPage();

    public void navigateToPage (String pageName) {
        Actions act = new Actions(driver);
        switch (pageName.toLowerCase()) {
            case "cucumber":
                act.moveToElement(cuke.testingTab).click(cuke.cucumber_Btn).perform();
                break;
            case "java":
                act.moveToElement(java.webTab).click(java.java_Btn).perform();
                break;
            case "aws":
                act.moveToElement(aws.bigDataTab).click(aws.aws_Btn).perform();
                break;
        }
    }

    public String getTrending (String pageName) {
        switch (pageName.toLowerCase()) {
            case "cucumber":
                for (WebElement we : cuke.trendingCourses)
                    return we.getText();
                break;
            case "java":
                for (WebElement we : java.trendingCourses)
                    return we.getText();
                break;
            case "aws":
                for (WebElement we : aws.trendingCourses)
                    return we.getText();
                break;
        }
        return "Nothing to see here";
    }
}
