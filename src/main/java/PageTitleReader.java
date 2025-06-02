import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleReader {

    public static void readPageTitle(WebDriver driver) {

        try {

            // Oldal megnyit�sa

            driver.get("https://hernadi-antikvarium.hu/");

            Thread.sleep(2000);

            // Oldal c�m�nek kiolvas�sa

            String title = driver.getTitle();

            System.out.println("Az oldal c�me: " + title);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}

