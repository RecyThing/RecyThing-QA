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

Mobile.tap(findTestObject('Reporting/Report Company/Report Littering Company Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Company/Selanjutnya Button'), 0)

Mobile.tap(findTestObject('Reporting/Report Company/Maps Button'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Individu/Search On Map'), 0)

Mobile.setText(findTestObject('Reporting/Report Individu/Search On Map Press'), 'Medan', 0)

Mobile.tap(findTestObject('Reporting/Report Company/Select Medan as Location'), 0)

Mobile.tap(findTestObject('Reporting/Report Company/Selanjutnya Button On Maps'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Company/Lokasi Patokan'), 0)

Mobile.setText(findTestObject('Reporting/Report Company/Lokasi Patokan Press'), 'Lokasi nya di sungai PT. Cinta Ditolak Emang Nggak Enak', 
    0)

Mobile.swipe(0, 250, 0, 0)

Mobile.tap(findTestObject('Reporting/Report Individu/Tanggal Button'), 30)

Mobile.tap(findTestObject('Reporting/Report Company/Date Ok2'), 30)

Mobile.tap(findTestObject('Reporting/Report Company/TimeButton1'), 0)

Mobile.tap(findTestObject('Reporting/Report Company/Ok On Tiime'), 0)

Mobile.tap(findTestObject('Reporting/Report Company/Perusahaan1'), 0)

Mobile.setText(findTestObject('Reporting/Report Company/Perusahaan1 Press'), 'PT. Cinta Ditolak Emang Nggak Enak', 0)

Mobile.tap(findTestObject('Reporting/Report Company/Sampah Berbahaya tap'), 0)

Mobile.swipe(0, 300, 0, 0)

Mobile.tap(findTestObject('Reporting/Report Individu/DetailKejadian1'), 0)

Mobile.setText(findTestObject('Reporting/Report Individu/DetailKejadian Press'), 'Dia membuang Mantan Sembarangan', 0)

Mobile.swipe(0, 400, 0, 0)

Mobile.tap(findTestObject('Reporting/Report Company/BuktiFoto'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Individu/Foto1'), 0)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Reporting/Report Company/Kirim Button'), 0)

Mobile.verifyElementExist(findTestObject('Reporting/Report Company/Validasi Success'), 0)

