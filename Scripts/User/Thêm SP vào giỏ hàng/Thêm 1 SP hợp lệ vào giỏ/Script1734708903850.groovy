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

'truy cập trang web'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://techzone.serv00.net/')

'chọn tất cả sản phẩm'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/div_All Products'))

'chi tiết sản phẩm '
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/i_Z - A_fa fa-retweet'))

'ấn nút thêm vào giỏ hàng, số lượng mặc định là 1\r\nthêm thành công sp, tự điều hướng sang trang GIỎ HÀNG\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/button_ADD TO CART'))

WebUI.closeBrowser()

