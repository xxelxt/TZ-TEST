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

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/span_Language_arrow_carrot-down'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_Vietnamese'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input_ng nhp ti khon_login'), 'anhnguyenthuy6868@gmail.com')

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/input_ng nhp ti khon_login'))

WebUI.setEncryptedText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input_ng nhp ti khon_password'), 'PJqCVc3bIHpvVF4kXjB5iw==')

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_Xin cho Anh Thuy'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_n hng ca bn'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_Chi tit'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/div_Thng tin n hng                        M_fae42e'))

WebUI.verifyTextPresent('Khách hàng: Nguyễn Anh', false)

WebUI.closeBrowser()

