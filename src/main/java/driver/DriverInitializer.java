package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverInitializer {
  public static WebDriver initalizeDriver(BrowserType browserType) {
    if (browserType == BrowserType.CHROME) {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-blink-features=AutomationControlled");
//      options.addArguments("--incognito");
//      options.setHeadless(true);
//      options.addArguments("--disable-gpu");
//      options.addArguments("--ignore-certificate-errors");
//      options.addArguments("--window-size=1920,1080");
//      options.addArguments("--allow-running-insecure-content");
//      options.addArguments("--start-maximized");
//      options.addArguments("--no-sandbox");
//      options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36");
      return new ChromeDriver(options);
    } else {
      return new FirefoxDriver();
    }
  }
}
