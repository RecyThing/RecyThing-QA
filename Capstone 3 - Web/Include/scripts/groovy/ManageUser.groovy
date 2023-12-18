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



class ManageUser {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User navigated to Login Page MU1")
	def openLoginPageMU1(){
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://develop--recything-web.netlify.app/login')
	}

	@When("User fill (.*) and (.*) on MU1 field")
	def inputCredentialLoginMU1(String emailMU1, String passwordMU1){
		WebUI.setText(findTestObject('Login/Page_RecyThing Web/input_Email_email'), 'superadmin@gmail.com')

		WebUI.setEncryptedText(findTestObject('Login/Page_RecyThing Web/input_Email_password'), 'aeHFOx8jV/A=')
	}

	@And("User click Login Button and get directed to Dashboard MU1")
	def clickLoginButtonMU1(){
		WebUI.click(findTestObject('Login/Page_RecyThing Web/button_Login'))
	}

	@And("User click Manage User menu and Detail User")
	def clickDetailUserMU1(){
		WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/div_Manajemen Pengguna'))

		WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/div_Detail Pengguna'))
	}

	@And("User click eye icon to view detail of user")
	def viewDetailUserMU1() {
		WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/button_Aksi_chakra-button css-11amxnw'))
	}

	@Then("Verify the Detail User is displayed")
	def verifyDetailUserMU1() {
		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/p_Detail Informasi'), 0)

		WebUI.closeBrowser()
	}

	@Then("User click button Kembali to close the Detail User")
	def closeDetailUserMU1() {
		WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/button_Kembali'))

		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/h1_Kelola Data Pengguna'),
				0)

		WebUI.closeBrowser()
	}

	@And("Users input appropriate keywords on Search Field MU1")
	def inputValidKeywordsMU1() {
		WebUI.setText(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/input_Kelola Data Pengguna_chakra-input css-lohvid'),
				'Taksa')
	}

	@Then("Verify that the data displayed matches the keywords searched")
	def verifyMatchKeywordsMU1() {
		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/p_Made In Taksa'), 0)

		WebUI.closeBrowser()
	}

	@And("Users entered invalid keywords on Search Field MU1")
	def inputInvalidKeywordsMU1() {
		WebUI.setText(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/input_Kelola Data Pengguna_chakra-input css-lohvid'),
				'#')
	}

	@Then("Verify that no data with the invalid keyword can be found")
	def verifyKeywordsNotFoundMU1() {
		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/td_Data tidak ditemukan'),
				0)

		WebUI.closeBrowser()
	}

	@And("Users click the arrow icon to navigate or change pages MU1")
	def navigateUserPagesMU1() {
		WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/button_Aksi_next-button css-1rjox9p'))
	}

	@Then("Verify that the data displayed changes according to the page")
	def verifyNavigatePagesMU1() {
		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/h1_Kelola Data Pengguna'),
				0)

		WebUI.closeBrowser()
	}


	@And("User click Manage User menu and Daftar Admin")
	def clickDaftarAdminMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/div_Manajemen Pengguna'))

		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/div_Daftar Admin'))
	}

	@And("User click button Tambah Admin")
	def clickTambahAdminMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_Tambah Admin'))
	}

	@Then("User click button Kembali to cancel adding a new admin")
	def clickButtonKembaliMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_Batal'))

		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/h1_Daftar Admin'), 0)

		WebUI.closeBrowser()
	}

	@And("User click icon edit to displayed pop up edit data Admin")
	def clickIconEditMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_edit_chakra-button css-jt5il8'))
	}

	@Then("User click button Batal to cancel editing an Admin data")
	def clickBatalEditMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_Batal_Edit'))

		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/h1_Daftar Admin'), 0)

		WebUI.closeBrowser()
	}

	@And("User click icon delete to displayed pop up delete Admin")
	def clickIconDeleteMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_delete_chakra-button css-qfrwun'))
	}

	@Then("User click button Batal to cancel deleting an Admin data")
	def clickBatalDeleteMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_Batal_Hapus'))

		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/h1_Daftar Admin'), 0)

		WebUI.closeBrowser()
	}

	@And("Users input appropriate keywords on Search Field MU2")
	def searchValidKeywordsMU2() {
		WebUI.setText(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/input_Daftar Admin_chakra-input css-lohvid'),
				'Renjun')
	}

	@Then("Verify that the data displayed matches the keywords searched MU2")
	def verifyMatchesDataMU2() {
		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/p_Huang Renjun'), 0)

		WebUI.closeBrowser()
	}

	@And("Users entered invalid keywords on Search Field MU2")
	def searchInvalidKeywordsMU2() {
		WebUI.setText(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/input_Daftar Admin_chakra-input css-lohvid'),
				'#')
	}

	@Then("Verify that no data with the invalid keyword can be found MU2")
	def verifyNotFoundDataMU2() {
		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/td_Data tidak ditemukan'),
				0)

		WebUI.closeBrowser()
	}

	@And("Users click the arrow icon to navigate or change pages MU2")
	def navigatedAdminPagesMU2() {
		WebUI.click(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/button_NEXT_chakra-button css-1rjox9p'))
	}

	@Then("Verify that the data displayed changes according to the page MU2")
	def verifyAdminPageNavigatedMU2() {
		WebUI.verifyElementPresent(findTestObject('Manajemen Pengguna/Daftar Admin/Page_RecyThing Web/h1_Daftar Admin'), 0)

		WebUI.closeBrowser()
	}


	@And("User click Manage User menu and Lencana")
	def clickLencanaMU3() {
		WebUI.click(findTestObject('Manajemen Pengguna/Detail Pengguna/Page_RecyThing Web/div_Manajemen Pengguna'))

		WebUI.click(findTestObject('Manajemen Pengguna/Lencana/Page_RecyThing Web/div_Lencana'))
	}

	@And("User click icon edit to displayed pop up edit data Achievement")
	def clickIconEditMU3() {
		WebUI.click(findTestObject('Manajemen Pengguna/Lencana/Page_RecyThing Web/button_platinum_chakra-button css-1lqdqlg'))
	}

	@Then("User click button Simpan to editing an Achievement data")
	def clickSimpanEditMU3() {
		WebUI.setText(findTestObject('Manajemen Pengguna/Lencana/Page_RecyThing Web/input_Nama Lencana_target_point'), '250000')

		WebUI.click(findTestObject('Manajemen Pengguna/Lencana/Page_RecyThing Web/button_Simpan'))

		WebUI.closeBrowser()
	}

	@Then("User click button Kembali to cancel editing an Achievement data")
	def clickBatalEditMU3() {
		WebUI.setText(findTestObject('Manajemen Pengguna/Lencana/Page_RecyThing Web/input_Nama Lencana_target_point'), '250000')

		WebUI.click(findTestObject('Manajemen Pengguna/Lencana/Page_RecyThing Web/button_Batal'))

		WebUI.closeBrowser()
	}
}