/**
 * 7. Handle multiple windows using driver.getWindowHandles()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HandleMultipleWindows{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://magnus.jalatechnologies.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
            driver.findElement(By.id("Password")).sendKeys("jobprogram");
            driver.findElement(By.id("btnLogin")).click();

            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("More"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Popups"))).click();

            System.out.println("Before clicking the link");
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Click to open new Tab"))).click();
            System.out.println("Clicked the link to open new window");

            String parentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            System.out.println("Total windows open: " + allWindows.size());

            for (String handle : allWindows) {
                if (!handle.equals(parentWindow)) {
                    driver.switchTo().window(handle);
                    System.out.println("Switched to Child Window");
                    System.out.println("Child Window Title: " + driver.getTitle());
                    Thread.sleep(2000);  // Wait to see the child window
                    driver.close(); // Close child
                }
            }

            // Switch back to parent
            driver.switchTo().window(parentWindow);
            System.out.println("Switched back to Parent");
            System.out.println("Parent Window Title: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
