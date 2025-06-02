import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    // Konstruktor

    public ProductPage(WebDriver driver) {

        super(driver);

    }

    // Oldal elemei

    private final By toCartButton = By.cssSelector("input[type='submit'][value='Kosárba']");

    // Mûveletek

    public void clickCartButton() {

        click(toCartButton);

    }

    public boolean isCartButtonVisible() {

        return isElementVisible(toCartButton);

    }

}