package Selenium247;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String [] a) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
}

}