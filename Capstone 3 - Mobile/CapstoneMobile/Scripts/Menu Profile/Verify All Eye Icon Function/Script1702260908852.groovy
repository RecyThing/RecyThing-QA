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

Mobile.startApplication('D:\\download 1\\app-release (12).apk', false)

Mobile.tap(findTestObject('Login Page/Profile Button'), 0)

Mobile.tap(findTestObject('Menu Profile/Ubah Password/KataSandiSekarang'), 0)

Mobile.setText(findTestObject('Menu Profile/Ubah Password/KataSandiSekarangPress'), '12345678', 0)

Mobile.tap(findTestObject('Menu Profile/Ubah Password/Eye 1'), 0)

Mobile.tap(findTestObject('Menu Profile/Ubah Password/KataSandiBaru'), 0)

Mobile.setText(findTestObject('Menu Profile/Ubah Password/KataSandiBaru'), '123456789', 0)

Mobile.tap(findTestObject('Menu Profile/Ubah Password/Eye 2'), 0)

Mobile.tap(findTestObject('Menu Profile/Ubah Password/ConfirmKatasandi'), 0)

Mobile.setText(findTestObject('Menu Profile/Ubah Password/ConfirmKatasandi'), '123456789', 0)

Mobile.tap(findTestObject('Menu Profile/Ubah Password/Eye 3'), 0)

Mobile.verifyElementText(findTestObject('Menu Profile/Ubah Password/Kata sandi sekarang Press'), '12345678')

Mobile.verifyElementText(findTestObject('Menu Profile/Ubah Password/Kata sandi Baru'), '123456789')

Mobile.verifyElementText(findTestObject('Menu Profile/Ubah Password/Confirm Password'), '123456789')

