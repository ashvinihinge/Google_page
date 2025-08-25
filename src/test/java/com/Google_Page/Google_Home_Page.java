package com.Google_Page;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Home_Page {

	
	@Test
	public void openGooglePage() {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		

	}
}
