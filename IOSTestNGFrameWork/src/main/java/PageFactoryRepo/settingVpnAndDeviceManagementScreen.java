package PageFactoryRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class settingVpnAndDeviceManagementScreen {
	// Giving life to driver by Constracor
	public settingVpnAndDeviceManagementScreen(IOSDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

// **************************************************************************************************************************************

	// Locaters and Storing In Variable
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='VPN & Device Management']")
	public WebElement VpnAndDeviceManagementText;

	// Locaters and Storing In Variable
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='VPN']/..//XCUIElementTypeStaticText[2]")
	public WebElement VPNStatusText;

	

}
