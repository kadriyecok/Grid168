package manage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDriverManage {

    static WebDriver driver;

    DesiredCapabilities capabilities = new DesiredCapabilities();

    public WebDriver setUpChromedriver() {

        capabilities.setPlatform(Platform.ANY); // Platform secimi yaptik
        capabilities.setBrowserName("chrome"); // Browser name secimi yaptik
        capabilities.setVersion("152.0.7977.76 "); // Browser version secimi yaptik

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(capabilities);

        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.133:4444"),chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        return driver;
    }
}
