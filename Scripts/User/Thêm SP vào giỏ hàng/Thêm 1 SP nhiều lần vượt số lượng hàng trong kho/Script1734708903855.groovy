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

WebUI.navigateToUrl('https://techzone.serv00.net/')

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/li_PC'))

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/li_PC'))

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/li_PC'))

'chọn sp\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_Workstation'))

'chi tiết sp, số lượng hàng trong kho =2\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_Mainboard Asus PRO WS W790E-SAGE SE_fa fa_8f1056'))

'thêm sp lần 1\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'truy cập lại sp, qua về chi tiết sp, số lượng hàng trong kho hiển thị =2\r\n\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_Server Asus TS100-E11-PI4-2314041Z (E-231_8dd4e6'))

'thêm vào giỏ lần 2, tự động điều hướng sang trang GIỎ HÀNG, sp xuất hiện trong giỏ vs số lượng =2\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'truy cập lại chi tiết sp, số lượng hàng trong kho =2\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_Server Asus TS100-E11-PI4-2314041Z (E-231_8dd4e6'))

'thêm sp vào giỏ, tự động sang GIỎ HÀNG, sp xuất hiện vs số lượng =3'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

