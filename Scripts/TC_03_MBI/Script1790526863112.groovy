import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.maybank.co.id/')

WebUI.waitForPageLoad(60)

TestObject heading = findTestObject('Object Repository/MBI_Repo/txt_Temukan_Solusi_Finansial')

TestObject bukaTabungan = findTestObject('Object Repository/MBI_Repo/lnk_Buka_Tabungan')

TestObject registeredQuestion = findTestObject('Object Repository/MBI_Repo/txt_Terdaftar_Nasabah')

TestObject ajukanPinjaman = findTestObject('Object Repository/MBI_Repo/lnk_Ajukan_Pinjaman')

TestObject maybankLogo = findTestObject('Object Repository/MBI_Repo/img_Maybank_Logo')

WebUI.waitForElementVisible(heading, 60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(heading, 'Temukan solusi finansial yang sesuai dengan kebutuhan Anda', FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshots/TC_03_MBI_01_Homepage.png')

WebUI.waitForElementClickable(bukaTabungan, 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(bukaTabungan)

WebUI.waitForPageLoad(60)

WebUI.waitForElementVisible(registeredQuestion, 60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(registeredQuestion, 'Sebelum memulai, apakah Anda telah terdaftar sebagai nasabah Maybank?', FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshots/TC_03_MBI_02_Buka_Tabungan.png')

WebUI.navigateToUrl('https://www.maybank.co.id/')

WebUI.waitForPageLoad(60)

WebUI.waitForElementVisible(heading, 60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(heading, 'Temukan solusi finansial yang sesuai dengan kebutuhan Anda', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(ajukanPinjaman, 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(ajukanPinjaman)

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.waitForElementClickable(maybankLogo, 30, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshots/TC_03_MBI_03_Ajukan_Pinjaman.png')

WebUI.click(maybankLogo)

WebUI.waitForPageLoad(60)

WebUI.waitForElementVisible(heading, 60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(heading, 'Temukan solusi finansial yang sesuai dengan kebutuhan Anda', FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshots/TC_03_MBI_04_Back_Homepage.png')

WebUI.closeBrowser()