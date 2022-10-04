import day12.TestParameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    public String RandomAlphabeticString(int stringLength){

        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();


        return random.ints(leftLimit,rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();


    }
    public int GenerateBirthYear(int min , int max){

        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }



    WebDriver driver = null;

    @Test
    public void Registration() throws InterruptedException {

        new TestParameter().registration(RandomAlphabeticString(3), RandomAlphabeticString(4), RandomAlphabeticString(5)+"@sss.com",String.valueOf(GenerateBirthYear(1922,2000)),"Male",RandomAlphabeticString(8));

        String gender = "Male";
        String password = RandomAlphabeticString(8);
        String email_address = RandomAlphabeticString(5)+"@sss.com";


        if (driver.findElement(By.xpath("//a[text()='Login']")).isDisplayed()) {

            driver.findElement(By.xpath("//a[text()='Login']")).click();
            driver.findElement(By.xpath("//span[text()='Sign up now']")).click();
            driver.findElement(By.id("email")).sendKeys(email_address);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("firstName")).sendKeys(RandomAlphabeticString(3));
            driver.findElement(By.id("lastName")).sendKeys(RandomAlphabeticString(4));
            driver.findElement(By.xpath("//div[@name='yearOfBirth']")).click();
            driver.findElement(By.xpath("//div[.='" + 1991 + "']")).click();
            driver.findElement(By.xpath("//div[@name='gender']")).click();
            driver.findElement(By.xpath("//div[@id='gender']/div[.='" + gender + "']")).click();
            driver.findElement(By.cssSelector("div:nth-child(1) > .Checkbox .Checkbox-label")).click();
            driver.findElement(By.cssSelector("div:nth-child(2) .Checkbox-label")).click();
            driver.findElement(By.xpath("//button[.='Sign Me Up']")).click();

        } else {
            System.out.println("page not displayed");
        }
    }


   static String email = null;
   static String password = null;


    @BeforeEach
    public void startBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://stage.tvnz-stage.co.nz/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterEach
    public void quitBrowser(){

        driver.close();
        driver.quit();
    }



    @Test

    public void login(){


        //Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Login']")).isDisplayed(),"HomePage is not Displayed");

           driver.findElement(By.xpath("//a[text()='Login']")).click();

           System.out.println(driver.getCurrentUrl());


//        List <WebElement> categories = driver.findElements(By.xpath("//li[@id='Categories']//ul/li"));
//
//        for(WebElement element:categories){
//
//            System.out.println(element.getAttribute("text"));



          List <WebElement> movies = driver.findElements(By.xpath("//h2[@id='anchor-Movies']/../../..//div[@class='swiper-wrapper']//a/div"));

           for(WebElement a:movies){

                System.out.println(a.getAttribute("id"));

    }

            driver.findElement(By.id("email")).sendKeys(email);
           driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.xpath("//span[.='Login']/..")).click();

    }
}