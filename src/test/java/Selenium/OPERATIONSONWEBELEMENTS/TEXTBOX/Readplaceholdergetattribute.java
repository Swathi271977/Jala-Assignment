/**
 * 3. How to read the placeholder value of a Text Box using getAttribute() method
 */
package Selenium.OPERATIONSONWEBELEMENTS.TEXTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Readplaceholdergetattribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 120);

        try {
            driver.get("http://magnus.jalatechnologies.com/");

            // Locate email input by its name attribute
            WebElement emailInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.name("Email")
            ));

            // Print the 'type' and 'name' attributes
            System.out.println("Email field type: " + emailInput.getAttribute("type"));
            System.out.println("Email field name: " + emailInput.getAttribute("name"));

            // Locate password input by its name attribute
            WebElement passInput = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.name("Password")
            ));

            // Print the 'type' and 'name' attributes
            System.out.println("Password field type: " + passInput.getAttribute("type"));
            System.out.println("Password field name: " + passInput.getAttribute("name"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
