import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import java.util.List;

public class StaticPageTester {

    private WebDriver driver;

    public StaticPageTester(WebDriver chromedriver) {

        driver = chromedriver;

    }

    public void testPages(List<String> urls) {

        for (String url : urls) {

            try {

                driver.get(url);

                System.out.println("Tesztelés: " + url);

                WebElement kosarba = driver.findElement(By.cssSelector("input[type='submit'][value='Kosárba']"));

                if (kosarba.isDisplayed()) {

                    System.out.println("Kosárba gomb megtalálva.");

                } else {

                    System.out.println("Kosárba gomb nem látható.");

                }

            } catch (Exception e) {

                System.out.println("Hiba az oldalon: " + url);

                e.printStackTrace();

            }

        }

    }

}