package com.syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwClass5Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(2000);

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Tamanna");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Faria");
        WebElement mobileOrEmail=driver.findElement(By.name("reg_email__"));
        mobileOrEmail.sendKeys("716-550-0001");
        WebElement newPass=driver.findElement(By.name("reg_passwd__"));
        newPass.sendKeys("Hello12345");
        driver.findElement(By.name("birthday_month")).sendKeys("Dec");
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        driver.findElement(By.name("birthday_year")).sendKeys("1993");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();

    }
}
