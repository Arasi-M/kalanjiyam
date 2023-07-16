package arasi.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Sai Appa!" );
        System.setProperty("webdriver.chrome.driver","/Users/arasi/Library/Mobile Documents/com~apple~CloudDocs/Arasi/Study/BrowserDriver/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();

    }
}
