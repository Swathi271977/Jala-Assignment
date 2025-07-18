package Selenium.SELENIUMLOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebookexample {
    public static void main(String[] args) throws Exception {

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebDriverWait wait = new WebDriverWait(driver, 20);

        // 1. By.id
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("test@example.com");
        System.out.println("Used locator: By.id");

        // 2. By.name
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("123456");
        System.out.println("Used locator: By.name");

        // 3. By.className
        WebElement loginButton = driver.findElement(By.className("_42ft"));
        loginButton.click();
        System.out.println("Used locator: By.className");

        Thread.sleep(3000); // wait for page load

        // 4. By.tagName — try to find a heading
        try {
            WebElement heading = driver.findElement(By.tagName("h2"));
            System.out.println("Used locator: By.tagName → " + heading.getText());
        } catch (Exception e) {
            System.out.println("By.tagName → h2 not found");
        }

        // 5. By.linkText
        try {
            WebElement forgotLink = driver.findElement(By.linkText("Forgotten password?"));
            System.out.println("Used locator: By.linkText → " + forgotLink.getText());
        } catch (Exception e) {
            System.out.println("By.linkText → 'Forgotten password?' not found");
        }

        // 6. By.partialLinkText
        try {
            WebElement partLink = driver.findElement(By.partialLinkText("password"));
            System.out.println("Used locator: By.partialLinkText → " + partLink.getText());
        } catch (Exception e) {
            System.out.println("By.partialLinkText → 'password' not found");
        }

        // 7. By.cssSelector
        try {
            WebElement emailCSS = driver.findElement(By.cssSelector("input#email"));
            System.out.println("Used locator: By.cssSelector");
        } catch (Exception e) {
            System.out.println("By.cssSelector → input#email not found");
        }

        // 8. By.xpath
        try {
            WebElement emailXPath = driver.findElement(By.xpath("//input[@id='email']"));
            System.out.println("Used locator: By.xpath");
        } catch (Exception e) {
            System.out.println("By.xpath → //input[@id='email'] not found");
        }

        // Wait to observe
        Thread.sleep(5000);
        driver.quit();
    }
}
