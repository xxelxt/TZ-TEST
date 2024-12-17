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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://techzone.serv00.net/admin/login')

WebUI.setText(findTestObject('Admin/Page_Login to TechZone admin page/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Admin/Page_Login to TechZone admin page/input_Password_password'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Admin/Page_Login to TechZone admin page/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Add/span_Products'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Add/a_Add'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin/Page_Products_Add/select_Category'), 'Thiết bị nghe nhìn', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin/Page_Products_Add/select_Subcategory'), 'Tai nghe', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin/Page_Products_Add/select_Brand'), 'Apple', false)

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Add/input_Name_name'), 'AirPods Pro 2')

String singleImagePath = 'E:/rkive/7/Software Testing & QA/Katalon Studio/TechZone/Test File/Product_Image_1.jpeg'

String multipleImagePaths = 'E:/rkive/7/Software Testing & QA/Katalon Studio/TechZone/Test File/Product_Image_1.jpeg\nE:/rkive/7/Software Testing & QA/Katalon Studio/TechZone/Test File/Product_Image_2.jpeg'

WebUI.uploadFile(findTestObject('Object Repository/Admin/Page_Products_Add/input_Image'), singleImagePath)

WebUI.uploadFile(findTestObject('Object Repository/Admin/Page_Products_Add/input_ImageLibrary'), multipleImagePaths)

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Add/input_Quantity_quantity'), '100')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Add/input_Price_price'), '4000000')

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Add/input_Price_changeprice'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Add/input_New Price_price_new'), '3800000')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Add/p_Redo_ck-placeholder'), 'Đây là nội dung kiểm thử')

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Add/input_Featured Products_featured_product'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Add/input_Status_active'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Add/button_Add'))

WebUI.closeBrowser()

