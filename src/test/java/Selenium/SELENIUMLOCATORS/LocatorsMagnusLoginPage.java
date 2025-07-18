package Selenium.SELENIUMLOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration; // Necessary for Duration.ofSeconds in Selenium 4+

public class LocatorsMagnusLoginPage {

    public static void main(String[] args) {
        // 1. Setup ChromeDriver: Sets the system property to locate the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // Initialize WebDriver: Creates a new Chrome browser instance.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximizes the browser window for better visibility.
        driver.get("http://magnus.jalatechnologies.com"); // Navigates to the specified URL.

        // 2. Add Explicit Wait for robustness: Instantiates WebDriverWait.
        // This wait will be used to pause script execution until a specific condition is met,
        // preventing NoSuchElementException if elements load slowly.
        WebDriverWait wait = new WebDriverWait(driver, 60);

        try {
            System.out.println("--- Identifying Elements on Login Page ---");

            // Element 1: Email Input Field
            // Locator: By.name - Generally reliable for form fields.
            WebElement emailByName = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
            emailByName.sendKeys("training@jalaacademy.com");
            System.out.println("1. Email field (by Name) identified and text entered.");

            // Locator: By.id - Considered the fastest and most reliable if unique.
            // Assumes 'email' is also the id. Verify in browser's dev tools.
            WebElement emailById = driver.findElement(By.id("email"));
            System.out.println("   Email field (by ID) identified. Placeholder: " + emailById.getAttribute("placeholder"));

            // Locator: By.cssSelector (using name attribute) - Versatile and efficient.
            WebElement emailByCssName = driver.findElement(By.cssSelector("input[name='email']"));
            System.out.println("   Email field (by CSS Selector - name) identified.");

            // Locator: By.xpath (using name attribute) - Flexible, but can be slower.
            WebElement emailByXpathName = driver.findElement(By.xpath("//input[@name='email']"));
            System.out.println("   Email field (by XPath - name) identified.");

            // Element 2: Password Input Field
            // Locator: By.name - Good for form fields.
            WebElement passwordByName = driver.findElement(By.name("password"));
            passwordByName.sendKeys("jobprogram");
            System.out.println("2. Password field (by Name) identified and text entered.");

            // Locator: By.id (assuming 'password' is the id) - Highly reliable if present.
            WebElement passwordById = driver.findElement(By.id("password"));
            System.out.println("   Password field (by ID) identified.");

            // Locator: By.cssSelector (using type attribute) - Robust CSS selectors are powerful.
            WebElement passwordByCssType = driver.findElement(By.cssSelector("input[type='password']"));
            System.out.println("   Password field (by CSS Selector - type) identified.");

            // Element 3: Login Button
            // Locator: By.className - Useful for styling groups, but check for uniqueness.
            WebElement loginBtnByClass = driver.findElement(By.className("btn-login"));
            System.out.println("3. Login button (by ClassName) identified. Text: " + loginBtnByClass.getText());
            loginBtnByClass.click(); // Clicks the login button to proceed to the next page.

            // Element 4: Header after successful login (Assuming this structure)
            // Locator: By.tagName - Used to find elements by their HTML tag.
            WebElement headerAfterLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
            System.out.println("4. Page header (by TagName) after login: " + headerAfterLogin.getText());

            // Navigate back to the login page to re-verify elements that exist only there
            driver.navigate().back();
            System.out.println("\n--- Back on Login Page for further element identification ---");

            // Element 5: Forgot Password Link
            // Locator: By.linkText - Locates an anchor tag by its exact visible text.
            WebElement forgotLinkByLinkText = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Forgot Password?")));
            System.out.println("5. Forgot Password link (by LinkText) identified. Text: " + forgotLinkByLinkText.getText());

            // Element 6: Partial Forgot Password Link
            // Locator: By.partialLinkText - Locates an anchor tag by partial text match.
            WebElement forgotLinkByPartialLinkText = driver.findElement(By.partialLinkText("Forgot"));
            System.out.println("6. Forgot Password link (by PartialLinkText) identified. Text: " + forgotLinkByPartialLinkText.getText());

            // Element 7: Re-locating Email field using a different CSS Selector
            // Locator: By.cssSelector (using type and placeholder for uniqueness)
            // Going back to ensure the element is on the current page context
            driver.navigate().back(); // Ensure we are on the login page
            WebElement emailByComplexCss = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='text'][placeholder='Enter email']")));
            System.out.println("7. Email field (by CSS Selector - type+placeholder) identified. Placeholder: " + emailByComplexCss.getAttribute("placeholder"));

            // Element 8: Re-locating Login button using XPath (assuming text 'Login' is present)
            // Locator: By.xpath - Verifying with XPath using visible text.
            // NOTE: Adjust "//button[text()='Login']" if the actual button text is 'Submit' or different.
            WebElement loginBtnByXpath = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Login']")));
            System.out.println("8. Login button (by XPath) identified. Text: " + loginBtnByXpath.getText());

            // Element 9: Example of finding multiple elements using findElements
            // Locator: By.tagName - findElements returns a List<WebElement>.
            java.util.List<WebElement> inputElements = driver.findElements(By.tagName("input"));
            System.out.println("9. Number of input elements found (by TagName): " + inputElements.size());
            // You could iterate through this list to print details of each input field if needed.


        } catch (Exception e) {
            // General exception handling: Catches any exception during execution.
            System.err.println("An error occurred during script execution: " + e.getMessage());
            // Print stack trace for detailed debugging information.
            e.printStackTrace();
        } finally {
            // Ensure the browser is closed even if an error occurs.
            if (driver != null) {
                driver.quit();
                System.out.println("\nBrowser closed successfully.");
            }
        }
    }
}