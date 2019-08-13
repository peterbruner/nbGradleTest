/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;

/**
 *
 * @author pbruner
 */
public class Testtest {
    WebDriver driver;
    
    @BeforeClass
    public void oneTimeSetup() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/pbruner/Documents/chromedriver.exe");
    }
    
    @Test
    public void testAppGreeting() {
        Assert.assertTrue(true);
    }
    
//    @Test
//    public void launch() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://duckduckgo.com");
//        driver.close();
//        driver.quit();
//    }
}
