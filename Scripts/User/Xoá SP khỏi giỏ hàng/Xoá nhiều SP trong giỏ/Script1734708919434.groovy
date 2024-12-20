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

WebUI.navigateToUrl('https://techzone.serv00.net/all_products')

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/i_Z - A_fa fa-retweet'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/div_All Products'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/i_Z - A_fa fa-retweet'))

'thêm thành công sp A\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/div_All Products'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/i_Z - A_fa fa-retweet'))

'thêm thành công sp B'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/a'))

'thêm thành công sp C'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/button_ADD TO CART'))

'xóa sp A, hiển thị tbao xóa sp thành công'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/span__icon_close'))

'xóa sp B, hiển thị thông báo xóa thành công '
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/span__icon_close'))

'Tổng đơn hàng: Thành tiền tự động cập nhật sau khi xóa sp A và sp B'
WebUI.closeBrowser()

