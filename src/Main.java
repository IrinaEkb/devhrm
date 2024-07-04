

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriverException;


public class Main {
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/");

        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.id("txtUsername"));
        firstName.sendKeys("yoll-student");

        WebElement lastName = driver.findElement(By.id("txtPassword"));
        lastName.sendKeys("Bootcamp5#");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement button = driver.findElement(By.id("btnLogin"));
        button.click();

        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // Locate PIM Tab
        WebElement pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
        System.out.println("PIM tab background color before click: "
                + pimTab.getCssValue("background-color"));

        pimTab.click();

        // relocate the pim tab after interaction with it
        pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
        System.out.println("PIM tab background color after click: "
                + pimTab.getCssValue("background-color"));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();











    }
}