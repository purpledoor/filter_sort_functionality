package cyberAttack;

import java.awt.AWTException;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class cyberAttackFunctionalities {


	public static void main(String[] args) throws AWTException, IOException, Exception
	{
		String screenShotPath = null;
		//Path to save the screenShot
		//Include the name of the screenshot file at the end of the path like .png, .jpg etc
		screenShotPath = screenShot.pathShot();

		
		//Current step supports Google Chrome and Mozilla Firefox
		//Select browser
		WebDriver driver = null;
		System.out.println("Select a browser from below");
		System.out.println("1 - Google Chrome");
		System.out.println("2 - Mozilla Firefox");
		Scanner sc = new Scanner (System.in); 
		int b = sc.nextInt();


		//Select the functionality that needs to be tested
		System.out.println("Select from the options below for the Functionality");
		System.out.println("1 - Sort");
		System.out.println("2 - Filter");
		int n = 0;
		String acceptValue = null;
		n = sc.nextInt();


		//Get the value for sorting the column data
		if(n==1)
		{
			acceptValue = sortFunctionality.acceptValue();
		}

		
		//Get the value for filtering the column data
		else if(n==2)
		{
			acceptValue = filterFunctionality.acceptValue();
		}

		
		//Invalid response
		else
		{
			System.out.println("Invalid Selection");
			System.exit(0);
		}

		if(b==1)
		{
			//To run the test on Google Chrome, please download chromeDriver executable file
			//Enter the complete path for the ChromeDriver executable file as the second argument in the setProperty method
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();

		}
		else if(b==2)
		{
			//To run the test on FireFox, please download GeckoDriver executable File
			//Enter the complete path for the GeckoDriver executable file as the second argument in the setProperty method
			System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
			capabilities.setCapability("marionette",true);  
			driver= new FirefoxDriver(capabilities);
		}
		else
		{
			System.out.println("Invalid Selection");
			System.exit(0);
		}



		//Sorting the values
		if(n==1)
		{
			sortFunctionality.startSort(acceptValue, driver, screenShotPath);
		}

		//Filtering the values
		else if(n==2)
		{
			filterFunctionality.startFilter(acceptValue, driver, screenShotPath);
		}



	}


}
