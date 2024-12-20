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

'truy cập trang web\r\n'
WebUI.navigateToUrl('https://techzone.serv00.net/')

'chọn sp'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_Workstation'))

'chi tiết sp, số lượng hàng trong kho của sp =1\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_Z - A_fa fa-retweet'))

'thêm sp vs số lượng = số sp trong kho, thêm không thành công, màn hình hiển thị tbao "Please order less than 1"'
WebUI.click(findTestObject('Object Repository/User/Trang/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

WebUI.closeBrowser()

