import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Sample {

//public ChromeDriver driver;
@Test
public void loginPage() {
System.setProperty("webdriver.chrome.driver", "C:/chromeDriver/chromedriver.exe");	
	//WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();

//driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
}
/*driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
String title = driver.getTitle();
System.out.println(title);*/