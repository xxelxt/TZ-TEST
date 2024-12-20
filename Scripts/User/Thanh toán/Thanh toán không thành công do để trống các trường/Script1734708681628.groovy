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

WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/i_Dell Inspiron 14 5430 (71015633) (i7-1360_375f01'))

WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'ấn để thanh toán, điều hướng sang trang THANH TOÁN'
WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/a_PROCEED TO CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/input__address'), '123')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/input__district'), 'han')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/input__city'), 'cong')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/input__phone'), '12234')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/input__email'), '123@hvnh')

'để trống trường Họ, Tên. Ấn đặt hàng -> Không thành công, màn hình hiển thị tbao "Vui lòng điền vào trường này" '
WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/Page_TechZone/button_Place Order'))

WebUI.closeBrowser()

