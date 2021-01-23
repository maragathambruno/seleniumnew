package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DpDn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		s.selectByVisibleText("Mar");
//		s.selectByIndex(7);
//		s.selectByValue("6");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> allOptions = s.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement eachOpt = allOptions.get(i);
			System.out.println(eachOpt.getText());
		}
	}

}
