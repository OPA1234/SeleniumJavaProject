import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction  {

	public static void main(String[] args) {
		
		
		//Invoking Browser
		//Chrome - ChromeDriver --> Methods
//		WebDriver driver = new ChromeDriver();
		
		//chromedriver.exe
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
