package org.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public void winMAx() {
		driver.manage().window().maximize();
	}
	public void textSend(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void textSend1(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void button(WebElement element) {
		element.click();
	}
	public void add(WebElement element) {
		element.click();
	}
	public void button1(WebElement element) {
		element.click();
	}
	public void remove(WebElement element) {
		element.click();
	}
	public void scroll(WebElement element, String type) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		switch (type) {
		case "Up":
			js.executeScript("arguments[0].scrollIntoView(false)", element);
			break;

		case "Down":
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			break;

		default:
			System.out.println("In Valid Type");
			break;
		}

	}
	public void check(WebElement element) {
		element.click();
	}
	public void textSend2(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void textSend3(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void textSend4(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void button2(WebElement element) {
		element.click();
	}	
	public void finish(WebElement element) {
		element.click();
	}
	public void back(WebElement element) {
		element.click();
	}
	public void main(WebElement element) {
		element.click();
	}
	public void logout(WebElement element) {
		element.click();
	}
}
