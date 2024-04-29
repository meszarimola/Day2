import driver.BrowserType;
import driver.DriverInitializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SampleTest {
  //This test runs a sample test to proove the Selenium webdriver and Chrome driver work properly
  @Test
  public void sampleTest() throws InterruptedException {
    String expected = "Masterfield Training Centre";

    WebDriver driver = DriverInitializer.initalizeDriver(BrowserType.CHROME);
    driver.get("https://masterfield.hu/en");
    String actual = driver.getTitle();
    Assertions.assertEquals(expected, actual);
    driver.quit();
  }
}
