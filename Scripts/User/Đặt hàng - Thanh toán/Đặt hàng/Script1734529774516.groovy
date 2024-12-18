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

WebUI.setEncryptedText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input_ng nhp ti khon_password'), 'PJqCVc3bIHpvVF4kXjB5iw==')

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_Laptop'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_Dell Inspiron 14 5430 (71015633) (i7-1360_f25f89'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/button_THM VO GI HNG'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/i_Sn phm_fa fa-shopping-bag'))

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/a_THANH TON'))

WebUI.setText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input__address'), diachi)

WebUI.setText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input__district'), quan)

WebUI.setText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input__city'), thanhpho)

WebUI.setText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input__phone'), sdt)

WebUI.setText(findTestObject('Object Repository/User/TAnh/Page_TechZone/input__content'), 'giao vào nhà số 10')

WebUI.click(findTestObject('Object Repository/User/TAnh/Page_TechZone/button_t hng'))

WebUI.verifyTextPresent(mess, false)

WebUI.closeBrowser()

