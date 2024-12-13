import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://techzone.serv00.net/admin/login')

WebUI.setText(findTestObject('Page_Login to TechZone admin page/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Login to TechZone admin page/input_Password_password'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Page_Login to TechZone admin page/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Staff_Add/span_Staffs'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Add/a_Add'))

WebUI.setText(findTestObject('Object Repository/Page_Staff_Add/input_First name_firstname'), 'An')

WebUI.setText(findTestObject('Object Repository/Page_Staff_Add/input_Last name_lastname'), 'Nguyễn')

WebUI.setText(findTestObject('Object Repository/Page_Staff_Add/input_Username_username'), 'nguyenantechzone')

WebUI.setText(findTestObject('Object Repository/Page_Staff_Add/input_Email_email'), 'annguyentechzone@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Staff_Add/input_Phone_phone'), '09876543321')

WebUI.click(findTestObject('Object Repository/Page_Staff_Add/input_Status_active'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Staff_Add/input_Password_password'), 'mez8r/CyLp4rSp56YyLEeA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Staff_Add/input_Enter password again_passwordagain'), 'mez8r/CyLp4rSp56YyLEeA==')

WebUI.click(findTestObject('Object Repository/Page_Staff_Add/button_Add'))

