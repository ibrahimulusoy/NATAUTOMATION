import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositiveTicketTC
{
    public static void main(String Args[]) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("i>>");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pwd");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@data-testid,'l_e')]")).sendKeys("conrains l_a");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Forgot account?' ]")).click();

        //browser methodunda bunlar yaziyor
        //public  WebDriver invokeChromeBrowser()
        //    {
        //        System.setProperty("webdriver.chrome.driver","C:\\Users\\iulusoy\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //        WebDriver ibrahim=new ChromeDriver();
        //        return ibrahim;
        //
        //    }
        //
        //
    }
}
