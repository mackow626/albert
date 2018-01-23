import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Test123 {

    WebDriver driver;

    @BeforeTest
    public void SetUp(){
        File file = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
         driver = new ChromeDriver();
        //funkcja opoznia wykonywanie testu automatyycznego 10 razy o ekunde

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test
    public void Test1() {

        driver.get("http://www.wp.pl");

        driver.close();
    }

    @Test
    public void Test2() {

        driver.get("http://www.wp.pl");

        driver.close();


    }





/*        public static void main(String[] args) throws InterruptedException {

            File file = new File("chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            WebDriver driver= new ChromeDriver();
            //funkcja opoznia wykonywanie testu automatyycznego 10 razy o ekunde

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            sleep(2000);

            driver.get("http://www.wp.pl");
            driver.close();



        }*/


}
