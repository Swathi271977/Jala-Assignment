/**
 * 4. Clicking OK button of the alert using accept()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OKButtonaccept {
    public static void main(String[] args) {

        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the webpage that contains JavaScript alerts
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // Click the button that triggers a simple JavaScript Alert
            driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

            // Wait until the alert is present
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Print the alert message
            String alertText = alert.getText();
            System.out.println("Alert message: " + alertText);

            // Click the OK button on the alert
            alert.accept();

            // Optional: further steps can be added here

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
