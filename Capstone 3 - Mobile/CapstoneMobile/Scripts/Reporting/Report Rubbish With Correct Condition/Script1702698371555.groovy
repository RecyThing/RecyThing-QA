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

Mobile.tap(findTestObject('MainMenu/Pelaporan Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Tumpukan Sampah Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Maps Button'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Search Map Report Rubbish'), 0)

Mobile.setText(findTestObject('Reporting/Report Rubbish/Search Map Report Rubbish Press'), 'bandung', 0)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Select Bandung As a map'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Selanjutnya Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Lokasi Patokan'), 0)

Mobile.setText(findTestObject('Reporting/Report Rubbish/Lokasi Patokan Press'), 'Jl. Mamang Somay', 0)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Sampah Kering'), 0)

Mobile.swipe(0, 400, 0, 0)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Ceritakan Kondisi Sampah'), 0)

Mobile.setText(findTestObject('Reporting/Report Rubbish/Ceritakan Kondisi Sampah Press'), 'ini sampah numpuk banget di bandung', 
    0)

Mobile.swipe(0, 400, 0, 0)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Bukti foto atau video'), 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Foto'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Rubbish/Kirim Button'), 0)

Mobile.verifyElementExist(findTestObject('Reporting/Report Rubbish/Validasi Report Success'), 0)

