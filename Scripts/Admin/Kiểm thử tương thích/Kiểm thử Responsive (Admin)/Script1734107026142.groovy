import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
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

Map<String, Object> deviceMetrics = new HashMap()

deviceMetrics.put('width', 275)

deviceMetrics.put('height', 812)

deviceMetrics.put('pixelRatio', 3.0)

Map<String, Object> mobileEmulation = new HashMap()

mobileEmulation.put('deviceMetrics', deviceMetrics)

mobileEmulation.put('userAgent', 'Mozilla/5.0 (iPhone; CPU iPhone OS 14_0 like Mac OS X) AppleWebKit/537.36 (KHTML, like Gecko) Version/14.0 Mobile Safari/537.36')

Map<String, Object> chromeOptions = new HashMap()

chromeOptions.put('mobileEmulation', mobileEmulation)

RunConfiguration.setWebDriverPreferencesProperty('goog:chromeOptions', chromeOptions)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://techzone.serv00.net/admin/login')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Login to TechZone admin page/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_Login to TechZone admin page/input_Password_password'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Object Repository/Admin/Page_Login to TechZone admin page/input_Password_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Admin/Page_Responsive_Admin/i_Profile_feather icon-menu icon-toggle-right'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Responsive_Admin/span_Brands'))

WebUI.closeBrowser()

