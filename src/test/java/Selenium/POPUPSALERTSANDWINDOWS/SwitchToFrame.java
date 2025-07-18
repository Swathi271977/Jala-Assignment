/**
 * 9. Switch to frame using driver.switchTo().frame()
 */
package Selenium.POPUPSALERTSANDWINDOWS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Open the demo site
            driver.get("https://demo.guru99.com/test/guru99home/");

            Thread.sleep(5000); // wait for page and iframe to load

            // Switch to the iframe using WebElement
            WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@src, 'youtube')]"));
            driver.switchTo().frame(iframe);

            // Interact inside the iframe (example: print video title element)
            WebElement videoTitle = driver.findElement(By.cssSelector("button[title='Play']"));
            System.out.println("Video play button is displayed: " + videoTitle.isDisplayed());

            // Switch back to main page
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
