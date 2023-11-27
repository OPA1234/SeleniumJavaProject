import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class CalendarUI {
    public static void main(String[] args) throws InterruptedException {
        

        
        WebDriver driver = new ChromeDriver();
        
    
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Bengaluru (BLR)']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        // System.out.println(driver.findElement(By.xpath(".ui-state-default.ui-state-highlight.ui-state-active")).getText());
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
         if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("its enabled");
                AssertJUnit.assertTrue(true);
         } else {
            System.out.println("its disabled");
            AssertJUnit.assertTrue(false);
         }
         driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
         if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("its enabled");
                AssertJUnit.assertTrue(true);
         } else {
            System.out.println("its disabled");
            AssertJUnit.assertTrue(false);
         }



    }
    }
    

