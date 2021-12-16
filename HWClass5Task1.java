package com.syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWClass5Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
          List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("The size of link list: " + links.size());

        for (WebElement link:links) {
            String LinkList= link.getText();
            //System.out.println(LinkList);

            if(!LinkList.isEmpty()){
                System.out.println(LinkList);
                 String linkAddress= link.getAttribute("href");
                System.out.println(linkAddress);


                System.out.println("----------------------------------------------");
            }

        }

    }
}
