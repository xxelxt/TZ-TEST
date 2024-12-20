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

WebUI.navigateToUrl('https://techzone.serv00.net/')

WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/i_Dell Inspiron 14 5430 (71015633) (i7-1360_375f01'))

WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/button_ADD TO CART'))

'chọn để thanh toán'
WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/a_PROCEED TO CHECKOUT'))

WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/div_Your Orders                            _d1deb6'))

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/input__lastname'), 'trang ')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/input__firstname'), 'try')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/input__address'), 'abcd')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/input__district'), 'haminh')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/input__city'), 'badinh')

WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/input__phone'), '12345')

'sai định dạng email\r\n'
WebUI.setText(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/input__email'), '1234')

'ấn để hoàn tất, không thành công vì đã sai định dạng email\r\n'
WebUI.click(findTestObject('Object Repository/User/Trang/thanh toán/Page_TechZone/button_Place Order'))

WebUI.closeBrowser()

