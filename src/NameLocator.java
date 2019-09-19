import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator
{
    public static WebDriver ibrahim;
    public static void main(String args[])
    {
        invokeChromeBrowser();
        ibrahim.get("http://www.facebook.com");
        ibrahim.findElement(By.name("firstname")).sendKeys("Ibrahim");
        ibrahim.findElement(By.name("lastname")).sendKeys("Ulusoy");

    }

    public static void invokeChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\iulusoy\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ibrahim=new ChromeDriver();
    }
}
