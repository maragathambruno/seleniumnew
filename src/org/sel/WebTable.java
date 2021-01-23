package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\marag\\eclipse-workspace\\maven\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//change url
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> allTable = driver.findElements(By.tagName("table"));
		System.out.println(allTable.size());
		//1.to fetch all the data from table
		WebElement table = driver.findElement(By.id("customers"));
		
		//to fetch all the rows
		List<WebElement> allRows =table.findElements(By.tagName("tr"));
		
		//to  find the no of rows
		System.out.println(allRows.size());
		
		//iterate rows
		for (int i = 0; i < allRows.size(); i++) {
			WebElement row = allRows.get(i);
			List<WebElement> allData = row.findElements(By.tagName("td"));
			
			//iterate rows data
			for (int j = 0; j < allData.size(); j++) {
				WebElement data = allData.get(j);
				System.out.println(data.getText());
				
			}
			
		}
		
		

		

	}

}
