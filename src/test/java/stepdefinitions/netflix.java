package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import org.openqa.selenium.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class netflix extends TestBase {
    @And("Virus Total Sayfasina Gidilir")
    public void virusTotalSayfasinaGidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("urlVirusTotal"));
        ReusableMethods.bekle(20);


    }

    @And("Inputta netflix io gonderilir")
    public void netflix() {


        try {

            WebElement elm = (WebElement) ((JavascriptExecutor) Driver.getDriver())
                    .executeScript("return arguments[0].shadowRoot.querySelector('vt-ui-search-bar')",
                            Driver.getDriver().findElement(By.tagName("home-view")));


            input.sendKeys(ConfigReader.getProperty("netflix"));
            input.sendKeys(Keys.ENTER);

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }


    @And("Beklenir")
    public void beklenir() {
        ReusableMethods.bekle(5);
    }
}
