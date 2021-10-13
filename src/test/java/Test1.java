import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;
    private Object JavascriptExecutor;

    @BeforeMethod
    void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natallia\\Documents\\Work\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterMethod
    void stop(){
        driver.quit();

    }

    @Test
    public void TestSum() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement genderFemale = driver.findElement(By.cssSelector("[for='gender-radio-2']"));
        WebElement userNumber = driver.findElement(By.id("userNumber"));
        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
        WebElement hobbies = driver.findElement(By.cssSelector("[for='hobbies-checkbox-2']"));
        WebElement chooseFileB = driver.findElement(By.id("uploadPicture"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement state = driver.findElement(By.cssSelector("#state .css-1hwfws3"));
        WebElement city = driver.findElement(By.id("city"));
        WebElement submitB = driver.findElement(By.id("submit"));





        firstName.sendKeys("Natallia");
        lastName.sendKeys("Mark");
        email.sendKeys("test@email.com");
        genderFemale.click();
        userNumber.sendKeys("1113779063");
        dateOfBirth.click();
        dateOfBirth.sendKeys(Keys.CONTROL+ "a");
        dateOfBirth.sendKeys("11/06/1989", Keys.ENTER);
        hobbies.click();
        chooseFileB.sendKeys("C:\\Users\\Natallia\\Pictures\\Stork.jpg");
        currentAddress.sendKeys("Walpole, MA");
        JavascriptExecutor je = (JavascriptExecutor)driver;
        je.executeScript("window.scrollBy(0,250)");
//        state.click();
//        state.sendKeys(Keys.ENTER);
//        Select dropdown = new Select(driver.findElement(By.className(" css-26l3qy-menu")));
//        dropdown.selectByVisibleText("NCR");
//
//
//        Select dropdown2 = new Select(city);
//        dropdown2.selectByVisibleText("Noida");
        submitB.click();

        WebElement title = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assert.assertEquals(title.getText(), "Thanks for submitting the form");







    }


}
