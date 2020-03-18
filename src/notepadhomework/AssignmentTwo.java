package notepadhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentTwo {
    /*
    Assignment 2-

Navigate to website "https://demo.nopcommerce.com/"
Click on register link.
Fill the all fields.
Click on register button.
     */


    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
        //driver.quit();

        Thread.sleep(30);


        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();


        WebElement genderMale = driver.findElement(By.xpath("//span[@class=\"male\"]//input[@type='radio']"));
        genderMale.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
        firstName.sendKeys("Pradeep");


        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.sendKeys("Patel");

        WebElement date = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        date.sendKeys("4");

        WebElement month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        month.sendKeys("July");

        WebElement year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        year.sendKeys("1986");

        WebElement email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
        email.sendKeys("1@gmail.com");

        WebElement companyName = driver.findElement(By.xpath("//input[@id=\"Company\"]"));
        companyName.sendKeys("Testing Team");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
        password.sendKeys("xyz123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
        confirmPassword.sendKeys("xyz123");

        WebElement register1 = driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
        register1.click();


    }

}
