package arasi.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String prt ="";
    public static void main( String[] args )
    {
        System.out.println( "Hello Sai Appa!" );
        System.setProperty("webdriver.chrome.driver","/Users/arasi/Library/Mobile Documents/com~apple~CloudDocs/Arasi/Study/BrowserDriver/chromedriver_mac64/chromedriver");
 /*       WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver","/Users/arasi/Library/Mobile Documents/com~apple~CloudDocs/Arasi/Study/BrowserDriver/geckodriver");
//        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.amazon.in");
        prt = driver.getTitle();
        System.out.println("TItle of the web page is "+driver.getTitle());
        System.out.println("Current URL is "+driver.getCurrentUrl());
        driver.close();
  */
        App appobj = new App();
        appobj.ownMethod();

        corebasic obj = new corebasic();
        obj.strexamples();

    }

    public void ownMethod()
    {
        System.out.println("This method belongs to the same class as you !");
    }
}
