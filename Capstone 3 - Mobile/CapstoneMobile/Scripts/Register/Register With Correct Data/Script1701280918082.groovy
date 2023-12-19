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

Mobile.startApplication('D:\\download 1\\app-release (8).apk', false)

Mobile.tap(findTestObject('Login Page/Register Button'), 30)

Mobile.tap(findTestObject('Register Page/Nama Lengkap Field'), 30)

Mobile.setText(findTestObject('Register Page/NamaLengkap'), 'Jiddan', 30)

Mobile.tap(findTestObject('Register Page/EmailField'), 30)

Mobile.setText(findTestObject('Register Page/EmailField'), 'jiddan@example.com', 30)

Mobile.tap(findTestObject('Register Page/Pass'), 30)

Mobile.setText(findTestObject('Register Page/Pass'), 'jiddan', 30)

Mobile.tap(findTestObject('Register Page/Confirms'), 30)

Mobile.setText(findTestObject('Register Page/Confirms'), 'jiddan', 30)

Mobile.swipe(200, 200, 400, 0)

Mobile.tap(findTestObject('Register Page/Register Button'), 30)

Mobile.verifyElementExist(findTestObject('Register Page/Valid Register'), 30)

