package com.prjct.qa.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.prjct.qa.util.TestUtil;

public class TestBase {

  public static WebDriver driver;
  public static Properties prop;
 
	  public TestBase() {
	  try {
		  prop = new Properties();
		  FileInputStream ip = new FileInputStream("C:\\Users\\mkokane\\Downloads\\testexacta-master\\testexacta-master\\src\\main\\java\\com\\prjct\\qa\\config\\config.properties");
		  prop.load(ip);
	  }
	  catch(FileNotFoundException e) {
		  
		  e.printStackTrace();
	  }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
	  }
	  public static void initilization() {
		  
		  String browsername= prop.getProperty("browser");
		  if(browsername.equalsIgnoreCase("Chrome")) {
			 driver= new ChromeDriver();
		  }
		  else if(browsername.equalsIgnoreCase("Firefox")) {
			  driver= new FirefoxDriver();
		  }
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	  driver.get(prop.getProperty("url"));
	  }
	  
  }
	
