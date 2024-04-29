import driver.BrowserType;
import driver.DriverInitializer;
import driver.Settings;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;

public class WalkingSkeletonTest {
  WebDriver webDriver;
  WebDriverWait wait;
  HomePage homePage;
  String menuText = "//*[@id=\"groceries\"]/a";

  @Before
  public void initializeDriver() {
    webDriver = DriverInitializer.initalizeDriver(BrowserType.CHROME);
    wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    webDriver.manage().window().maximize();
    homePage = new HomePage(webDriver);
  }

  @Given("I open the base URL")
  public void iOpenTheBaseWebsite() {
    webDriver.get(Settings.BASE_URL);
  }

  @When("I accept privacy policy")
  public void iAcceptPrivacyPolicy() throws InterruptedException {
    homePage.clickOnPrivacyPolicyBtn();
  }

  @Then("The menu is visible")
  public void theMenuIsVisible(){
    String actualMenuTitle = webDriver.findElement(By.xpath(menuText)).getText();
    String expectedMenuTitle = "Groceries";
    Assertions.assertEquals(expectedMenuTitle, actualMenuTitle);
  }

  @After
  public void closeDriver() {
    webDriver.quit();
  }
}
