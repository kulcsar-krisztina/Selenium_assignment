import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import java.util.function.Function;

public class OrderFormAutomation {

    public static void automateOrderForm(WebDriver driver) {

        try {

            // F�oldal megnyit�sa

            driver.get("https://hernadi-antikvarium.hu/");

            Thread.sleep(2000);

            // Kiv�lasztjuk az els� k�nyvet

            WebElement firstBook = driver.findElement(By.xpath("//a[contains(@href, '/antikvarium/')]"));

            firstBook.click();

            // Kos�rba helyez�s gomb
            // V�rakoz�s, am�g a Kos�rba gomb kattinthat�v� v�lik

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            WebElement addToCartButton = wait.until(driver1 -> {

                WebElement elem = driver1.findElement(By.cssSelector("input[type='submit'][value='Kos�rba']"));

                return (elem != null && elem.isDisplayed() && elem.isEnabled()) ? elem : null;

            });
            
            addToCartButton.click();
            
            WebElement cartLink = wait.until(driver1 -> {

                WebElement elem = driver1.findElement(By.id("highlighted"));

                return (elem != null && elem.isDisplayed() && elem.isEnabled()) ? elem : null;

            });
            
            System.out.println("K�nyv sikeresen kos�rba helyezve");

            // Tov�bb a megrendel�shez

            WebElement goToCart = driver.findElement(By.id("block-bookshop-cart-block"));

            goToCart.click();

            Thread.sleep(2000);
            
            WebElement goToEdit = driver.findElement(By.id("edit-checkout"));

            goToEdit.click();

            Thread.sleep(2000);

            System.out.println("K�nyv kos�rba helyezve, megrendel�s ind�that�.");
            
            WebElement goToNextPage = driver.findElement(By.id("edit-actions-next"));

            goToNextPage.click();
            
            Thread.sleep(2000);
            
            WebElement familyName = driver.findElement(By.id("edit-storefront-shipping-information-shipping-profile-address-0-address-family-name"));

            familyName.sendKeys("FamilyName");
            
            WebElement givenName = driver.findElement(By.id("edit-storefront-shipping-information-shipping-profile-address-0-address-given-name"));

            givenName.sendKeys("GivenName");
            
            
            WebElement adressLocality = driver.findElement(By.id("edit-storefront-shipping-information-shipping-profile-address-0-address-locality"));

            adressLocality.sendKeys("Budapest");
            
            WebElement adressLine = driver.findElement(By.id("edit-storefront-shipping-information-shipping-profile-address-0-address-address-line1"));

            adressLine.sendKeys("Lajos utca");
            
            WebElement postalCode = driver.findElement(By.id("edit-storefront-shipping-information-shipping-profile-address-0-address-postal-code"));

            postalCode.sendKeys("1045");
            
            
            WebElement goToFinalPage = driver.findElement(By.id("edit-actions-next"));

            goToFinalPage.click();
            
            
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}