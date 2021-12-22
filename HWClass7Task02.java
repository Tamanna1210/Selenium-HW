package com.syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass7Task02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        WebElement element = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>'] "));
        driver.switchTo().frame(element);
        WebElement element1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println("The text is : "+ element1.getText());
    }
}
