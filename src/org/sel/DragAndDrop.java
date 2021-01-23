package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK '] "));
		WebElement des = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();

	}

}
