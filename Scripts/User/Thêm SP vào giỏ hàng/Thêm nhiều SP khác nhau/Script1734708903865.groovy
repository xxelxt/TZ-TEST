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

'truy cập trang web'
WebUI.navigateToUrl('https://techzone.serv00.net/')

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_Apple (MacBook)'))

'chi tiết sp'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_Apple MacBook Pro 14 inch (M2 Pro 16GB SS_5b94c0'))

'dùng nút "+" thêm số lượng >1, <số lượng trong kho'
WebUI.doubleClick(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/span_'))

'thêm vào giỏ thành công, sp A xuất hiện trong giỏ vs số lượng đã chọn và tổng tiền = Giá sp* Số lượng '
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'chọn thêm sp khác\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/div_All Products'))

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_Apple MacBook Pro 14 inch (M2 Pro 16GB SS_5b94c0'))

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_Apple MacBook Pro 14 inch (M2 Pro 16GB SS_5b94c0'))

'chọn số lượng sp>1, <số lượng trong kho\r\n'
WebUI.doubleClick(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/span_'))

WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/span_'))

'thêm vào giỏ thành công, sp B xuất hiện trong Giỏ hàng vs số lượng đã chọn và tổng tiền = Giá sp* số lượng\r\nTổng đơn hàng: Thành tiền= Tổng tiền sp A + Tổng tiền sp B'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

WebUI.closeBrowser()

