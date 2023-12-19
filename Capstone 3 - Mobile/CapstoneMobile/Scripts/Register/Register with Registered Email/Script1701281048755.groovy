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

Mobile.startApplication('D:\\download 1\\app-release (2).apk', false)

Mobile.tap(findTestObject('OnBoarding Object/Lewati Button'), 0)

Mobile.tap(findTestObject('Login Page/Register Button'), 0)

Mobile.tap(findTestObject('Register Page/Nama Lengkap Field'), 0)

Mobile.setText(findTestObject('Register Page/Nama Lengkap Field'), 'mamang', 0)

Mobile.tap(findTestObject('Register Page/Email Field'), 0)

Mobile.setText(findTestObject('Register Page/Email Field'), 'mamang@example.com', 0)

Mobile.tap(findTestObject('Register Page/Password Field'), 0)

Mobile.setText(findTestObject('Register Page/Password Field'), '12345678', 0)

Mobile.tap(findTestObject('Register Page/Confirm Password Field'), 0)

Mobile.setText(findTestObject('Register Page/Confirm Password Field'), '12345678', 0)

Mobile.tap(findTestObject('Register Page/Register Button'), 0)

Mobile.verifyElementExist(findTestObject('Register Page/Validasi Akun tidak Valid'), 0)

