package cyberAttack;

import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class sortFunctionality {

	//This method decides which column is selected for Sorting.
	public static String acceptValue() {
		String usedValue = null;
		System.out.println("Please enter the sorting criteria i.e. the Column Name to sort the table:");
		Scanner sc = new Scanner(System.in); 
		usedValue = sc.nextLine();
		return usedValue;
}
	

	public static void startSort(String Value, WebDriver driver, String path) throws IOException, InterruptedException {
		//Navigate to URL
		driver.get("https://mystifying-beaver-ee03b5.netlify.app/");
		driver.manage().window().maximize();
		
		//Sorting with the required element
		Select sortMe = new Select(driver.findElement(By.id("sort-select")));
		sortMe.selectByVisibleText(Value);
		
		//Take Screenshot and save for test test artefact
		screenShot.shotMe(driver,path);
		
	}

	
}
