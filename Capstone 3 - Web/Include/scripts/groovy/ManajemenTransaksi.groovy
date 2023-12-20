import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ManajemenTransaksi {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	@Given("User navigated to Login Page MT1")
	def openLoginPageMT1(){
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://develop--recything-web.netlify.app/login')
	}

	@When("User fills (.*) and (.*) on MT1 field")
	def inputCredentialLoginMT1(String emailMM1, String passwordMM1){
		WebUI.setText(findTestObject('Login/Page_RecyThing Web/input_Email_email'), 'superadmin@gmail.com')

		WebUI.setEncryptedText(findTestObject('Login/Page_RecyThing Web/input_Email_password'), 'aeHFOx8jV/A=')
	}

	@And("User clicks Login Button and gets directed to Dashboard MT1")
	def clickLoginButtonMT1(){
		WebUI.click(findTestObject('Login/Page_RecyThing Web/button_Login'))
		
		WebUI.verifyElementVisible(findTestObject('Login/Page_RecyThing Web/verify_Dashboard'))
	}

	@And("User clicks Manajemen Transaksi and Daftar Voucher")
	def clickDaftarVoucher(){
		WebUI.click(findTestObject('Manajemen Transaksi/Daftar Voucher/Page_RecyThing Web/div_Manajemen Transaksi'))
		
		WebUI.click(findTestObject('Manajemen Transaksi/Daftar Voucher/Page_RecyThing Web/div_Daftar Voucher'))
	}
	
	@And("User clicks icon Edit to update a voucher detail")
	def clickIconEditMT1() {
		WebUI.click(findTestObject('Manajemen Transaksi/Daftar Voucher/Page_RecyThing Web/edit-icon-voucher'))
		
		WebUI.verifyElementPresent(findTestObject('Manajemen Transaksi/Daftar Voucher/Page_RecyThing Web/ver-h2_Edit Data Voucher'),
			0)
	}
	
	@Then("User clicks button Batal to close the Update Detail Voucher Page MT1")
	def clickBatalEditMT1() {
		WebUI.click(findTestObject('Manajemen Transaksi/Daftar Voucher/Page_RecyThing Web/button_Batal-edit-voucher'))
		
		WebUI.verifyElementPresent(findTestObject('Manajemen Transaksi/Daftar Voucher/Page_RecyThing Web/h1_Daftar Voucher'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users input appropriate keywords on Search Field MT1")
	def searchValidKeywordsMT1() {
		
	}
	
	@Then("Verify that the data displayed matches the keywords searched MT1")
	def verifyMatchKeywordsMT1() {
		
	}
	
}