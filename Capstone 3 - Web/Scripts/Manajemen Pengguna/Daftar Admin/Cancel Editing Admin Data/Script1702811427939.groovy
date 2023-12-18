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

WebUI.navigateToUrl('https://develop--recything-web.netlify.app/login')

WebUI.setText(findTestObject('Login/Page_RecyThing Web/input_Email_email'), 'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Login/Page_RecyThing Web/input_Email_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Login/Page_RecyThing Web/button_Login'))

WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/div_Manajemen Pengguna'))

WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/div_Daftar Admin'))

WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_edit_chakra-button css-jt5il8'))

WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_Batal_Edit'))

WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/h1_Daftar Admin'), 0)

WebUI.closeBrowser()

