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



class ManajemenMisi {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User navigated to Login Page MM1")
	def openLoginPageMM1(){
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://develop--recything-web.netlify.app/login')
	}

	@When("User fills (.*) and (.*) on MM1 field")
	def inputCredentialLoginMM1(String emailMM1, String passwordMM1){
		WebUI.setText(findTestObject('Login/Page_RecyThing Web/input_Email_email'), 'superadmin@gmail.com')

		WebUI.setEncryptedText(findTestObject('Login/Page_RecyThing Web/input_Email_password'), 'aeHFOx8jV/A=')
	}

	@And("User clicks Login Button and gets directed to Dashboard MM1")
	def clickLoginButtonMM1(){
		WebUI.click(findTestObject('Login/Page_RecyThing Web/button_Login'))

		WebUI.verifyElementVisible(findTestObject('Login/Page_RecyThing Web/verify_Dashboard'))
	}

	@And("User clicks Manajemen Misi and Daftar Misi")
	def clickDaftarMisi(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/div_Manajemen Misi'))

		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/div_Daftar Misi'))
	}

	@And("User clicks a mission to view Mission Details MM1")
	def clickDetailMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/View-Daftar Misi-All'))
	}

	@Then("Verify the Mission Detail is displayed MM1")
	def verifyDetailMissionM1(){
		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/h2_Detail Misi - verify-detail-All'), 0)

		WebUI.closeBrowser()
	}

	@Then("User clicks button Kembali to close the Detail Mission MM1")
	def clickKembaliDetailMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Kembali-Daftar Misi-All'))

		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/Search-Daftar Misi'), 0)

		WebUI.closeBrowser()
	}

	@And("User clicks button Tambah Misi MM1")
	def clickTambahMisi(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Tambah Data-DaftarMisi'))
	}

	@Then("User clicks button Batal to cancel creating a new mission")
	def clickBatalTambahMisi(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Batal_Tambah Data-DaftarMisi'))

		WebUI.closeBrowser()
	}

	@And("User clicks icon Edit to update a mission detail")
	def clickEditMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/Edit-Daftar Misi-All'))
	}

	@Then("User clicks button Batal to close the Update Detail Mission Page MM1")
	def clickBatalEditMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Batal-Edit-DaftarMisi-All'))

		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/Search-Daftar Misi'), 0)

		WebUI.closeBrowser()
	}

	@And("User clicks icon Delete to delete a mission")
	def clickDeleteMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/Hapus-DaftarMisi-All'))
	}

	@Then("User clicks button Batal to close the Delete Pop-Up Mission MM1")
	def clickBatalDeleteMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Batal-Hapus-DaftarMisi-All'))

		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/Search-Daftar Misi'), 0)

		WebUI.closeBrowser()
	}

	@And("Users input appropriate keywords on Search Field MM1")
	def searchValidKeywordsMM1(){
		WebUI.setText(findTestObject('Manajemen Misi/Page_RecyThing Web/Search-Daftar Misi'), 'Bersih')
	}

	@Then("Verify that the data displayed matches the keywords searched MM1")
	def verifyMatchKeywordsMM1(){
		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/p_Mari Bersih Bersih'), 0)

		WebUI.closeBrowser()
	}

	@And("Users entered invalid keywords on Search Field MM1")
	def searchInvalidKeywordsMM1(){
		WebUI.setText(findTestObject('Manajemen Misi/Page_RecyThing Web/Search-Daftar Misi'), '&')
	}

	@Then("Verify that no data with the invalid keyword can be found MM1")
	def verifyNotFoundKeywordsMM1(){
		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/Daftar Misi_Data tidak ditemukan'), 0)

		WebUI.closeBrowser()
	}

	@And("Users click the arrow icon to navigate or change pages MM1")
	def navigatePagesMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/Next Page-Daftar Admin'))
	}

	@Then("Verify that the data displayed changes according to the page MM1")
	def verifyPagesChangeMM1(){
		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/Search-Daftar Misi'), 0)

		WebUI.closeBrowser()
	}

	@And("User clicks a mission to view Mission Details on Aktif Tab MM1")
	def clickViewDetailAktifMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Aktif5'))

		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/View Detail-Misi Aktif'))
	}

	@Then("Verify the Mission Detail is displayed on Aktif Tab MM1")
	def verifyDetailAktifMissionMM1(){
		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Kembali-Detail-Misi Aktif'), 0)

		WebUI.closeBrowser()
	}

	@Then("User clicks button Kembali to close the Detail Mission on Aktif Tab MM1")
	def verifyCloseDetailAktifMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Kembali-Detail-Misi Aktif'), FailureHandling.STOP_ON_FAILURE)

		WebUI.closeBrowser()
	}

	@And("User clicks icon Edit to update a mission detail on Aktif Tab")
	def clickUpdateOnAktifMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Batal-Edit-Daftar Misi-Aktif'))
	}

	@Then("User clicks button Batal to close the Update Detail Mission Page on Aktif Tab MM1")
	def clickBatalUpdateOnAktifMM1(){
		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/Search-Daftar Misi'), 0)

		WebUI.closeBrowser()
	}

	@And("User clicks a mission to view Mission Details on Tenggat Tab MM1")
	def verifyDetailTenggatMissionMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Melewati Tenggat6'))

		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/View Detail-Misi Melewati Tenggat'))
	}

	@Then("Verify the Mission Detail is displayed on Tenggat Tab MM1")
	def verifyCloseDetailTenggatMissionMM1(){
		WebUI.verifyElementPresent(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Kembali-Detail-Misi Melewati Tenggat'),
				0)

		WebUI.closeBrowser()
	}

	@Then("User clicks button Kembali to close the Detail Mission on Tenggat Tab MM1")
	def clickBatalUpdateOnTenggatMM1(){
		WebUI.click(findTestObject('Manajemen Misi/Page_RecyThing Web/button_Kembali-Detail-Misi Melewati Tenggat'), FailureHandling.STOP_ON_FAILURE)

		WebUI.closeBrowser()
	}
}