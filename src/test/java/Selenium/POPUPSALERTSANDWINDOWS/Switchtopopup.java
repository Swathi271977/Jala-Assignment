/**
 * 10. Switch to popup using driver.switchTo.alert()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtopopup {
    public static void main(String[] args) {

        // Set ChromeDriver path first
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to a page with a JavaScript Alert (example demo site)
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the button to trigger alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Print alert text
        System.out.println("Alert Text: " + alert.getText());

        // Accept the alert
        alert.accept();

        // Close browser
        driver.quit();
    }
}
