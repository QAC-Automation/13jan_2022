package BasicOpration;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOpration1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.manage().window().setSize(new Dimension(500,700));
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        System.out.println("current page Title"+driver.getTitle());
        System.out.println("current URL"+driver.getCurrentUrl());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        
        driver.navigate().forward();
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);
        
        driver.close();
        
	}

}
