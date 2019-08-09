package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Selen1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        {
            driver.get("http://www.yandex.ru");
            WebElement element;
            //element = driver.findElement(By.id("news__tab-wrapper news__head-item"));
            element = driver.findElement(By.name("Сейчас в СМИ"));
            element = driver.findElement(By.xpath("//input[@id='passwd-id']"));

        }
    }
}
