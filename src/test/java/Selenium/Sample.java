package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
    }
}
