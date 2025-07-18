/**
 * 8. Switch to window using driver.switchTo().window()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.Map;
import java.util.Set;



        public class SwitchtoWindow {
            public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver",
                        "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

                WebDriver driver = new ChromeDriver();

                try {
                    // Step 1: Open Gmail
                    driver.get("https://www.gmail.com");
                    driver.manage().window().maximize();

                    // Step 2: Click on "Privacy" link at the bottom (opens in new tab)
                    Thread.sleep(3000); // small wait to load links
                    driver.findElement(By.linkText("Privacy")).click();

                    // Step 3: Get parent window handle
                    String parentWindow = driver.getWindowHandle();

                    // Step 4: Get all window handles
                    Set<String> allWindows = driver.getWindowHandles();
                    System.out.println("Total windows: " + allWindows.size());

                    // Step 5: Switch to new window
                    for (String handle : allWindows) {
                        if (!handle.equals(parentWindow)) {
                            driver.switchTo().window(handle);
                            System.out.println("Switched to Child Window");
                            System.out.println("Child Window Title: " + driver.getTitle());
                            Thread.sleep(2000); // just to observe
                            driver.close(); // close the new tab
                        }
                    }

                    // Step 6: Switch back to original Gmail tab
                    driver.switchTo().window(parentWindow);
                    System.out.println("Switched back to Parent Window");
                    System.out.println("Parent Title: " + driver.getTitle());

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    driver.quit();
                }
            }
        }
