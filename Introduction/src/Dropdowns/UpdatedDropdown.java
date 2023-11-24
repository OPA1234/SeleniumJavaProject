package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        // int i = 1;
        // while (i<5) {
        //     driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        //     i++;
        // }
        for(int i = 1; i<5; i++){
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        }
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.quit();
    }
    
}
