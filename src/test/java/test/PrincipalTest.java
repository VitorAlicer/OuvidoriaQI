package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Principal;

public class PrincipalTest {
    static WebDriver driver;
    static Principal principal;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qi.edu.br/ouvidoria/");

        principal = new Principal(driver);

        principal.preencherCampo();

    }

    @After
    public void tearDown() throws Exception {
    }
}
