package com.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutvi\\Downloads\\96_chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
