package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Creating a private constructor to close access to the obj of this class from outside the class
    private Driver(){}

    //We make WebDriver private b/c we want to close access from outside the class
    //Static b/c we will use it in a static method.
    private static WebDriver driver;

    //Create a reusable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){

        if(driver==null){

            //we read our browser type from the config reader prop, this way we control which browser opens.
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            }
        }

        return driver;

    }

    //driver.quit() ---> no such session
    //driver.close() --->
    //try to create a method named closeDriver

    public static void closeDriver(){
        if (driver != null){
            driver.quit(); // this line will terminate the existing session. value will not even be null
            driver = null;
        }
    }

}
