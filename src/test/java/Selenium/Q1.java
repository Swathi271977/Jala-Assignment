package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

    public class Q1 {
        public static void main(String[] args) {

            // Set the path to chromedriver if needed (Optional if already set in system PATH)
            System.setProperty("webdriver.chrome.driver","C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

            // Step 1: Launch Chrome browser
            WebDriver driver = new ChromeDriver();

            // Step 2: Maximize the browser window
            driver.manage().window().maximize();

            // Step 3: Open the login page
            driver.get("http://magnus.jalatechnologies.com/");

            // Step 4: Create a WebDriverWait for explicit waits (e.g., 120 seconds max)
            WebDriverWait wait = new WebDriverWait(driver, 120);

            // Step 5: Wait for username textbox to be visible and type in
            WebElement usernameField = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("UserName"))
            );
            usernameField.sendKeys("training@jalaacademy.com");

            // Step 6: Wait for password textbox to be visible and type in
            WebElement passwordField = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("Password"))
            );
            passwordField.sendKeys("jobprogram");

            // Step 7: Wait for login button to be clickable and click it
            WebElement loginButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
            );
            loginButton.click();

            // Step 8: Wait for Home page element to be visible (ensure login success)
            WebElement dashboardElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Dashboard')]"))
            );

            System.out.println("Successfully logged in and Home page is loaded.");

            // Step 9: Close the browser
            driver.quit();
        }
    }


