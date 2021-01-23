package org.sel;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleJavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement down = driver.findElement(By.xpath("//h3[text()='Selenium Class']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(3000);
		WebElement top = driver.findElement(By.xpath("//div[text()='Courses ']"));
		js.executeScript("arguments[0].scrollIntoView(false)", top);

	}

}
