/**
 * 4. Select an option by visible text from a dropdown
 */
package Selenium.OPERATIONSONWEBELEMENTS.TEXTBOX.DROPDOWNLISTBOXCOMBOBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class OptionByVisibleText {
    public static void main(String[] args) {
        // ✅ Corrected property key
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false,
                "profile.password_manager_leak_detection", false
        ));

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);

        try {
            driver.manage().window().maximize();

            // 1️⃣ Login
            driver.get("https://magnus.jalatechnologies.com/");
            driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
            driver.findElement(By.id("Password")).sendKeys("jobprogram");
            driver.findElement(By.id("btnLogin")).click();

            // 2️⃣ Navigate to Employee > Create
            WebElement employeeMenu = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Employee')]"))
            );
            employeeMenu.click();

            WebElement createSubmenu = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Create')]"))
            );
            createSubmenu.click();

            // 3️⃣ Wait and select from country dropdown
            WebElement countryElem = wait.until(
                    ExpectedConditions.elementToBeClickable(By.id("country"))
            );
            Select countrySelect = new Select(countryElem);
            countrySelect.selectByVisibleText("India");

            // ✅ Output selected country
            WebElement selectedOption = countrySelect.getFirstSelectedOption();
            System.out.println("✅ Selected Country: " + selectedOption.getText());

        } finally {
            driver.quit();
        }
    }
}
