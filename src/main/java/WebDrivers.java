import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDrivers {
    public WebDriver driver;
    public WebDriver Driver(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\demir\\SliconLab\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

}
