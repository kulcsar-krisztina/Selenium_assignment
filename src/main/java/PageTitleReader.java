import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleReader {

    public static void readPageTitle(WebDriver driver) {

        try {

            // Oldal megnyitása

            driver.get("https://hernadi-antikvarium.hu/");

            Thread.sleep(2000);

            // Oldal címének kiolvasása

            String title = driver.getTitle();

            System.out.println("Az oldal címe: " + title);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}

