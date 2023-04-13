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

WebUI.click(findTestObject('Object Repository/customer management page/Page_Payment24/a_Customers'))

WebUI.click(findTestObject('Object Repository/customer management page/Page_Payment24/a_Customers_1'))

WebUI.click(findTestObject('Object Repository/customer management page/Page_Customer Management/i_IMPL70253_fa fa-edit'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Customer Account Number_ctl00cphBodyt_7cdb18'))

WebUI.verifyElementPresent(findTestObject('Object Repository/customer management page/Page_Customer Management/input_Account Name_ctl00cphBodytxtFleetName'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/select_PendingActiveClosedFraudSuspended'))

WebUI.verifyElementClickable(findTestObject('Object Repository/customer management page/Page_Customer Management/button_Save'))

WebUI.click(findTestObject('Object Repository/customer management page/Page_Customer Management/button_Save'))

WebUI.rightClick(findTestObject('Object Repository/customer management page/Page_Customer Management/i_Next_fa fa-spinner fa-spin'))

WebUI.rightClick(findTestObject('Object Repository/customer management page/Page_Customer Management/p_Fleet details updated successfully'))

WebUI.closeBrowser()

