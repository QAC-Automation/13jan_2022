package AssigmentNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Actitimeassignment11 {

	
		public static void main(String[] args) {
			//set path to program 
			SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
			

			System.out.println(driver.getTitle());
			System.out.println(driver.getTitle().equals("actiTIME - Login"));
			// put username & password & click login button
			WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
			user.sendKeys("admin");
			WebElement pass = driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input"));
			pass.sendKeys("manager");
			WebElement button = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
			button.click();
		
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getCurrentUrl().equals("https://demo.actitime.com/login.do"));
			//click on task tab
			WebElement task = driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[4]/a"));
			task.click();
			//click on add task
			WebElement addtask = driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]"));
			addtask.click();
			//click on new Task
			WebElement newtask = driver.findElement(By.xpath("/html/body/div[19]/div[3]"));
			newtask.click();
			//click on down arrow in create new task
			WebElement clickarrow = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]"));
			clickarrow.click();
//			//click on galaxy corporation
			WebElement galaxy = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[2]/div/div[1]/div/div[4]"));
			galaxy.click();
//			//click on another dropdown
			WebElement clickarrow2 = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[1]/div[3]"));
			clickarrow2.click();
//			//click on android testing
			WebElement android = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[1]/div/div/div[2]/div/div[1]/div/div[5]"));
			android.click();
			
//			//create task name
		//	WebElement taskname = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[1]/input"));
		//	taskname.sendKeys("Kajal Project");
//			//estimate budget
//			WebElement budget = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[3]/input"));
//			budget.sendKeys("200000");
//			//click on deadline
//			WebElement deadline = driver.findElement(By.cssSelector(".x-btn-text"));
//			deadline.click();
//			//click on next month arrow
////			WebElement nextmonth = driver.findElement(By.xpath("//*[@id=\"ext-gen325\"]/tbody/tr[2]/td/table/tbody/tr[4]/td[5]/a/em/span"));
////			nextmonth.click();
//			//select type of work
//			WebElement typeofwork = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[5]/div[2]/div"));
//			typeofwork.click();
//			//choose the work
//			WebElement work = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[5]/div[1]/div/div/div[1]/div/div[3]/div"));
//			work.click();
//			//create task
			WebElement create = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[2]/div[2]/div[1]/div/div[1]"));
			create.click();
////			Thread.sleep(3000);
//			//click on check box
			WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/table/tbody/tr/td[1]/div/div"));
			checkbox.click();
//			
			//delete task
			WebElement delete = driver.findElement(By.className("delete button"));
			delete.click();
			//delete permanently
			WebElement prodelete = driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[2]/div[1]/div[1]/div/div[5]/div[1]/div"));
			prodelete.click();
			WebElement logout = driver.findElement(By.xpath("//*[@id=\"logoutLink\"]"));
			logout.click();
			
		}

	
	}


