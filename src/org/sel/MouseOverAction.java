package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		//driver.manage().window().maximize();
		WebElement btnCourse = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCourse).perform();
		
		WebElement btnOracle = driver.findElement(By.xpath("//span[text()='Java (4)']"));
		acc.moveToElement(btnOracle).perform();
		WebElement btnsql = driver.findElement(By.xpath("//span[text()='Spring Certification Training']"));
btnsql.click();		
	}
}
