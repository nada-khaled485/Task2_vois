package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase {
    By date =By.xpath("//a[@class=\"ui-state-default\"]");
    By CHIKKAMAGALURU =By.xpath ("(//a[@href='#'])[18]");
    By arrivalDate =By.id("txtReturnJourneyDate");
    By searchForBus =By.className("btn-booking");
   public HomePage(WebDriver driver){super(driver);}
    public void clickArrivalDate(){click(arrivalDate);}


public void clickCHIKKAMAGALURU(){click(CHIKKAMAGALURU);}
    public void clickDate(){click(date);}
    public void clickSearchForBus (){click(searchForBus);}

}
