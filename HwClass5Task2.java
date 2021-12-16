package com.syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwClass5Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

      WebElement userName= driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
      userName.sendKeys("Admin");
        WebElement passWord= driver.findElement(By.xpath("//div[@id='divPassword']/input"));
        passWord.sendKeys("");
        driver.findElement(By.xpath("//input[starts-with(@value,'LOG')]")).click();
        WebElement EmptyPass= driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println(EmptyPass.getText());

        if(EmptyPass.getText().equals("Password cannot be empty")){
            System.out.println("Test passed ");

        }
    }
}
