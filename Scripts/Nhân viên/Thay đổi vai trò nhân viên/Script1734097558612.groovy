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

WebUI.setText(findTestObject('Page_Login to TechZone admin page/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Login to TechZone admin page/input_Password_password'), 'RAIVpflpDOg=')

WebUI.sendKeys(findTestObject('Page_Login to TechZone admin page/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/span_Staffs'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/a_Permissions'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_Staffs_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_delete category_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_delete brands_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_delete products_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_add discounts_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_edit orders_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_edit banners_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_list category_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_list brands_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_list products_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_list users_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_edit discounts_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_delete orders_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_add category_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_add brands_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_add products_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_delete users_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_delete discounts_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_list banners_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_add banners_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_list orders_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_list discounts_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_edit products_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_edit brands_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/input_edit category_permission'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/button_Select All'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/button_Unselect All'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/button_Select All'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Staff_Permissions/a_Permissions'))

