package objectsRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPF {

  WebDriver driver;

  public RediffLoginPF(WebDriver driver) {

    this.driver = driver;
    PageFactory.initElements(driver, this);

  }

  //передаю драйвер в конструктор

  /*By username = By.xpath(".//*[@id='login1']"); //look at the annotation FindBy
  By password = By.name("passwd");
  By go = By.name("proceed");
  By home = By.linkText("rediff.com");*/

  @FindBy(xpath = ".//*[@id='login1']")
  WebElement username;

  @FindBy(name = "passwd")
  WebElement password;

  @FindBy(name = "proceed")
  WebElement go;

  @FindBy(linkText = "rediff.com")
  WebElement home;


  public WebElement emailid(){

    return username;

  }

  public WebElement passingpassword(){

    return password;

  }

  public WebElement submit(){

    return go;

  }

  public WebElement homepage(){

    return home;

  }

}
