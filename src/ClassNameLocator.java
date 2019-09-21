import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator
{
    static WebDriver ibrahim;
    public static void main(String[] ibram) throws InterruptedException {
        invokeChromeBrowser();
        ibrahim.get("https://www.turkishairlines.com/");
        Thread.sleep(3000);
        ibrahim.findElement(By.className("thyHeaderLink")).click();
    }
    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\iulusoy\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ibrahim=new ChromeDriver();
    }
}

