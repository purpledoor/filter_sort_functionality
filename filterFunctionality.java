package cyberAttack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filterFunctionality {

	public static String acceptValue() {
		
		//This method decides on what the columns are filtered
		String usedValue = null;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter the filtering criteria:");
			usedValue = sc.nextLine();
		
		return usedValue;
		
	}

	public static void startFilter(String Value, WebDriver driver, String path) throws AWTException, IOException, InterruptedException 
	{
		//Navigate to URL
		driver.get("https://mystifying-beaver-ee03b5.netlify.app/");
		driver.manage().window().maximize();
		
		//Filtering with required element
		System.out.println("Please note that the Filtering Functionality is cofigured for Name and Complexity only");
		driver.findElement(By.id("filter-input")).sendKeys(Value);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		//Take Screenshot and save for test test artefact
		screenShot.shotMe(driver,path);
		
	}

}
