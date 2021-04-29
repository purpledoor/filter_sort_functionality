package cyberAttack;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot {



	public static String pathShot() {
		// Path to take the screenshot.
		Scanner sc = new Scanner(System.in); 
			System.out.println("Please enter the complete path where you want to save the ScreenShot:");
			String path  = sc.nextLine();
			return path;
		
	}

	public static void shotMe(WebDriver driver, String defPath) throws IOException, InterruptedException {
		//Taking the Screenshot and saving
		TakesScreenshot srcShot= ((TakesScreenshot)driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(defPath);
		FileUtils.getFileUtils().copyFile(srcFile,DestFile);
		Thread.sleep(2000);
		driver.quit();
	}

}
