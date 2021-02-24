package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectsRepository.RediffHomePF;
import objectsRepository.RediffLoginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {
  public WebDriver driver;

//RediffLoginpage is implemented in normal page object pattern style
  //RediffHomePF is implemented in page objects factory methods

  @Test
  public void login() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    //call objects from RediffLoginpage class

    RediffLoginpage rediff_login_page = new RediffLoginpage(driver);
    //automatically constructor will be executed
    rediff_login_page.emailid().sendKeys("jj@mail.ru");
    rediff_login_page.passingpassword().sendKeys("1234");
    //rediff_login_page.submit().click();
    rediff_login_page.homepage().click();
    Thread.sleep(2000);

    RediffHomePF rediff_home_page_pf = new RediffHomePF(driver);
    rediff_home_page_pf.search_item().sendKeys("coat");
    rediff_home_page_pf.search_button().click();

  }
}
