package pages;

import base.PageBase;
import io.cucumber.java.mk_latn.No;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeatsPage extends PageBase {

    By firstSeat = By.xpath("(//input[@id='SrvcSelectBtnForward0'])[2]");
    By droppingPoints = By.id("DpFid");
    By boardingPoints = By.id("BpFid");
    By exitBoardingPoints = By.xpath("(//span[@class=\"p2\"])[2]");
    By seat = By.xpath("(//input[@id='SrvcSelectBtnForward2'])[2]");
    By customerDetails = By.xpath("//a[@id='Forwardprofile-tab']");
    By mobileNo = By.id("mobileNo");
    By email = By.id("email");
    By seatnum = By.id("Forward98");
    By CHAN21 = By.id("Forward-1467543003073");
    By getDroppingPoints = By.id("Forwarddroping-tab");
    By PassengerDetailsName = By.id("passengerNameForward0");
    By PassengerDetailsGender = By.id("genderCodeIdForward0");
    By  PassengerDetailsAge = By.id("passengerAgeForward0");
    By PassengerDetailsConcession = By.id("concessionIdsForward0");
    By PassengerDetailsCountry = By.id("nationalityForward0");

    public SeatsPage(WebDriver driver) {
        super(driver);
    }

    public void seatnum() {
        click(seatnum);
    }
    public void clickFirstSeat() {
        click(firstSeat);
    }
    public void clickCHAN21() {
        click(CHAN21);
    }
    public void clickSeat() {
        click(seat);
    }
    public void clickCustomerDetails() {
        click(customerDetails);
    }
    public void clickgetDroppingPoints() {
        click(getDroppingPoints);
    }

    public void selectDroppingPoints(String droppingPoint){
        click(droppingPoints);
        click(By.xpath("//span[contains(text(),'"+droppingPoint+"')]"));
    }
    public void selectBoardingPoints(String boardingPoint){
        click(boardingPoints);
        click(By.xpath("//span[contains(text(),'"+boardingPoint+"')]"));
        click(exitBoardingPoints);
    }
    public void mobileNo(String No){ typeText(mobileNo, No);  }
    public void email(String emailt){ typeText(email, emailt);  }
    public void selectPassengerDetailsGender(int Gender){select(PassengerDetailsGender,Gender);}
    public void selectPassengerDetailsCountry(int Country){select(PassengerDetailsCountry,Country);}
    public void selectPassengerDetailsConcession(int Concession){select(PassengerDetailsConcession,Concession);}
    public void setPassengerDetailsName(String name){typeText(PassengerDetailsName,name);}
    public void setPassengerDetailsAge(String age){typeText(PassengerDetailsAge,age);}

}
