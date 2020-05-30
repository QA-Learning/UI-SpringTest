import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class juiceshop_e2e {

    WebDriver driver;
    String email = "b@gmail.com";
    String password = "abc@gmail.com";

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @Test
//    public void register(){
//        driver.get("http://localhost:3000/#/register");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]")).click();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        driver.findElement(By.id("emailControl")).sendKeys(email);
//        driver.findElement(By.id("passwordControl")).sendKeys(password);
//        driver.findElement(By.id("repeatPasswordControl")).sendKeys(password);
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        driver.findElement(By.name("securityQuestion")).click();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();
//        driver.findElement(By.id("securityAnswerControl")).sendKeys(password);
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        driver.findElement(By.id("registerButton")).click();
//    }

    @Test
    public void login(){
        driver.get("http://localhost:3000/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("loginButton")).click();
    }

    @Test
    public void addItemToCart(){

    }

    public void removeItemFromCart(){

    }

}
