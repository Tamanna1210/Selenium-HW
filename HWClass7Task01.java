package com.syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HWClass7Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();


        WebElement insta = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        WebElement facebook = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));

        insta.click();
        Thread.sleep(2000);
        facebook.click();

        Set<String> SetOfWindows = driver.getWindowHandles();
        Iterator<String> iterator = SetOfWindows.iterator();

        String instaWindowHandle=iterator.next();
        String facebookWindowHandle=iterator.next();

        System.out.println("The handle for instagram page is : "+ instaWindowHandle);
        System.out.println("The handle for facebook page is : " +facebookWindowHandle);


    }
}
