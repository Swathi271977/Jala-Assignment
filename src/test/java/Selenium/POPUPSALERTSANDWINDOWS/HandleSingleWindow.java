/**
 * 6. Handle single window using driver.getWindowHandle()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleSingleWindow{
            public static void main(String[] args) {

                    // Set path to ChromeDriver
                // ✅ Set path to your ChromeDriver
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

                    // Initialize WebDriver
                    WebDriver driver = new ChromeDriver();

                    try {
                        // Open a web page
                        driver.get("https://www.google.com");

                        // Get the window handle of the current (only) window
                        String windowHandle = driver.getWindowHandle();
                        System.out.println("Current window handle: " + windowHandle);

                        // Perform any action on the page
                        String title = driver.getTitle();
                        System.out.println("Page Title: " + title);

                        // You can switch back to this window using the handle (even though it's the only one)
                        driver.switchTo().window(windowHandle);

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // Close the browser
                        driver.quit();
                    }
                }
            }


