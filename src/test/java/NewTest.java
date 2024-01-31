import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NewTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        System.out.println("first test");
        ChromeOptions o = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"),o);
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.quit();
    }
}