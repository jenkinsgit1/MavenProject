package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
@org.testng.annotations.Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub

	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Chrome 99\\chromedriver9\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);

	}

}
