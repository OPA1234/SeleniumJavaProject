import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class E2E {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();
        
    
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Bengaluru (BLR)']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("its enabled");
                AssertJUnit.assertTrue(true);
         } 

         driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
         driver.findElement(By.id("divpaxinfo")).click();
         Thread.sleep(2000L);
         for(int i = 1; i<5; i++){
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        }
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
        AssertJUnit.assertEquals("5 Adult",driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();



        


    }
    
}
