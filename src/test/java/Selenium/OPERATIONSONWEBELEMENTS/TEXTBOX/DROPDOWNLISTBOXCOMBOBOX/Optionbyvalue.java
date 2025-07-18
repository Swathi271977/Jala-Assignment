/**
 * 3. Select an option by value from a dropdown
 */
package Selenium.OPERATIONSONWEBELEMENTS.TEXTBOX.DROPDOWNLISTBOXCOMBOBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class Optionbyvalue {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // ⚙️ Disable Chrome’s password popups
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false,
                "profile.password_manager_leak_detection", false
        ));
        options.addArguments("--incognito", "--disable-infobars");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);

        try {
            // 1️⃣ Launch and Login
            driver.manage().window().maximize();
            driver.get("https://magnus.jalatechnologies.com/");
            driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
            driver.findElement(By.id("Password")).sendKeys("jobprogram");
            driver.findElement(By.id("btnLogin")).click();

            Thread.sleep(3000);  // wait for dashboard

            // 2️⃣ Navigate: Employees → Create
            WebElement empMenu = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(normalize-space(),'Employees')]")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", empMenu);
            empMenu.click();

            WebElement createMenu = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(normalize-space(),'Create')]")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createMenu);
            createMenu.click();

            // 3️⃣ Select a country by `value` in the dropdown
            WebElement countryElem = wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("country")
            ));
            Select countrySelect = new Select(countryElem);
            countrySelect.selectByValue("IN");  // e.g., selects India

            // 4️⃣ Print the first selected option
            WebElement selected = countrySelect.getFirstSelectedOption();
            System.out.println("✅ Selected country: " + selected.getText());

        } finally {
            driver.quit();
        }
    }
}
