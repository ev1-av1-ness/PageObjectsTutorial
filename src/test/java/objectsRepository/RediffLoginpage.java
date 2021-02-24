package objectsRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

  WebDriver driver;

  public RediffLoginpage(WebDriver driver) {

    this.driver = driver;

  }

  //передаю драйвер в конструктор

  By username = By.xpath(".//*[@id='login1']");
  By password = By.name("passwd");
  By go = By.name("proceed");
  By home = By.linkText("rediff.com");

  public WebElement emailid(){

    return driver.findElement(username);

  }

  public WebElement passingpassword(){

    return driver.findElement(password);

  }

  public WebElement submit(){

    return driver.findElement(go);

  }

  public WebElement homepage(){

    return driver.findElement(home);

  }

}
