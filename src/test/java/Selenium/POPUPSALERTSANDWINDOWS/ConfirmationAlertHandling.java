/**
 * 3. Confirmation Alert with Ok and Cancel buttons
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



        public class ConfirmationAlertHandling {

            public static void main(String[] args) {

                // Set the path to the ChromeDriver executable
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");
                // Initialize ChromeDriver
                WebDriver driver = new ChromeDriver();

                // Navigate to a webpage that triggers a confirmation alert
                driver.get("https://demoqa.com/alerts"); // Or your specific URL

                // Locate and click the button that triggers the confirmation alert
                driver.findElement(By.id("confirmButton")).click();

                // Wait for the alert to be present
                WebDriverWait wait = new WebDriverWait(driver, 60); // Use Duration
                wait.until(ExpectedConditions.alertIsPresent());

                // Switch to the alert
                Alert confirmationAlert = driver.switchTo().alert();

                // Get the alert message
                String alertMessage = confirmationAlert.getText();
                System.out.println("Alert Message: " + alertMessage);

                // Choose to accept the alert (click "OK")
                confirmationAlert.accept();

                // OR to dismiss the alert (click "Cancel")
                // confirmationAlert.dismiss();

                // Verify the action (optional, depending on your application's behavior)
                // You might need to find an element on the page that reflects the result of the alert action.

                // Close the browser
                driver.quit();
            }
        }


