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

WebUI.setText(findTestObject('Page_Login to TechZone admin page/input_Username_username'), 'techzone_staff')

WebUI.setEncryptedText(findTestObject('Page_Login to TechZone admin page/input_Password_password'), 'aQFyMLXr2stqDHmuqF0uoQ==')

WebUI.sendKeys(findTestObject('Page_Login to TechZone admin page/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Profile/img_Profile_img-radius'))

WebUI.click(findTestObject('Object Repository/Page_Profile/a_Profile'))

WebUI.setText(findTestObject('Object Repository/Page_Profile/input_First name_firstname'), 'Chi')

WebUI.setText(findTestObject('Object Repository/Page_Profile/input_Last name_lastname'), 'Lan')

WebUI.setText(findTestObject('Object Repository/Page_Profile/input_Email_email'), 'lanchi@techzone.vn')

WebUI.setText(findTestObject('Object Repository/Page_Profile/input_Phone_phone'), '0912345678')

WebUI.click(findTestObject('Object Repository/Page_Profile/input_Joining date_changepasswordprofile'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profile/input_New password_password'), 'IY3bszLmflQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profile/input_Confirm new password_passwordagain'), 'IY3bszLmflQ=')

WebUI.click(findTestObject('Object Repository/Page_Profile/button_Update'))

WebUI.delay(3)

String imagePath = 'E:/rkive/7/Software Testing & QA/Katalon Studio/TechZone/Test File/User_Image.jpg'

WebUI.uploadFile(findTestObject('Object Repository/Page_Profile/input_Image'), imagePath)

WebUI.click(findTestObject('Object Repository/Page_Profile/button_Submit'))

WebUI.delay(3)

