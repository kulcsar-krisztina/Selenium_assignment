import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

//import org.openqa.selenium.chrome.ChromeDriver;

public class StaticPageTest {

    public static void testStaticPage(WebDriver driver) {

        try {

            // Statikus oldal megnyitása

            driver.get("https://hernadi-antikvarium.hu/hasznos-informacio");

            Thread.sleep(2000);

            // Oldal címének ellenõrzése

            String title = driver.getTitle();

            System.out.println("Oldal címe: " + title);

            // Ellenõrzés: tartalmaz-e hasznos információkat

            WebElement body = driver.findElement(By.tagName("body"));

            if (body.getText().toLowerCase().contains("szállítás") || body.getText().toLowerCase().contains("fizetés")) {

                System.out.println("A hasznos információk megtalálhatók az oldalon.");

            } else {

                System.out.println("A hasznos információk nem találhatók.");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}



