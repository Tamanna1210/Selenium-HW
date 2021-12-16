package com.syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HWClass5Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        List<WebElement> categories = driver.findElements(By.tagName("a"));
        System.out.println("The size of links: " + categories.size());
        for (WebElement category : categories) {
            String linkText = category.getText();
            //System.out.println(linkText);
            if (!linkText.isEmpty()) {
                System.out.println(linkText);

            }
        }
        WebElement DropDown = driver.findElement(By.cssSelector("select#gh-cat"));
        Select select = new Select(DropDown);
        //select.selectByValue("58058");
        select.selectByVisibleText("Computers/Tablets & Networking");
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        WebElement Title = driver.findElement(By.cssSelector("span.b-pageheader__text"));
        System.out.println(Title.getText());

        if (Title.getText().equalsIgnoreCase("Computers, Tablets & Network Hardware")) {
            System.out.println("-----------------Title Verified--------------------------- ");
        }

    }
}

