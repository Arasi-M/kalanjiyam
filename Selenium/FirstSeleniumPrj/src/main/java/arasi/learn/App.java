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

        App appobj = new App();
        appobj.ownMethod();

        corebasic obj = new corebasic();
        obj.strexamples();˳

        fibonacci fb = new fibonacci();
        fb.generateFibSeries();

        // stringExamples obj = new stringExamples();
        System.out.println("\nString Literal is "+ stringExamples.strLiteral );
        System.out.println("String is "+ stringExamples.str1 +"\n");
*/      String output = stringExamples.prtReverse("ARASI");
        System.out.println(output);
        System.out.println("Substring is "+output.substring(1,3));
        System.out.println("\n--"+stringExamples.strLiteral.trim()+"--Trims only at the front & back");
        stringExamples.isPalindrome("Sairam");
    }

    public void ownMethod()
    {
        System.out.println("This method belongs to the same class as you !");
    }
}
