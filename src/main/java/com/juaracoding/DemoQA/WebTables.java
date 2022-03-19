package com.juaracoding.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		JavascriptExecutor ja = (JavascriptExecutor) driver;
		ja.executeScript("window.scrollBy(0,500)");
		
		//---Data 1 Positive Test Case---
		WebElement BtnAdd = driver.findElement(By.id("addNewRecordButton"));
		BtnAdd.click();
		
		WebElement FirstName = driver.findElement(By.id("firstName"));
		WebElement LastName = driver.findElement(By.id("lastName"));
		WebElement Email = driver.findElement(By.id("userEmail"));
		WebElement Age = driver.findElement(By.id("age"));
		WebElement Salary = driver.findElement(By.id("salary"));
		WebElement Department = driver.findElement(By.id("department"));
		
		FirstName.sendKeys("Aldi");
		LastName.sendKeys("Budi");
		Email.sendKeys("aldibudi@gmail.com");
		Age.sendKeys("21");
		Salary.sendKeys("10000000");
		Department.sendKeys("IT");
		
		WebElement BtnSubmit = driver.findElement(By.id("submit"));
		BtnSubmit.click();
		
		//---Data 2 Negative Test Case---
		ja.executeScript("window.scrollBy(0,500)");
		
		WebElement BtnAdd2 = driver.findElement(By.id("addNewRecordButton"));
		BtnAdd2.click();
		
		WebElement FirstName2 = driver.findElement(By.id("firstName"));
		WebElement LastName2 = driver.findElement(By.id("lastName"));
		WebElement Email2 = driver.findElement(By.id("userEmail"));
		WebElement Age2 = driver.findElement(By.id("age"));
		WebElement Salary2 = driver.findElement(By.id("salary"));
		WebElement Department2 = driver.findElement(By.id("department"));
		
		FirstName2.sendKeys("");
		LastName2.sendKeys("");
		Email2.sendKeys("datakedua");
		Age2.sendKeys("20");
		Salary2.sendKeys("Kosong");
		Department2.sendKeys("");
		
		WebElement BtnSubmit2 = driver.findElement(By.id("submit"));
		BtnSubmit2.click();
		
	}
}
