
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cases {
    WebDriver driver;


    @Test
    public void f() {
        driver.manage().window().maximize();


    }
    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
    }
}
