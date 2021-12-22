package com.syntax.HomeWorks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass6Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();


        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);
        Alert confermationAlert = driver.switchTo().alert();
        confermationAlert.dismiss();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Hello Word"); promptAlert.accept();



    }
}
