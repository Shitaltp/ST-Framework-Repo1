package com.flipkart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver driver = null;
	public static Properties prop = null;

	public TestBase() {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/flipkart/configuration/config.properties");
		} catch (FileNotFoundException e) {
			System.out.println("File path is incorrect");
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			System.out.println("unable to find properties file");
		}
	}

	@BeforeMethod
	public static void initialization() {
		String	browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.err.println("Invalid broswer name");
		}
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public static void closeApplication() {
		driver.close();
	}

}

