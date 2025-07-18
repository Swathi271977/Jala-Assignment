package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {
        // 1. Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 120);
        try {
            // 2. Navigate to your Magnus app
            driver.get("http://magnus.jalatechnologies.com/");

            // 3. Wait until the textbox is present, then send keys
            WebElement input = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("yourTextBoxId"))
            );
            input.sendKeys("training@jalaacademy.com");

            // 4. Use getAttribute("value") to retrieve the textbox content
            String value = input.getAttribute("value");
            System.out.println("Text box contains: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

