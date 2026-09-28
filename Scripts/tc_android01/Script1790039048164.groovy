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

Mobile.startApplication('/Users/jefribarutu/Downloads/app.apk', true)

Mobile.tap(findTestObject('android_test01/android.widget.Button - MULAI'), 60)

Mobile.tap(findTestObject('android_test01/android.widget.ScrollView'), 60)

Mobile.tap(findTestObject('android_test01/android.widget.CheckBox'), 60)

Mobile.tap(findTestObject('android_test01/android.widget.Button - SETUJU DAN LANJUT'), 60)

Mobile.getText(findTestObject('android_test01/android.widget.TextView - Selamat datang di M2U'), 60)

Mobile.tap(findTestObject('android_test01/android.widget.ImageButton'), 60)

Mobile.tap(findTestObject('android_test01/android.widget.EditText - User-ID'), 60)

Mobile.tap(findTestObject('android_test01/android.widget.EditText - User-ID'), 60)

Mobile.setText(findTestObject('android_test01/android.widget.EditText - User-ID'), 'Jbcdd111', 60)

Mobile.tap(findTestObject('android_test01/android.widget.Button - LANJUT'), 60)

Mobile.tap(findTestObject('android_test01/android.widget.Button - YA'), 60)

Mobile.setText(findTestObject('android_test01/android.widget.EditText - Masukan Password Anda'), 'Mbi123456', 60)

Mobile.tap(findTestObject('android_test01/android.widget.Button - LOGIN'), 60)

Mobile.closeApplication()

