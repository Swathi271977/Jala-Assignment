/**
 * 2. Prompt Alert with Text Box to enter the text
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PromptAlertWithInput {
    public static void main(String[] args) {
        // Adjust path to your ChromeDriver as needed
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 60);

        try {
            // Navigate to a test page that triggers a prompt alert
            driver.get("https://demoqa.com/alerts");
            driver.manage().window().maximize();

            // Click the button that opens the prompt alert
            driver.findElement(By.id("promtButton")).click();

            // Wait until the alert is present
            wait.until(ExpectedConditions.alertIsPresent());

            // Switch focus to the alert
            Alert prompt = driver.switchTo().alert();

            // Read and print the message displayed in the alert
            System.out.println("Alert says: " + prompt.getText());

            // Input the desired text into the prompt's textbox
            String userInput = "Hello Selenium!";
            prompt.sendKeys(userInput);

            // Accept the alert (clicks OK)
            prompt.accept();

            // Verify result: the page displays the entered text
            String result = driver.findElement(By.id("promptResult")).getText();
            System.out.println("Result shown: " + result);

        } finally {
            driver.quit();
        }
    }
}
