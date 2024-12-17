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

WebUI.setText(findTestObject('Admin/Page_Login to TechZone admin page/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Admin/Page_Login to TechZone admin page/input_Password_password'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Admin/Page_Login to TechZone admin page/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Admin/Page_Staff_Edit/span_Staffs'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Staff_Edit/a_Edit'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Staff_Edit/label_First name'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_First name_firstname'), 'Chi')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Last name_lastname'), 'Lan')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Username_username'), 'nguyenantechzone')

WebUI.click(findTestObject('Object Repository/Admin/Page_Staff_Edit/label_Username'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Username_username'), 'lanchitechzone')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Email_email'), 'annguyentechzone@gmail.com')

WebUI.click(findTestObject('Object Repository/Admin/Page_Staff_Edit/label_Email'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Email_email'), 'lanchitechzone@gmail.com')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Phone_phone'), '0912345768')

WebUI.click(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Phone_changepassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Change password_password'), 'iExx4CZxnjSxozAst4lrIA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_Staff_Edit/input_Change password_passwordagain'), 'iExx4CZxnjSxozAst4lrIA==')

WebUI.click(findTestObject('Object Repository/Admin/Page_Staff_Edit/button_Update'))

WebUI.closeBrowser()

