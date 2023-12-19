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

Mobile.tap(findTestObject('Reporting/Report Individu/Pelanggaran Sampah Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Reporting Individu Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Selanjutnya Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Maps Button'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Individu/Search On Map'), 0)

Mobile.setText(findTestObject('Reporting/Report Individu/Search On Map Press'), 'tangerang selatan', 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Select Tangerang Selatan'), 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Maps Selanjutnya'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Individu/Lokasi Patokan'), 0)

Mobile.setText(findTestObject('Reporting/Report Individu/Lokasi Patokan Press'), 'samping rumah ryandi', 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Tanggal Button1'), 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Ok Button On Date'), 0)

Mobile.swipe(0, 400, 0, 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Time Button1'), 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Ok On Time'), 0)

Mobile.tap(findTestObject('Reporting/Report Individu/DetailKejadian1'), 0)

Mobile.setText(findTestObject('Reporting/Report Individu/DetailKejadian Press'), 'ryandi suka buang sampah sembarangan', 
    0)

Mobile.swipe(0, 400, 0, 0)

Mobile.tap(findTestObject('Reporting/Report Individu/FotoOrVideo'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Individu/Foto1'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Individu/Kirim Button'), 0)

Mobile.verifyElementExist(findTestObject('Reporting/Report Individu/Validasi Success'), 0)

