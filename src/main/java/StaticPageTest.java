import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

//import org.openqa.selenium.chrome.ChromeDriver;

public class StaticPageTest {

    public static void testStaticPage(WebDriver driver) {

        try {

            // Statikus oldal megnyit�sa

            driver.get("https://hernadi-antikvarium.hu/hasznos-informacio");

            Thread.sleep(2000);

            // Oldal c�m�nek ellen�rz�se

            String title = driver.getTitle();

            System.out.println("Oldal c�me: " + title);

            // Ellen�rz�s: tartalmaz-e hasznos inform�ci�kat

            WebElement body = driver.findElement(By.tagName("body"));

            if (body.getText().toLowerCase().contains("sz�ll�t�s") || body.getText().toLowerCase().contains("fizet�s")) {

                System.out.println("A hasznos inform�ci�k megtal�lhat�k az oldalon.");

            } else {

                System.out.println("A hasznos inform�ci�k nem tal�lhat�k.");

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}



