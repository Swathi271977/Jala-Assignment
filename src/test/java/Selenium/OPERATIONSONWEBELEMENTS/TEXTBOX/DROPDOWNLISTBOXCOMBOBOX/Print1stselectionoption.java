/**
 * 2. Print first selected option from a dropdown
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Print1stselectionoption{
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            prefs.put("profile.password_manager_leak_detection", false);
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--guest", "--incognito", "--disable-infobars");

            WebDriver driver = new ChromeDriver(options);
            WebDriverWait wait = new WebDriverWait(driver, 60);

            try {
                System.out.println("✅ Browser launched");
                driver.manage().window().maximize();

                // 1️⃣ Login
                driver.get("https://magnus.jalatechnologies.com/");
                driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
                driver.findElement(By.id("Password")).sendKeys("jobprogram");
                driver.findElement(By.id("btnLogin")).click();
                System.out.println("✅ Logged in");

                Thread.sleep(3000);

                // 2️⃣ Navigate to Create under Employees
                By empMenu = By.xpath("//a[contains(normalize-space(), 'Employees')]");
                WebElement empElem = wait.until(ExpectedConditions.elementToBeClickable(empMenu));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", empElem);
                empElem.click();

                By createMenu = By.xpath("//a[contains(normalize-space(), 'Create')]");
                WebElement createElem = wait.until(ExpectedConditions.elementToBeClickable(createMenu));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createElem);
                createElem.click();

                System.out.println("📄 On Create Employee page");

                // 3️⃣ Handle Country dropdown
                WebElement countryElem = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("country")));
                Select countrySelect = new Select(countryElem);

                // Print all options
                List<WebElement> opts = countrySelect.getOptions();
                System.out.println("🌍 Total countries: " + opts.size());
                for (WebElement o : opts) {
                    System.out.printf(" • %s (value='%s')%n", o.getText().trim(), o.getAttribute("value"));
                }

                // 4️⃣ Select a country and print first selected option
                countrySelect.selectByVisibleText("India");
                WebElement firstSel = countrySelect.getFirstSelectedOption();
                System.out.println("✅ First selected country: " + firstSel.getText());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                driver.quit();
                System.out.println("🛑 Browser closed");
            }
        }
    }


