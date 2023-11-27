import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        
    
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        AssertJUnit.assertFalse(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
        // AssertJUnit.assertTrue(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for( int i = 1; i<5; i++ ){
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
       
        AssertJUnit.assertEquals("5 Adult",driver.findElement(By.id("divpaxinfo")).getText());



    }
    
}
