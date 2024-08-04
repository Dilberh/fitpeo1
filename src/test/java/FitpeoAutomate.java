import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FitpeoAutomate {

	

		public static void main(String[] args) throws Exception {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.fitpeo.com/");
			driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
			
			
			
			
			
			
			Thread.sleep(3000);
			//js.executeScript("arguments[0].scrollIntoView",txtbox);
			js.executeScript("window.scrollBy(0,400)","");
			
			WebElement txtbox=driver.findElement(By.xpath("//input[@type='number']"));
			WebElement slider=driver.findElement(By.xpath("//span[@class='MuiSlider-track css-10opxo5']"));
			Actions act=new Actions(driver);
			act.dragAndDropBy(slider,108,0).perform();
			
			Thread.sleep(3000);
			
			js.executeScript("document.getElementById(':r0:').value='560';"); 
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,600)","");
			
			driver.findElement(By.xpath("//span[text()='57']")).click();
			driver.findElement(By.xpath("//span[text()='19.19']")).click();
			driver.findElement(By.xpath("//span[text()='63']")).click();
			driver.findElement(By.xpath("//span[text()='15']")).click();
			String expecheaddisplay="Total Recurring Reimbursement for all Patients Per Month:";
			WebElement actuldisylay=driver.findElement(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']"));
			
			Assert.assertEquals(actuldisylay, expecheaddisplay);
			
		
			
					

		}

	


	}


