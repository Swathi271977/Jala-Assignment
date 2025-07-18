/**
 * 5. Check if Radio Button is selected?
 */
package Selenium.OPERATIONSONWEBELEMENTS.TEXTBOX.RADIOBTNCHECKBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobuttonselectedornot {
    public static void main(String[] args) {
        // Set path to chromedriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // Initialize driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Magnus application
        driver.get("https://magnus.jalatechnologies.com/");

        // Login
        driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
        driver.findElement(By.id("Password")).sendKeys("jobprogram");
        driver.findElement(By.id("btnLogin")).click();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 120);

        // Navigate to Employee > Create
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Employee"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create"))).click();

        // Locate radio buttons
        WebElement maleRadio = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@name='Gender' and @value='Male']")));
        WebElement femaleRadio = driver.findElement(By.xpath("//input[@name='Gender' and @value='Female']"));

        // Click Female radio button
        femaleRadio.click();
        System.out.println("Clicked Female radio button.");

        // Confirm selection
        if (femaleRadio.isSelected()) {
            System.out.println("✅ Female radio button is selected.");
        } else {
            System.out.println("❌ Female radio button is NOT selected.");
        }

        if (maleRadio.isSelected()) {
            System.out.println("❌ Male radio button is still selected.");
        } else {
            System.out.println("✅ Male radio button is NOT selected.");
        }

        // Close browser
        driver.quit();
    }
}
