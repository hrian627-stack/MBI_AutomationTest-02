import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.maybank.com/')

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/MBI_Session1/Maybank/txt_Our_Insights_Stories'), 60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Our Insights & Stories', false)

WebUI.scrollToElement(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_About_Us'), 10)

WebUI.waitForElementVisible(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_About_Us'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_About_Us'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_About_Us'))

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/MBI_Session1/Maybank/txt_Humanising_Financial_Services_Good'), 
    60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('In Humanising Financial Services, we make time for good.', false)

WebUI.scrollToElement(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_Our_Customers'), 10)

WebUI.waitForElementVisible(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_Our_Customers'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_Our_Customers'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MBI_Session1/Maybank/lnk_Our_Customers'))

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/MBI_Session1/Maybank/txt_Humanising_Financial_Services_No_One_Behind'), 
    60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('In Humanising Financial Services, we leave no one behind.', false)

WebUI.scrollToElement(findTestObject('Object Repository/MBI_Session1/Maybank/img_Maybank_Logo'), 10)

WebUI.waitForElementClickable(findTestObject('Object Repository/MBI_Session1/Maybank/img_Maybank_Logo'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MBI_Session1/Maybank/img_Maybank_Logo'))

WebUI.waitForPageLoad(60)

WebUI.closeBrowser()