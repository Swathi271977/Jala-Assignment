/**
 * 5. Select an option by index from a dropdown
 */
package Selenium.OPERATIONSONWEBELEMENTS.TEXTBOX.DROPDOWNLISTBOXCOMBOBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class Optionbyindex {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("🔧 Script starting");
        System.setProperty("web driver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false,
                "profile.password_manager_leak_detection", false
        ));
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 60);

        System.out.println("✅ Browser launched");

        try {
            driver.manage().window().maximize();
            System.out.println("✅ Browser maximized");

            driver.get("https://magnus.jalatechnologies.com/");
            System.out.println("🔐 Navigated to login page");

            driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
            driver.findElement(By.id("Password")).sendKeys("jobprogram");
            driver.findElement(By.id("btnLogin")).click();
            System.out.println("✅ Login submitted");

            Thread.sleep(3000);
            System.out.println("⌛ Dashboard should be loaded now (URL: " + driver.getCurrentUrl() + ")");

            WebElement empMenu = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[contains(text(),'Employee')]")
            ));
            System.out.println("➡️ Found Employee menu");

            empMenu.click();
            System.out.println("➡️ Clicked Employee menu");

            WebElement createMenu = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(text(),'Create')]")
            ));
            System.out.println("➡️ Found Create submenu");

            createMenu.click();
            System.out.println("➡️ Clicked Create submenu");

            WebElement countryInput = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("input[aria-owns*='Country_listbox']")
            ));
            System.out.println("📝 Country input field ready");

            countryInput.click();
            countryInput.clear();
            countryInput.sendKeys("India");
            System.out.println("📝 Typed 'India' into country field");

            WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//ul[contains(@id,'Country_listbox')]//li[normalize-space()='India']")
            ));
            System.out.println("➡️ Found suggestion for 'India'");

            suggestion.click();
            System.out.println("✅ Country selected: India");

            // Optionally verify input value
            String val = countryInput.getAttribute("value");
            System.out.println("🔍 Verified input contains: " + val);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("🛑 Browser closed");
        }
    }
}
