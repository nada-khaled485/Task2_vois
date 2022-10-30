package testCases;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SeatsPage;

public class Scenario1 extends TestBase {
    TestBase testBase;
    HomePage homePage;
    SeatsPage seatsPage;

    @BeforeMethod
    public void beforeMethod() {
        testBase = new TestBase();
        testBase.before_scenario();
        homePage = new HomePage(driver);
        seatsPage = new SeatsPage(driver);

    }

    @Test

    public void seatsBooking() throws InterruptedException {
        driver.manage().window().maximize();
        homePage.clickCHIKKAMAGALURU();
        //    homePage.clickArrivalDate();
        homePage.clickDate();
        homePage.clickSearchForBus();
        seatsPage.clickFirstSeat();
        seatsPage.selectDroppingPoints("BENGALURU");
        seatsPage.selectBoardingPoints("CHIKKAMAGALURU BUS STAND");
        Thread.sleep(10000);
       seatsPage.clickSeat();
       seatsPage.clickCustomerDetails();
       seatsPage.mobileNo("6789125987");
        seatsPage.email("mobile.khaled@gmail.com");
        seatsPage.clickgetDroppingPoints();
        seatsPage.clickCHAN21();
        seatsPage.seatnum();
        Thread.sleep(10000);
        seatsPage.setPassengerDetailsName("nada K");
        seatsPage.selectPassengerDetailsGender(3);
        seatsPage.selectPassengerDetailsConcession(1);
        seatsPage.selectPassengerDetailsCountry(2);

        seatsPage.setPassengerDetailsAge("25");






    }
}
