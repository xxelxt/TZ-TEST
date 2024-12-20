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

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/a_Lenovo'))

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/i_PC Asus ROG Strix G15CF (i5-12400F16GB RA_1472bf'))

'chọn số lượng cần thêm vào giỏ\r\n'
WebUI.doubleClick(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/span_'))

'thêm sp vào giỏ thành công\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/button_ADD TO CART (1)'))

'xóa sản phẩm'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/span__icon_close'))

'sản phẩm đã được xóa khỏi giỏ hàng, không có sản phẩm nào trong giỏ hàng\r\n'
WebUI.closeBrowser()

