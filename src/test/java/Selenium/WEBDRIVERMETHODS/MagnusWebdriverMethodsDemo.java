package Selenium.WEBDRIVERMETHODS;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration; // For WebDriverWait
import java.util.List; // For findElements()
import java.util.Set; // For getWindowHandles()

public class MagnusWebdriverMethodsDemo {

    public static void main(String[] args) throws InterruptedException {
        // 1. Set up the browser driver
        // Ensure you have the ChromeDriver executable downloaded and the path is correct.
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        // 2. Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Initialize WebDriverWait for explicit waits
        WebDriverWait wait = new WebDriverWait(driver, 60); // Waits up to 10 seconds

        try {
            // **Browser Commands**

            // get(): Navigate to the Magnus application login page
            driver.get("http://magnus.jalatechnologies.com/Account/Login");
            System.out.println("Navigated using get(): " + driver.getCurrentUrl());

            // getCurrentUrl(): Get and print the current URL
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL: " + currentUrl);

            // getTitle(): Get and print the page title
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            // getPageSource(): Get the page source (useful for debugging, but can be very long)
            String pageSource = driver.getPageSource();
            // System.out.println("Page Source Length: " + pageSource.length()); // Uncomment if you want to see the length

            // **Window and Browser Management**

            // manage(): Maximize the browser window
            driver.manage().window().maximize(); // Maximizes the browser window

            // driver.navigate().to(): Navigate using navigate().to()
            // This is similar to get(), but part of the Navigation interface
            driver.navigate().to("http://magnus.jalatechnologies.com/Account/Login");
            System.out.println("Navigated using navigate().to(): " + driver.getCurrentUrl());

            // **Element Interaction - Login**

            // findElement(): Locate the username field
            WebElement usernameField = driver.findElement(By.id("UserName")); // Using By.id() to locate the element

            // sendKeys(): Enter the username
            usernameField.sendKeys("training@jalaacademy.com"); // Inputs the specified text into the element

            // findElement(): Locate the password field
            WebElement passwordField = driver.findElement(By.name("Password")); // Using By.name()

            // sendKeys(): Enter the password
            passwordField.sendKeys("jobprogram");

            // click(): Click the login button
            WebElement loginButton = driver.findElement(By.id("btnLogin")); // Using By.id()
            loginButton.click();

            // Wait for the URL to change to the dashboard after successful login
            wait.until(ExpectedConditions.urlContains("/Dashboard"));
            System.out.println("Logged in. Current URL: " + driver.getCurrentUrl());

            // **More Element Interaction and Information Retrieval**

            // findElement(): Find an element on the dashboard (e.g., the welcome heading)
            WebElement welcomeMessage = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome')]"));

            // getText(): Get the text of the welcome message
            String welcomeText = welcomeMessage.getText();
            System.out.println("Welcome Message: " + welcomeText);

            // findElements(): Find all links on the current page
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            System.out.println("Number of links on the page: " + allLinks.size());

            // isDisplayed(): Check if the welcome message is displayed
            boolean isWelcomeMessageDisplayed = welcomeMessage.isDisplayed();
            System.out.println("Is welcome message displayed? " + isWelcomeMessageDisplayed);

            // getAttribute(): Get an attribute (e.g., href from a link)
            if (!allLinks.isEmpty()) {
                String firstLinkHref = allLinks.get(0).getAttribute("href"); // Gets the value of the "href" attribute
                System.out.println("First link's href: " + firstLinkHref);
            }

            // getTagName(): Get the tag name of an element
            String welcomeTagName = welcomeMessage.getTagName();
            System.out.println("Welcome message tag name: " + welcomeTagName);

            // isEnabled(): Check if a button is enabled (e.g., a "Create Employee" button)
            // We'll try to find a button and check its enabled status.
            // Assuming there's a "Create" button for employees.
            WebElement createButton = driver.findElement(By.linkText("Create"));
            boolean isCreateButtonEnabled = createButton.isEnabled();
            System.out.println("Is Create button enabled? " + isCreateButtonEnabled);
            createButton.click(); // Click to navigate to the create page

            wait.until(ExpectedConditions.urlContains("/Employee/Create")); // Wait for navigation

            // isSelected(): (Typically used for radio buttons and checkboxes)
            // We'll assume a checkbox exists on the "Create Employee" page for demonstration
            // WebElement termsCheckbox = driver.findElement(By.id("TermsAndConditions"));
            // boolean isTermsSelected = termsCheckbox.isSelected();
            // System.out.println("Is terms checkbox selected? " + isTermsSelected);

            // **Browser Navigation**

            // driver.navigate().back(): Navigate back to the Dashboard
            driver.navigate().back();
            System.out.println("After navigating back, URL: " + driver.getCurrentUrl());

            // driver.navigate().forward(): Navigate forward to the Create Employee page
            driver.navigate().forward();
            System.out.println("After navigating forward, URL: " + driver.getCurrentUrl());

            // driver.navigate().refresh(): Refresh the current page
            driver.navigate().refresh();
            System.out.println("After refreshing, URL: " + driver.getCurrentUrl());

            // **Window Handling**

            // getWindowHandle(): Get the handle of the current window
            String originalWindowHandle = driver.getWindowHandle();
            System.out.println("Original Window Handle: " + originalWindowHandle);

            // Simulating opening a new window (e.g., clicking a link that opens in a new tab)
            // For the sake of this demo, we'll open google.com
            ((ChromeDriver) driver).executeScript("window.open('https://www.google.com/', '_blank');");

            // getWindowHandles(): Get all window handles
            Set<String> allWindowHandles = driver.getWindowHandles();
            System.out.println("All Window Handles: " + allWindowHandles);

            // switchTo(): Switch to the new window
            for (String handle : allWindowHandles) {
                if (!handle.equals(originalWindowHandle)) {
                    driver.switchTo().window(handle);
                    System.out.println("Switched to new window with title: " + driver.getTitle());
                    break;
                }
            }

            // Close the new window
            driver.close();

            // Switch back to the original window
            driver.switchTo().window(originalWindowHandle);
            System.out.println("Switched back to original window. Title: " + driver.getTitle());

            // **Element Dimensions and Location**

            // getSize(): Get the size of an element (e.g., the Login button)
            Dimension loginBtnSize = loginButton.getSize(); // Re-locate or assume it's still available if on the current page
            System.out.println("Login Button Size: Width = " + loginBtnSize.getWidth() + ", Height = " + loginBtnSize.getHeight());

            // getLocation(): Get the location of an element (e.g., the Login button)
            Point loginBtnLocation = loginButton.getLocation();
            System.out.println("Login Button Location: X = " + loginBtnLocation.getX() + ", Y = " + loginBtnLocation.getY());

            // Thread.sleep(): (Use sparingly, primarily for debugging or specific synchronization)
            Thread.sleep(2000); // Wait for 2 seconds (not recommended for robust automation)

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // driver.quit(): Close all browser windows and terminate the WebDriver session
            driver.quit(); // Closes all windows opened by the WebDriver
            System.out.println("Browser session ended.");
        }
    }
}