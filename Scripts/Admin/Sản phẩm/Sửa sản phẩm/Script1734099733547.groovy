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

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Edit/span_Products'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Edit/a_Edit'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin/Page_Products_Edit/select_Category'), 'Console', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin/Page_Products_Edit/select_Subcategory'), 'Tay cầm', false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Admin/Page_Products_Edit/select_Brand'), 'Microsoft', false)

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Edit/input_Name_name'), 'Xbox Series X')

String singleImagePath = 'E:/rkive/7/Software Testing & QA/Katalon Studio/TechZone/Test File/Product_Image_3.jpg'
String multipleImagePaths = 'E:/rkive/7/Software Testing & QA/Katalon Studio/TechZone/Test File/Product_Image_3.jpg\nE:/rkive/7/Software Testing & QA/Katalon Studio/TechZone/Test File/Product_Image_4.jpg'

WebUI.uploadFile(findTestObject('Object Repository/Admin/Page_Products_Edit/input_Image'), singleImagePath)

WebUI.uploadFile(findTestObject('Object Repository/Admin/Page_Products_Edit/input_ImageLibrary'), multipleImagePaths)

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Edit/a_X'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Edit/a_X_1'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Edit/input_Quantity_quantity'), '50')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Edit/input_Price_price'), '3000000')

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Add/input_Price_changeprice'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Edit/input_New Price_price_new'), '2500000')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Products_Edit/p_Redo_ck-placeholder'), 'Đây là nội dung kiểm thử khác')

WebUI.click(findTestObject('Object Repository/Admin/Page_Products_Edit/button_Update'))

WebUI.closeBrowser()

