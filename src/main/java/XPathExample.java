import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class XPathExample {

    public static void showXPathExample(WebDriver driver) {

        try {

            driver.get("https://hernadi-antikvarium.hu/");

            Thread.sleep(2000);

            // XPath: keres�nk egy <div> alatt egy <a> elemet, amelynek href attrib�tuma tartalmazza az "antikvarium" sz�t
            WebElement bookLink = driver.findElement(By.xpath("//div//a[contains(@href, '/antikvarium/')]"));

            System.out.println("K�nyv link sz�vege: " + bookLink.getText());

            System.out.println("K�nyv link URL: " + bookLink.getAttribute("href"));

            // R�kattintunk a linkre

            bookLink.click();

            Thread.sleep(3000);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}