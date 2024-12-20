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

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/a_Laptop'))

'chọn sp'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/i_Dell Inspiron 14 5430 (71015633) (i7-1360_375f01'))

'ấn nút + để thêm số lượng'
WebUI.doubleClick(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.doubleClick(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.doubleClick(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_'))

'thêm sp vào giỏ thành công, tổng tiền= Gía sp* số lượng'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'ấn nút "-" để giảm số lượng sp, số lượng hiển thị đã giảm 1, Tổng tiền k cập nhật thay đổi sau khi số lượng sp giảm đi 1\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/span_-'))

WebUI.closeBrowser()

