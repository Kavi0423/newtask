package org.global;

import java.io.IOException;
import java.util.List;

import org.login.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingClass extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass b = new BaseClass();
		
		b.getDriver();
		b.getUrl("https://www.saucedemo.com/");
		b.winMAx();
		WebElement username = driver.findElement(By.id("user-name"));
		b.textSend(username, "standard_user");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		b.textSend1(password, "secret_sauce");
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.id("login-button"));
		b.button(click);
		Thread.sleep(2000);
		List<WebElement> addtocart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		for(int i=0;i<addtocart.size();i++) {
			WebElement adds=addtocart.get(i);
			b.add(adds);
		}
	    WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    b.button1(cart);
	    Thread.sleep(2000);
	    List<WebElement> remove = driver.findElements(By.xpath("//button[text()='Remove']"));
	    for(int i=0;i<2;i++) {
			WebElement removes=remove.get(i);
			b.remove(removes);
		}
	    Thread.sleep(2000);
	    WebElement checkout = driver.findElement(By.id("checkout"));
	    b.scroll(checkout, "Down");
	    b.check(checkout);
	    Thread.sleep(2000);
	    WebElement firstname = driver.findElement(By.id("first-name"));
		b.textSend2(firstname, "Priya");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.id("last-name"));
		b.textSend3(lastname, "Devi");
		Thread.sleep(2000);
		WebElement postcode = driver.findElement(By.id("postal-code"));
		b.textSend4(postcode, "600100");
		Thread.sleep(2000);
		WebElement click2 = driver.findElement(By.id("continue"));
		b.button2(click2);
		Thread.sleep(2000);
		WebElement click3 = driver.findElement(By.id("finish"));
		b.finish(click3);
		Thread.sleep(2000);
		WebElement click4 = driver.findElement(By.id("back-to-products"));
		b.back(click4);
		Thread.sleep(2000);
		WebElement click5 = driver.findElement(By.id("react-burger-menu-btn"));
		b.main(click5);
		Thread.sleep(2000);
		WebElement click6 = driver.findElement(By.xpath("//a[text()='Logout']"));
		b.logout(click6);
	}

}
