package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

    public class Q5 {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 120);

            try {
                driver.get("http://magnus.jalatechnologies.com/");

                // Wait for the username/email input
                WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(
                        By.name("Email") // or By.id("UserName"), By.cssSelector("input[type='email']")
                ));

                // Check enabled state
                boolean enabled = input.isEnabled();
                System.out.println("Text box enabled? " + enabled);

                if (enabled) {
                    // Optional: interact only if enabled
                    input.sendKeys("training@jalaacademy.com");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                driver.quit();
            }
        }
    }


