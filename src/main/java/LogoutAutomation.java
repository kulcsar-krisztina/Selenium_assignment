import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class LogoutAutomation {

    public static void logout(WebDriver driver) {

        try {

            // Feltételezzük, hogy a felhasználó már be van jelentkezve
            // Keresés a "Kijelentkezés" linkre (szöveg alapján)

            WebElement logoutLink = driver.findElement(By.linkText("Kijelentkezés"));

            logoutLink.click();

            System.out.println("Sikeres kijelentkezés.");

            Thread.sleep(2000);

        } catch (Exception e) {

            System.out.println("Nem található a kijelentkezés link vagy hiba történt.");

            e.printStackTrace();

        }

    }

}

