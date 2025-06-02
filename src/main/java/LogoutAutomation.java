import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LogoutAutomation {

    public static void logout(WebDriver driver) {

        try {

            // Felt�telezz�k, hogy a felhaszn�l� m�r be van jelentkezve
            // Keres�s a "Kijelentkez�s" linkre (sz�veg alapj�n)

            WebElement logoutLink = driver.findElement(By.linkText("Kijelentkez�s"));

            logoutLink.click();

            System.out.println("Sikeres kijelentkez�s.");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Nem tal�lhat� a kijelentkez�s link vagy hiba t�rt�nt.");

            e.printStackTrace();

        }

    }

}

