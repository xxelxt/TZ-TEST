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

WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_Sony PlayStation 5 (PS5) Slim Standard_fa_ef0a93'))

WebUI.doubleClick(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/span_'))

'Thêm sp vào giỏ hàng thành công '
WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'Nhập mã giảm thứ nhất '
WebUI.setText(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input_Coupon Codes_code'), 
    'PLAYMORE')

'thành công -> hiển thị thông báo "Đã áp dụng mã giảm giá", Số tiền giảm giá của PLAYMORE, Tổng tiền = Giá sp - Giảm giá PLAYMORE'
WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_Apply'))

'Nhập mã giảm giá thứ 2\r\n'
WebUI.setText(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input_Coupon Codes_code'), 
    'NEWZONE30')

'thành công -> hiển thị tbao"đã áp dụng mã giảm giá thành công", Số tiền giảm giá= GIảm giá PLAYMORE +Giảm giá NEWZONE30, Tổng tiền= Giá sp- Số tiền giảm giá\r\n '
WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_Apply'))

WebUI.closeBrowser()

