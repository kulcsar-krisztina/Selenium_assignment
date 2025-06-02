import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // ChromeDriver el�r�si �t be�ll�t�sa

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkris\\chromedriver-win64\\chromedriver.exe");

        // WebDriver p�ld�ny l�trehoz�sa

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
        	System.out.println("LoginAutomation futtat�sa:");
        	LoginAutomation.login(driver);
        	
            System.out.println("\nXPathExample futtat�sa:");
            XPathExample.showXPathExample(driver);
        	
        	System.out.println("\nPageTitleReader futtat�sa:");
        	PageTitleReader.readPageTitle(driver);

            System.out.println("\nStaticPageTest futtat�sa:");
            StaticPageTest.testStaticPage(driver);
            
            List urls = Arrays.asList(
                    "https://hernadi-antikvarium.hu/antikvarium/2310015240826/rezi-neni-igazi-magyar-konyha?v=781092",
                    "https://hernadi-antikvarium.hu/antikvarium/2399969859544/halasz-zoltan-meselo-szakacskonyv?v=727273"
            );

            StaticPageTester tester = new StaticPageTester(driver);
            tester.testPages(urls);
            
            System.out.println("\nOrderFormAutomation futtat�sa:");
            OrderFormAutomation.automateOrderForm(driver);
            
            driver.get("https://hernadi-antikvarium.hu/antikvarium/2310015240826/rezi-neni-igazi-magyar-konyha?v=781092");

            ProductPage page = new ProductPage(driver);

            if (page.isCartButtonVisible()) {

                page.clickCartButton();

                System.out.println("Kos�rba gomb m�k�dik.");

            } else {

                System.out.println("Kos�rba gomb nem l�that�.");

            }
            
            System.out.println("\nLogoutAutomation futtat�sa:");
            LogoutAutomation.logout(driver);
            
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	driver.quit();
        }

    }

}