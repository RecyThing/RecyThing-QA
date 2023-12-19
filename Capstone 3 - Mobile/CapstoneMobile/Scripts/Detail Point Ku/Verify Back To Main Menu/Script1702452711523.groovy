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

WebUI.callTestCase(findTestCase('Login Page/Login With Correct Data'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MainMenu/Tukar Poin Button'), 0)

Mobile.tap(findTestObject('Detail Pointku/Tukar Point Button'), 0)

Mobile.tap(findTestObject('Detail Pointku/Detail voucher 2'), 0)

Mobile.tap(findTestObject('Detail Pointku/Nomor Telepon Button'), 0)

Mobile.setText(findTestObject('Detail Pointku/Nomor Telepon Press Button'), '085775648550', 0)

Mobile.tap(findTestObject('Detail Pointku/Konfirmasi Button'), 0)

Mobile.tap(findTestObject('Detail Pointku/Tukar Voucher Ok'), 0)

Mobile.tap(findTestObject('Detail Pointku/KembaliButton'), 30)

Mobile.verifyElementExist(findTestObject('Detail Pointku/ValidasiSuccess'), 0)

