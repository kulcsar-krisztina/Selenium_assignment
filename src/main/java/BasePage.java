import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    
    protected void click(By locator) {

        WebElement element = wait.until(d -> {

            WebElement el = d.findElement(locator);

            return (el != null && el.isDisplayed() && el.isEnabled()) ? el : null;

        });

        element.click();

    }

    protected void type(By locator, String text) {

        WebElement element = wait.until(d -> {

            WebElement el = d.findElement(locator);

            return (el != null && el.isDisplayed()) ? el : null;

        });

        element.sendKeys(text);

    }

    protected String getText(By locator) {

        WebElement element = wait.until(d -> {

            WebElement el = d.findElement(locator);

            return (el != null && el.isDisplayed()) ? el : null;

        });

        return element.getText();

    }

    protected boolean isElementVisible(By locator) {

        try {

            WebElement element = wait.until(d -> {

                WebElement el = d.findElement(locator);

                return (el != null && el.isDisplayed()) ? el : null;

            });

            return element.isDisplayed();

        } catch (TimeoutException e) {

            return false;

        }

    }

    protected WebElement waitForElement(By locator) {

        return wait.until(d -> {

            WebElement el = d.findElement(locator);

            return (el != null && el.isDisplayed()) ? el : null;

        });

    }



}