import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class XPathExample {

    public static void showXPathExample(WebDriver driver) {

        try {

            driver.get("https://hernadi-antikvarium.hu/");

            Thread.sleep(2000);

            // XPath: keresünk egy <div> alatt egy <a> elemet, amelynek href attribútuma tartalmazza az "antikvarium" szót
            WebElement bookLink = driver.findElement(By.xpath("//div//a[contains(@href, '/antikvarium/')]"));

            System.out.println("Könyv link szövege: " + bookLink.getText());

            System.out.println("Könyv link URL: " + bookLink.getAttribute("href"));

            // Rákattintunk a linkre

            bookLink.click();

            Thread.sleep(3000);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}