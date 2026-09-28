import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/jefribarutu/Library/Developer/Xcode/DerivedData/UIKitCatalog-cllnrvdhqxbizjcjuzpawumwpxue/Build/Products/Debug-iphonesimulator/UIKitCatalog.app', 
    true)

Mobile.tap(findTestObject('ios_test01/XCUIElementTypeOther'), 60)

Mobile.tap(findTestObject('ios_test01/XCUIElementTypeButton - UIKitCatalog'), 60)

Mobile.tap(findTestObject('ios_test01/XCUIElementTypeStaticText - ImageViewController'), 60)

Mobile.tap(findTestObject('ios_test01/XCUIElementTypeOther (1)'), 60)

Mobile.tap(findTestObject('ios_test01/XCUIElementTypeButton - UIKitCatalog'), 60)

Mobile.tap(findTestObject('ios_test01/XCUIElementTypeStaticText - Sliders'), 60)

Mobile.swipeWithDuration(200, 479, 264, 469, 868)

Mobile.swipeWithDuration(318, 371, 268, 376, 832)

Mobile.swipeWithDuration(211, 292, 286, 286, 736)

Mobile.swipeWithDuration(173, 199, 236, 198, 1351)

Mobile.tap(findTestObject('ios_test01/XCUIElementTypeButton - UIKitCatalog'), 60)

Mobile.closeApplication()

