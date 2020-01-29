package pages;

import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.support.PageFactory;
import util.Driver;
=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import util.SeleniumUtils;
>>>>>>> cf23fc1f16fb7a3cc467c5bf64d224ace3d4ebb4

public class HomePage {
    private static WebDriver driver = Driver.getDriver();
    public HomePage(){
        PageFactory.initElements(driver, this);
    }



}
