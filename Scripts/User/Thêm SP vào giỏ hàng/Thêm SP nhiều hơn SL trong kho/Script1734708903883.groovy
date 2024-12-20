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

'loại sp\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_Workstation'))

'chi tiết sp, số lượng sp trong kho = 2\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_Mainboard Asus PRO WS W790E-SAGE SE_fa fa_8f1056'))

'bấm nút "+" để thêm số lượng sp, (số lượng =5)'
WebUI.doubleClick(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/span_'))

'không thêm đc sp vào giỏ, hiển thị thông báo chọn số lượng sp <=2'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

WebUI.closeBrowser()

