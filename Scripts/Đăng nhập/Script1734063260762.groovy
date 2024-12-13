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

TestData testData = findTestData('Data Files/Data_Login')

for (def rowIndex = 1; rowIndex <= testData.getRowNumbers(); rowIndex++) {
	
	String username = testData.getValue('Username', rowIndex)
	
	String password = testData.getValue('Password', rowIndex)

	WebUI.openBrowser('')
	
	WebUI.maximizeWindow()
	
	WebUI.navigateToUrl('https://techzone.serv00.net/admin/login')
	
	WebUI.setText(findTestObject('Object Repository/Page_Login to TechZone admin page/input_Username_username'), username)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to TechZone admin page/input_Password_password'), password)
	
//	WebUI.sendKeys(findTestObject('Object Repository/Page_Login to TechZone admin page/input_Password_password'), Keys.chord(
//			Keys.ENTER))
	
	WebUI.click(findTestObject('Object Repository/Page_Login to TechZone admin page/button_Sign in'))
	
	WebUI.closeBrowser()
}

