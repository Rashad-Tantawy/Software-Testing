import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
    WebDriver driver = new FirefoxDriver();       

  @Test
  public void f() {
	 String  check =  driver.getTitle();
	assertEquals(check, "Maven");
  }
  @BeforeTest
  public void beforeTest() {
	    System.out.println("Welcome to Maven World");
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\rashad.tantawy\\eclipse-workspace\\Etisalat\\geckodriver.exe");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.navigate().to("http://www.google.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
