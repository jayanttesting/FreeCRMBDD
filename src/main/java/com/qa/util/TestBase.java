package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() throws FileNotFoundException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:/Maven Project/FreeCrmBDDFramework/src/main/java/com/qa/config/config.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
