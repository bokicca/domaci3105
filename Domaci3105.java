import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Domaci3105 {
    /*
    Napisati dva smoke testa za https://www.telerik.com/support/demos:
Proveriti da klikom na Desktop odlazimo na tu sekciju
Proveriti da klikom na Mobile odlazimo na tu sekciju
Koristiti TestNG, asserte.
Domaći na git
     */


    //WebDriver driver = new ChromeDriver();
    //System.setProperty("webdriver.chrome.driver", "C:\\Intel\\chromedriver_win32\\chromedriver.exe");
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Al\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");

    private WebDriver driver;


    @BeforeTest
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Al\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.telerik.com/support/demos");
    }

            @Test
            public void runDriver() {
                //WebDriver driver;
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Al\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
                //public void setUp() {
            //WebDriver driver = new ChromeDriver();

           }


            @Test
            public void testDesktopTitle(){
                WebElement desktopManu = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[2]"));
                desktopManu.click();
                WebElement desktop = driver.findElement(By.id("desktop"));
                String expectedTitle = "Desktop";
                String actaulTitle = desktop.getText();
                Assert.assertEquals(actaulTitle,expectedTitle);


            }
            @Test
            public void testMobileTitle(){
                WebElement desktopManu = driver.findElement(By.xpath("//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/div/div[2]/a[3]"));
                desktopManu.click();
                WebElement desktop = driver.findElement(By.id("mobile"));
                String expectedTitle = "Mobile";
                String actualTitle = desktop.getText();
                Assert.assertEquals(actualTitle, expectedTitle);
        }
    @AfterTest
    public void afterAll(){
        driver.close();
    }

}


