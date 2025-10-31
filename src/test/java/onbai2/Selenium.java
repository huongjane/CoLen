package onbai2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Selenium {
    WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        driver = new ChromeDriver();
    }

//    @Test
//    public  void  Tim(){
//        driver.get("https://www.vietjetair.com/vi/select-flight?itm_source=Leadr&itm_medium=Landing_Page");
//    }

    @Test
    public  void Rergiter(){
        driver.get("https://hoctotlamhay.vn/register");
        driver.findElement(By.id("name")).sendKeys("tu123");
        driver.findElement(By.id("user_email")).sendKeys("vtu12122007@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.linkText("Đăng ký")).click();
        System.out.println("Dang ky thanh cong");
    }
    @Test
    public  void Login(){
        driver.get("https://hoctotlamhay.vn/login");
        driver.findElement(By.id("user_email")).sendKeys("vtu12122007@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.linkText("Đăng nhập")).click();
        System.out.println("Dang nhap thanh cong");
    }


    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
