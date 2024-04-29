package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.parts.TextButtonPart;

public class HomePage extends BasePage{
  private TextButtonPart textButtonPart;
  private WebDriver webDriver;
  @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
  private WebElement privacyPolicyBtn;

  public HomePage(WebDriver driver){
    this.webDriver = driver;
    PageFactory.initElements(driver, this);
  }

  public void clickOnPrivacyPolicyBtn(){
    privacyPolicyBtn.click();
  }

}
