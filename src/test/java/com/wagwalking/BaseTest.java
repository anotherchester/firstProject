package com.wagwalking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    protected User user;
    protected User user1;
    protected User user2;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chocolatey\\lib\\chromedriver\\tools\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");

        System.out.println("Start");

        String acttitle = driver.getTitle();

        System.out.println(acttitle);

        String expect = ("WagWalking.com - Leading Local Dog Walker Service for Dog Owners");

        Assert.assertEquals(acttitle,expect);



        user = new User("oleg@gmail.com", "qwerty", "Oleg", "Olegov",
                "2067717111");

        user1 = new User("umbasa@hotbox.com","123qaz","Lothric","Ashen",
                "2067717171");

        user2 = new User("aaabbb@ccc.dd","lllaaa000@@@","Henry","Smith",
                "2020202");




    }

    @After
    public void quit() {

        System.out.println("Finish");
       // driver.quit();
    }

    //Code have been added

}
