/**
 * 1. Capturing the alert message using getText()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class CaptureAlertText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // 1. Use ChromeOptions to detach the browser
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);  // ← This keeps the browser open after script ends :contentReference[oaicite:1]{index=1}

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);

        try {
            driver.get("http://magnus.jalatechnologies.com/Account/Login");
            driver.manage().window().maximize();

            ((JavascriptExecutor) driver).executeScript("alert('Sample Magnus Alert');");

            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            String message = alert.getText();
            System.out.println("Captured alert message: " + message);
            alert.accept();

            // 2. Pause execution so you can inspect browser before script exits
            Thread.sleep(15000);  // 15 seconds pause before script finishes

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Note: No driver.quit() here—browser will remain open and detached
        }
    }
}
