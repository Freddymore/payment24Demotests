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

WebUI.navigateToUrl('https://admin-stage.payment24.co/Login.aspx')

WebUI.setText(findTestObject('Object Repository/customer management page/Page_Login/input_Username_txtUserName'), 'freddy.imperial.sho')

WebUI.setEncryptedText(findTestObject('Object Repository/customer management page/Page_Login/input_Password_txtPassword'), 
    '8QOgL8Q8VdKrCxMTiMq6qyqu2UTnMzZP')

WebUI.click(findTestObject('Object Repository/customer management page/Page_Login/i_Password_test'))

WebUI.click(findTestObject('Object Repository/customer management page/Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/customer management page/Page_Payment24/a_Customers'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/customer management page/Page_Payment24/a_Customers_1'), 0)

WebUI.click(findTestObject('Object Repository/customer management page/Page_Payment24/a_Customers_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Export_ctl00cphBodybtnAddIndividual'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Export_ctl00cphBodybtnAddIndividual'))

WebUI.click(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Export_ctl00cphBodybtnAddIndividual'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Customer Account Number_ctl00cphBodyt_7cdb18'))

WebUI.verifyElementPresent(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Account Name_ctl00cphBodytxtFleetName'), 
    0)

WebUI.setText(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Account Name_ctl00cphBodytxtFleetName'), 
    'Testing')

WebUI.setText(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Email_ctl00cphBodytxtCustomerEmail'), 
    'freddy1@gmail.com')

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/span_Not Applicable'))

WebUI.click(findTestObject('Object Repository/customer management page/Page_Customer Management/b'))

WebUI.rightClick(findTestObject('Object Repository/customer management page/Page_Customer Management/li_SAR Customer Group 1'))

WebUI.click(findTestObject('Object Repository/customer management page/Page_Customer Management/span_SAR Customer Group 1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Cash Customer_ctl00cphBodychkCashCustomer'))

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Capture Vehicle_ctl00cphBodychkAddVehicle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Capture Driver_ctl00cphBodychkAddDriver'))

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Generators  Other_ctl00cphBodychkAddG_fa3c03'))

WebUI.verifyElementPresent(findTestObject('Object Repository/customer management page/Page_Customer Management/textarea_Customer Address_ctl00cphBodytxtCu_317f95'), 
    0)

WebUI.click(findTestObject('Object Repository/customer management page/Page_Customer Management/button_Next'))

WebUI.closeBrowser()

