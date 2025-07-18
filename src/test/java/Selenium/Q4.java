package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Q4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 120);

        try {
            driver.get("http://magnus.jalatechnologies.com/");

            // Wait for and locate the username/email input
            WebElement userInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.id("UserName")
            ));
            // Type the email provided in the app
            userInput.sendKeys("training@jalaacademy.com");  // provided login :contentReference[oaicite:4]{index=4}

            // Clear the input field
            userInput.clear();

            // Verify it's cleared
            String cleared = userInput.getAttribute("value");
            if (cleared.isEmpty()) {
                System.out.println("Text box cleared successfully!");
            } else {
                System.out.println("Text box not cleared. Current value: [" + cleared + "]");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
