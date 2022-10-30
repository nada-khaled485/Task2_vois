package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    public static WebDriver driver;

    public void before_scenario(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("resolution", "1024x768");
    }
}
