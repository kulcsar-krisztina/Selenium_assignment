import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LoginAutomation {

    public static void login(WebDriver driver) {

        try {

            // Weboldal megnyit�sa

            driver.get("https://hernadi-antikvarium.hu/");

            // V�rakoz�s, hogy az oldal bet�lt�dj�n

            Thread.sleep(1000);

            // Kattint�s a "Bejelentkez�s" linkre

            WebElement loginLink = driver.findElement(By.linkText("Bejelentkez�s"));

            loginLink.click();

            Thread.sleep(1000); // v�rakoz�s a bejelentkez�si oldal bet�lt�s�re

            // Bejelentkez�si mez�k kit�lt�se

            WebElement emailField = driver.findElement(By.id("edit-name")); 

            emailField.sendKeys("k.krisztina0204@gmail.com");
            
            WebElement passwordField = driver.findElement(By.id("edit-pass"));

            passwordField.sendKeys("jelszo123");

            // Bek�ld�s (pl. gomb megnyom�sa)

            WebElement loginButton = driver.findElement(By.id("edit-submit"));

            loginButton.click();

            Thread.sleep(1000); // v�rakoz�s az eredm�nyre

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}