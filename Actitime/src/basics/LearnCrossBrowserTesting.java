package basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnCrossBrowserTesting {
	static WebDriver driver;
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the browser");
	String browser = s.next();
	if(browser.equals("Chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("Edge")){
		 driver=new EdgeDriver();
	}else if(browser.equals("Firefox")) {
		 driver=new FirefoxDriver();
	}else {
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	driver.quit();
	}
}
