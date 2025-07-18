/**
 * 6. Check if Radio Button is enabled or disabled?
 */
package Selenium.OPERATIONSONWEBELEMENTS.TEXTBOX.RADIOBTNCHECKBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtnenabledordisabled {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 1: Open Magnus Application
        driver.get("http://magnus.jalatechnologies.com/");
        System.out.println("✅ Opened Magnus application");

        // Step 2: Login to the application
        driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
        driver.findElement(By.id("Password")).sendKeys("jobprogram");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        System.out.println("✅ Logged in successfully");

        // Step 3: Navigate to Employee > Create
        driver.findElement(By.linkText("Employee")).click();
        driver.findElement(By.linkText("Create")).click();
        System.out.println("✅ Navigated to Employee Create form");

        // Step 4: Locate the Male radio button
        WebElement maleRadio = driver.findElement(By.id("rdbMale"));

        // Step 5: Check if the radio button is enabled or disabled
        if (maleRadio.isEnabled()) {
            System.out.println("✅ Radio button is enabled.");
        } else {
            System.out.println("❌ Radio button is disabled.");
        }

        // Close the browser
        driver.quit();
    }
}
