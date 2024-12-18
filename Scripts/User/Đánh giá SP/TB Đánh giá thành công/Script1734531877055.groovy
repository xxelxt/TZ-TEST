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

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_Language_arrow_carrot-down'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/a_Vietnamese'))

WebUI.click(findTestObject('Page_TechZone/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_TechZone/input_ng nhp ti khon_login'), 'nguyenmai')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_TechZone/input_ng nhp ti khon_password'), '/0Nzv0zyX6g=')

WebUI.click(findTestObject('Object Repository/Page_TechZone/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/li_PC'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/a_Workstation'))

WebUI.click(findTestObject('Page_TechZone/a_Server Asus TS100-E11-PI4-2314041Z (E-231416GB RAM1TB HDD300W)'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/button_Vit nh gi'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/label'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/button_Gi bnh lun'))

WebUI.verifyTextPresent('Đánh giá sản phẩm thành công', false)

WebUI.closeBrowser()

