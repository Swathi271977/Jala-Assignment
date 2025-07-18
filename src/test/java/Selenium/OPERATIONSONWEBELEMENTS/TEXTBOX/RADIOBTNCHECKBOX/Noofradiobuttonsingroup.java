/**
 * 2. Find out number of elements in a radio group
 */
package Selenium.OPERATIONSONWEBELEMENTS.TEXTBOX.RADIOBTNCHECKBOX;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Noofradiobuttonsingroup {
        public static void main(String[] args) {
            // Setup WebDriver
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\swath\\IdeaProjects\\DemoJavaProject\\chromedriver.exe");
            //WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://magnus.jalatechnologies.com/"); // set your Magnus app URL

            // Replace with the radio group name used in Magnus
            String groupName = "radioGroupName"; // e.g., "ID_field", "options"

            // Count radio buttons by name attribute
            List<WebElement> groupRadios = driver.findElements(
                    By.cssSelector("input[type='radio'][name='" + groupName + "']"));
            System.out.println("Number of radios in '" + groupName + "': " + groupRadios.size());

            // Optional: print each radio's value or ID
            for (WebElement radio : groupRadios) {
                System.out.println(" • Radio: id=" + radio.getAttribute("id") +
                        ", value=" + radio.getAttribute("value"));
            }

            driver.quit();
        }
    }


