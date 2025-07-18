/**
 * 5. Clicking Cancel button of the alert using dismiss()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CancelButton {
    public static void main(String[] args) {

        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open the alert test page
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // Click button that shows JS Confirm alert
            driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

            // Wait for the alert to appear
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Print alert text (optional)
            System.out.println("Alert message: " + alert.getText());

            // Click Cancel button using dismiss()
            alert.dismiss();

            // (Optional) Print result shown on the web page
            String result = driver.findElement(By.id("result")).getText();
            System.out.println("Result after clicking Cancel: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser
            driver.quit();
        }
    }
}








