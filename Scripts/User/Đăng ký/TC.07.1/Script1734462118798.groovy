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

WebUI.navigateToUrl('https://techzone.serv00.net/')

WebUI.click(findTestObject('Object Repository/User/Lan/Page_TechZone/a_Login'))

WebUI.click(findTestObject('Object Repository/User/Lan/Page_TechZone/button_Create an account'))

WebUI.setText(findTestObject('Object Repository/User/Lan/Page_TechZone/input_Become a member of TechZone_firstname'), 'Lan')

WebUI.setText(findTestObject('Object Repository/User/Lan/Page_TechZone/input_Become a member of TechZone_lastname'), 'Lê')

WebUI.setText(findTestObject('Object Repository/User/Lan/Page_TechZone/input_Become a member of TechZone_username'), 'Lan162')

WebUI.setText(findTestObject('Object Repository/User/Lan/Page_TechZone/input_Become a member of TechZone_email'), 'lan16022004@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User/Lan/Page_TechZone/input_Become a member of TechZone_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/User/Lan/Page_TechZone/input_Become a member of TechZone_passwordagain'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/User/Lan/Page_TechZone/button_Register'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User/Lan/Page_TechZone/div_Signed up successfully'))

WebUI.closeBrowser()

