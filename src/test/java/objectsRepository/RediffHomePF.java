package objectsRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePF {

  WebDriver driver;

  public RediffHomePF(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);

  }

  //передаю драйвер в конструктор
  /*By search_field = By.id("srchword");
  By search_button = By.xpath("//input[@type='submit']");*/

  @FindBy(id = "srchword")
  WebElement search_field;

  @FindBy(xpath = "//input[@type='submit']")
  WebElement search_button;

  public WebElement search_item(){
    return search_field;

  }

  public WebElement search_button(){
    return search_button;

  }



}
