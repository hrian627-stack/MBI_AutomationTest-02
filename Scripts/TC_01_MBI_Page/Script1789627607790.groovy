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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://www.maybanktrade.com.sg/react/v2/page/public/guest_register.jsp')

WebUI.selectOptionByValue(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/select_txtTitle'), 'PROF', false)

WebUI.selectOptionByValue(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/select_txtTitle'), 'MR', false)

WebUI.setText(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_txtFirstName'), GlobalVariable.G_FIRST_NAME)

WebUI.setText(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_txtLastName'), GlobalVariable.G_LAST_NAME)

WebUI.setText(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_txtContactNo'), '91283812831')

WebUI.setText(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_txtEmail'), 'jefri33@gmail.com')

WebUI.setText(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_txtConfirmEmail'), 'jefri33@gmail.com')

WebUI.selectOptionByValue(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/select_txtReferByTR'), 'Y', false)

WebUI.setText(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_txtTREmail'), 'jefri33@gmail.com')

WebUI.setText(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_vldTxt'), 'hooper')

WebUI.click(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/input_chkAgree'))

WebUI.click(findTestObject('Repo Maybank Trade/Page_Maybank Trade Demo/img_btnSubmit'))

textAlert = WebUI.getAlertText()

WebUI.comment('textAlert :' + textAlert)

