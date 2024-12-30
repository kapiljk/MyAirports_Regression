package pages.pageLocators;

import org.openqa.selenium.By;

public interface EssentialServicesPageLoc {
    By lblHeading = By.xpath("(//*[@text='Essential & Services'])[1]");
    By essentialsearch = By.xpath("(//*[@text='Essential & Services'])[2]");
    By ddTerminal = By.xpath("(//*[@text='Essential & Services'])[1]/following-sibling::*[1]");
    By ddTermina1 = By.xpath("(//*[@text='KUL - Terminal 1'])[1]");
    By ddTermina2 = By.xpath("(//*[@text='KUL - Terminal 2'])[1]");
    By ddBKI = By.xpath("(//*[@text='BKI - Kota Kinabalu'])[1]");
    By ddKCH = By.xpath("(//*[@text='KCH - Kuching'])[1]");
    By ddPEN = By.xpath("(//*[@text='PEN - Penang'])[1]");
    By allServices = By.xpath("(//*[@text='Essential & Services'])[2]/../../following-sibling::*[1]/*[1]");
    By btnBack = By.xpath("(//*[@text='Essential & Services'])[1]/preceding-sibling::*[1]");
    By link1stService = By.xpath("(//*[@text='Essential & Services'])[2]/../../following-sibling::*[1]/*[1]/*[1]/*[1]");
    By btnServiceBack = By.xpath("(//*[@class='android.widget.TextView'])[1]/preceding-sibling::*[1]/*");
    By serviceTitle = By.xpath("(//*[@class='android.widget.TextView'])[1]");

    By lblHeadingService = By.xpath("//*[@text='About']/../*[1]/following-sibling::*[1]");
    By lblTakeMeThere = By.xpath("//*[@text='Take Me There']");
    By lblRatingReview = By.xpath("//*[@text='RATING REVIEW']");
    By btnBackService = By.xpath("//*[@text='About']/../*[1]/*");
    By btnFavouriteService = By.xpath("//*[@text='Favourite']/../*[1]");



}
