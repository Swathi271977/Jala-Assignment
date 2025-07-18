package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert; // Import the Alert interface
import org.openqa.selenium.By;

public class Sampleprogram{
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a page that generates an alert
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the button that triggers an alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert(); // This switches the WebDriver's focus to the alert.

        // Capture the alert message using getText()
        String alertMessage = alert.getText(); // This method retrieves the text displayed in the alert.
        System.out.println("Alert message: " + alertMessage); // Prints the alert message to the console.

        // Accept the alert (click "OK")
        alert.accept(); // This closes the alert by clicking the "OK" button.

        // The browser will remain open here because driver.quit() is commented out
        // driver.quit();
    }
}