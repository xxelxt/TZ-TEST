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

WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_Vn phng - Lm vic'))

'chi tiết sp'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/i_PC Lenovo ThinkCentre AIO Neo 30a 24 Gen _01af56'))

'chọn số lượng sp'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/span_'))

'thêm vào giỏ thành công, sp xuất hiện với số lượng đã chọn và tổng tiền tự động cập nhật '
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_ADD TO CART'))

'chọn để thanh toán, điều hướng sang trang THANH TOÁN'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/a_PROCEED TO CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input__lastname'), 
    'Trang ')

WebUI.setText(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input__firstname'), 
    'phạm')

WebUI.setText(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input__address'), 
    '12 chùa bộc ')

WebUI.setText(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input__district'), 
    'đông sđa')

WebUI.setText(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input__city'), 
    'hà nội')

WebUI.setText(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input__phone'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/input__email'), 
    '123@hvnh')

'mặc định hình thức thanh toán là TT khi nhận hàng (COD) nếu không chọn hình thức khác'
WebUI.click(findTestObject('Object Repository/User/Trang/test/Page_TechZone/Page_TechZone/Page_TechZone/Page_TechZone/button_Place Order'))

'điều hướng sang trang thông tin đơn hàng, hiển thị đầy đủ thông tin đã nhập, chi tiết đơn hàng'
WebUI.closeBrowser()

