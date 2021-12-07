package com.syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Tamanna");
        WebElement lastName=driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Faria");
        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys("1231 loveJoy RD");
        WebElement city=driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Buffalo");
        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys("NY");
        WebElement zipCode=driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("14211");
        WebElement phone=driver.findElement(By.id("customer.phoneNumber"));
        phone.sendKeys("716-606-0001");
        WebElement SSN=driver.findElement(By.id("customer.ssn"));
        SSN.sendKeys("000-56-0185");
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("tamanna1210");
        WebElement passWord=driver.findElement(By.id("customer.password"));
        passWord.sendKeys("Hello12345");
        WebElement conFirm=driver.findElement(By.id("repeatedPassword"));
        conFirm.sendKeys("Hello12345");
        WebElement click=driver.findElement(By.className("button"));
        click.click();











    }
}
