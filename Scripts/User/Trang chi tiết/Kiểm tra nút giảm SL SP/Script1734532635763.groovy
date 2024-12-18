import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://techzone.serv00.net/?fbclid=IwZXh0bgNhZW0CMTAAAR11GWhqNmR9-iqNYBLA89fdWtND6Rc7xenmZae5a2APCwSfThom2W5HLnA_aem_8QUgh-z72sinKz76T7xqLw')

WebUI.click(findTestObject('Object Repository/Page_TechZone/li_Laptop'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/a_Apple (MacBook)'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/a_Apple MacBook Pro 14 inch (M2 Pro 16GB SS_afb997'))

WebUI.setText(findTestObject('Object Repository/Page_TechZone/input_-_qty'), '5')

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_-'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_-'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_-'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_-'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_-'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_-'))

WebUI.click(findTestObject('Object Repository/Page_TechZone/span_-'))

WebUI.closeBrowser()

