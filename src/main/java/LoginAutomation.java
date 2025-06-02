import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LoginAutomation {

    public static void login(WebDriver driver) {

        try {

            // Weboldal megnyitása

            driver.get("https://hernadi-antikvarium.hu/");

            // Várakozás, hogy az oldal betöltõdjön

            Thread.sleep(1000);

            // Kattintás a "Bejelentkezés" linkre

            WebElement loginLink = driver.findElement(By.linkText("Bejelentkezés"));

            loginLink.click();

            Thread.sleep(1000); // várakozás a bejelentkezési oldal betöltésére

            // Bejelentkezési mezõk kitöltése

            WebElement emailField = driver.findElement(By.id("edit-name")); 

            emailField.sendKeys("k.krisztina0204@gmail.com");
            
            WebElement passwordField = driver.findElement(By.id("edit-pass"));

            passwordField.sendKeys("jelszo123");

            // Beküldés (pl. gomb megnyomása)

            WebElement loginButton = driver.findElement(By.id("edit-submit"));

            loginButton.click();

            Thread.sleep(1000); // várakozás az eredményre

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}