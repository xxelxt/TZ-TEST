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

'Truy cập trang web\r\n'
WebUI.navigateToUrl('https://techzone.serv00.net/')

WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/i_Lenovo IdeaPad Slim 5 16AIH8 (83BG004EVN)_642a20'))

'thêm sp vào giỏ'
WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/div_All Products'))

WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/i_Sony PlayStation 5 (PS5) Slim Standard_fa_ef0a93'))

'thêm sp B vào giỏ'
WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'nhập mã giảm hợp lệ'
WebUI.setText(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/input_Coupon Codes_code'), 
    'PLAYMORE')

'ấn ÁP DỤNG -> thành công, hiển thị tbao"Đã áp dụng mã giảm giá", Tổng tiền cập nhật= giá sp A+ giá sp \r\nB - giảm giá\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/mã giảm giá/Page_TechZone/Page_TechZone/Page_TechZone/button_Apply'))

WebUI.closeBrowser()

