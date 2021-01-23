package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindHand {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//p[text()='9lives 70%(v/v) Alcohol Based Hand Sanitizer | 1000 ml_Pack of 2 | Kills 99.9% Germs | with Tea Tree Oil & Organic Glycerine']"))
				.click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWind = driver.getWindowHandles();
		System.out.println(parentWindow);
		System.out.println(allWind);
		for (String x : allWind) {
			if (!parentWindow.equals(x)) {
				driver.switchTo().window(x);

			}

		}
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}

}
