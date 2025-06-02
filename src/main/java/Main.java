import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // ChromeDriver elérési út beállítása

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkris\\chromedriver-win64\\chromedriver.exe");

        // WebDriver példány létrehozása

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
        	System.out.println("LoginAutomation futtatása:");
        	LoginAutomation.login(driver);
        	
            System.out.println("\nXPathExample futtatása:");
            XPathExample.showXPathExample(driver);
        	
        	System.out.println("\nPageTitleReader futtatása:");
        	PageTitleReader.readPageTitle(driver);

            System.out.println("\nStaticPageTest futtatása:");
            StaticPageTest.testStaticPage(driver);
            
            List urls = Arrays.asList(
                    "https://hernadi-antikvarium.hu/antikvarium/2310015240826/rezi-neni-igazi-magyar-konyha?v=781092",
                    "https://hernadi-antikvarium.hu/antikvarium/2399969859544/halasz-zoltan-meselo-szakacskonyv?v=727273"
            );

            StaticPageTester tester = new StaticPageTester(driver);
            tester.testPages(urls);
            
            System.out.println("\nOrderFormAutomation futtatása:");
            OrderFormAutomation.automateOrderForm(driver);
            
            driver.get("https://hernadi-antikvarium.hu/antikvarium/2310015240826/rezi-neni-igazi-magyar-konyha?v=781092");

            ProductPage page = new ProductPage(driver);

            if (page.isCartButtonVisible()) {

                page.clickCartButton();

                System.out.println("Kosárba gomb mûködik.");

            } else {

                System.out.println("Kosárba gomb nem látható.");

            }
            
            System.out.println("\nLogoutAutomation futtatása:");
            LogoutAutomation.logout(driver);
            
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	driver.quit();
        }

    }

}