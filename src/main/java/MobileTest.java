import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MobileTest {
    @Test
    public void checkMobileTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");
        //Номер телефона
        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(phoneNumber).sendKeys("669143109");
        // Сумма
        By sumPayment = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(sumPayment).sendKeys("250");
        //Номер карты
        By numberCard = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(numberCard).sendKeys("4506909324274797");
        // CVV
        By cvvdebitSource = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(cvvdebitSource).sendKeys("327");
        // Срок действия
        By expiredebitSource = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(expiredebitSource).sendKeys("06-22");
        //Задержка
        Thread.sleep(1500);
        //Имя
        By firstNamedebitSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(firstNamedebitSource).sendKeys("Poerto");
        //Фамилия
        By lastNamedebitSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(lastNamedebitSource).sendKeys("Rico");
        //Нажатие кнопки дальше
        driver.findElement(By.xpath("//button[@data-qa-node='submit']")).click();
        //Оплата
        driver.findElement(By.xpath(".//button[contains(text(), 'Сплатити')]")).click();
        //Назад
        driver.findElement(By.xpath("//button[contains(text(), 'Назад')]")).click();


//        // Проверка теста
//        //Номер телефона
//        System.out.println("" + driver.findElement(By.xpath("//div[@data-qa-node='details']")).getText());
//        By operator = By.xpath("//div[@data-qa-node='details']");
//        Assert.assertEquals("Поповнення телефону. На номер +380669143109", driver.findElement(operator).getText());
////        //Номер карты
//        System.out.println("Номер карты " + driver.findElement(By.xpath("//td[@data-qa-node='card']")).getText());
//        operator = By.xpath("//td[@data-qa-node='card']");
//        Assert.assertEquals("4506 **** **** 4797", driver.findElement(operator).getText());
//        //Оператор
//        System.out.println("Оператор " + driver.findElement(By.xpath("//span[@data-qa-node='nameB']")).getText());
//        operator = By.xpath("//span[@data-qa-node='nameB']");
//        Assert.assertEquals("Vodafone", driver.findElement(operator).getText());
////        //Сумма
////       System.out.println("AMOUNT" + driver.findElement(By.xpath("//div[@data-qa-node='amount']")).getText());
////        operator = By.xpath("//span[@data-qa-node='amount']");
////       Assert.assertEquals("250 UAH", driver.findElement(By.xpath("//div[@data-qa-node='amount']")).getText());
//////      //Комисcия
//        System.out.println("Комисcия " + driver.findElement(By.xpath("//div[@data-qa-node='commission']")).getText());
//        operator = By.xpath("//span[@data-qa-node='commission']");
//        Assert.assertEquals("4", driver.findElement(operator).getText());

        System.out.println("AMOUNT" + driver.findElement(By.xpath("//div[@data-qa-node='amount']")).getText());
        System.out.println("COMMISSION" + driver.findElement(By.xpath("//div[@data-qa-node='commission']")).getText());
        System.out.println("Category" + driver.findElement(By.xpath("//div[@data-qa-node='category']")).getText());
        System.out.println("Details" + driver.findElement(By.xpath("//div[@data-qa-node='details']")).getText());
        System.out.println("Card" + driver.findElement(By.xpath("//td[@data-qa-node='card']")).getText());
        By operator = By.xpath("//span[@data-qa-node='nameB']");


        Assert.assertEquals("Vodafone", driver.findElement(operator).getText());
        Assert.assertEquals("250 UAH", driver.findElement(By.xpath("//div[@data-qa-node='amount']")).getText());
        Assert.assertEquals("4 UAH", driver.findElement(By.xpath("//div[@data-qa-node='commission']")).getText());
        Assert.assertEquals("Поповнення мобільного", driver.findElement(By.xpath("//div[@data-qa-node='category']")).getText());
        Assert.assertEquals("Поповнення телефону. На номер +380669143109", driver.findElement(By.xpath("//div[@data-qa-node='details']")).getText());
        Assert.assertEquals("4506 **** **** 4797", driver.findElement(By.xpath("//td[@data-qa-node='card']")).getText());

    }

}
