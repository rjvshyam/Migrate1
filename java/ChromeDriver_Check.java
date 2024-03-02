

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriver_Check {

	
public static void main(String[] args) {
/*WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
int temp = 0;
for (int i=1; i<=10; i++) 
temp +=i;
System.out.println(temp);*/
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
/*driver.get("https://www.google.com/");
String color =driver.findElement(By.xpath("//a[@aria-label='Sign in']")).getCssValue("background-color");
System.out.println(color);
String color1 = Color.fromString(color).asHex();
System.out.println(color1);*/
driver.get("https://www.ironspider.ca/forms/checkradio.htm");
System.out.println(driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]//input[1]")).isSelected());
System.out.println(driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]//input[2]")).isSelected());
}
}
