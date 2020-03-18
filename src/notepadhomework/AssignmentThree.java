package notepadhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {
    /*Assignment 3- Handle the captcha

Navigate to website "https://timesofindia.indiatimes.com/poll.cms"
add the numbers
handle the operators +, - & x.*/
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://timesofindia.indiatimes.com/poll.cms";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        WebElement driver1 = driver.findElement(By.xpath("//td[@class='normtxt']//input[1]"));
        driver1.click();

        String mathquestionvalue = driver.findElement(By.xpath("//span[@id='mathq2']")).getText().trim();
        Thread.sleep(3000);
        // remove space if exist
        String removespace = mathquestionvalue.replaceAll("\\s+", "");
        // get two numbers
        String[] parts = removespace.split("\\+");
        String part1 = parts[0];
        String part2 = parts[1];
        String[] parts1 = part2.split("=");
        String part11 = parts1[0];
        // sum two numbers
        int summation = Integer.parseInt(part1) + Integer.parseInt(part11);
        // Math Capcha value

        WebElement captcha = driver.findElement(By.xpath("//input[@id=\"mathuserans2\"]"));
        captcha.clear();
        captcha.sendKeys("" + summation);

        WebElement voteButton = driver.findElement(By.xpath("//div[@class=\"homesprite vot\"]"));
        voteButton.click();

    }








    }

