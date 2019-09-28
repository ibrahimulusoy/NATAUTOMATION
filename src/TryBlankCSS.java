import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryBlankCSS
{
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser=new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package']/div/ul/li/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package']/div/ul/li/div/div/div[1]/div[2]/div[4]/button/span[1]/svg")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package']/div/ul/li/div/div/div[1]/div[2]/div[4]/button/span[1]/svg")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='traveler-selector-hp-package']/div/ul/li/div/div/div[1]/div[2]/div[4]/button/span[1]/svg")).click();
    }
}
