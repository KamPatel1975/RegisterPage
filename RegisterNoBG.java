package RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterNoBG {
    public static class RegisterNoBoniGarcia {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cam\\IdeaProjects\\downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
            driver.findElement(By.className("ico-register")).click();
            driver.findElement(By.id("gender-male")).click();
            driver.findElement(By.id("FirstName")).sendKeys("123kam");
            driver.findElement(By.id("LastName")).sendKeys("patel");
            WebElement day = driver.findElement(By.name("DateOfBirthDay"));
            WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
            WebElement year = driver.findElement(By.name("DateOfBirthYear"));

            Select select = new Select(day);
            select.selectByVisibleText("9");
            Select select1 = new Select(month);
            select1.selectByValue("7");
            Select select2 = new Select(year);
            select2.selectByVisibleText("1975");
            driver.findElement(By.name("Email")).sendKeys("kam2perth@hotmail.com");
            driver.findElement(By.name("Password")).sendKeys("Testing123");
            driver.findElement(By.name("ConfirmPassword")).sendKeys("Testing123");
            driver.findElement(By.name("register-button")).click();
        }}}
