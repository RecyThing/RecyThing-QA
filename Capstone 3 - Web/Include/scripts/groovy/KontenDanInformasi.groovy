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



class KontenDanInformasi {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User navigated to Login Page K1")
	def openLoginPageK1(){
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://develop--recything-web.netlify.app/login')
	}

	@When("User fill (.*) and (.*) on K1 field")
	def inputCredentialLoginK1(String emailK1, String passwordK1){
		WebUI.setText(findTestObject('Login/Page_RecyThing Web/input_Email_email'), 'superadmin@gmail.com')

		WebUI.setEncryptedText(findTestObject('Login/Page_RecyThing Web/input_Email_password'), 'aeHFOx8jV/A=')
	}

	@And("User click Login Button and get directed to Dashboard K1")
	def clickLoginButtonK1(){
		WebUI.click(findTestObject('Login/Page_RecyThing Web/button_Login'))
		
		WebUI.verifyElementVisible(findTestObject('Login/Page_RecyThing Web/verify_Dashboard'))
	}
	
	@And("User click Konten dan Informasi and Konten Artikel")
	def clickKontenArtikelK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/div_Konten dan Informasi'))
		
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/div_Konten Artikel'))
	}
	
	@And("User click an article view Article Details K1")
	def clickAnArticleK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/p_Membuka Peluang untuk Lingkungan yang Lebih Bersahabat'))
	}
	
	@Then("Verify the Article Detail is displayed K1")
	def verifyDetailDisplayedK1(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/div_10 - on detail article'), 0)
		
		WebUI.closeBrowser()
		
	}
	
	@Then("User click button Kembali to close the Detail Article K1")
	def clickKembaliK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Kembali-Membuka'))
		
		WebUI.closeBrowser()
	}
	
	@And("User click button Ubah to update an article detail")
	def clickUbahArticleK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Ubah-an-article'))
	}
	
	@Then("User click button Batal to close the Update Detail Article Page K1")
	def clickBatalUbahK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Batal-update-an-article'))
		
		WebUI.closeBrowser()
	}
	
	@And("User click button Hapus")
	def clickButtonHapusK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Hapus-an-article'))
	}
	
	@Then("User click button Batal to close the Delete Pop Up Article K1")
	def clickBatalHapusK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Batal-hapus-an-article'))
		
		WebUI.closeBrowser()
	}
	
	@And("Users input appropriate keywords on Search Field K1")
	def searchValidKeywordsK1(){
		WebUI.setText(findTestObject('Konten dan Informasi/Page_RecyThing Web/input_CARI ARTIKEL_chakra-input css-lohvid'), 'Tantangan')
	}
	
	@Then("Verify that the data displayed matches the keywords searched K1")
	def verifyMatchKeywordsK1(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/p_Tantangan Besar, Peluang Besar untuk Perubahan'),
			0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users entered invalid keywords on Search Field K1")
	def searchInvalidKeywordsK1(){
		WebUI.setText(findTestObject('Konten dan Informasi/Page_RecyThing Web/input_CARI ARTIKEL_chakra-input css-lohvid'), '*')
	}
	
	@Then("Verify that no data with the invalid keyword can be found K1")
	def verifyNotFoundK1(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/p_Menampilkan 0 sampai 0 dari 0 data'),
			0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users click the arrow icon to navigate or change pages K1")
	def navigateArticlePagesK1(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_NEXT PAGE_chakra-button css-1rjox9p'))
	}
	
	@Then("Verify that the data displayed changes according to the page K1")
	def verifyPageChangesK1(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/p_Daftar Konten'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("User click Konten dan Informasi and Kategori Sampah")
	def clickKategoriSampah(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/div_Konten dan Informasi'))
		
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/div_Kategori Sampah'))
	}
	
	@And("User click icon edit to editing Trash Category")
	def clickEditK2() {
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Edit Kategori_chakra-button css-82o55j'))
	}
	
	@Then("User click Batal to cancel editing Trash Category")
	def clickBatalEditK2(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Batal-EDIT KATEGORI'))
		
		WebUI.closeBrowser()
	}
	
	@And("User click icon delete to deleting Trash Category")
	def clickDeleteTrashCategory(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Delete Kategori_chakra-button css-qfrwun'))
	}
	
	@Then("User click button Batal to close the Delete Pop Up Trash Category")
	def clickBatalDeleteK2(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Batal-Hapus Kategori'))
		
		WebUI.closeBrowser()
	}
	
	@And("Users input appropriate keywords on Search Field K2")
	def searchValidKeywordsK2(){
		WebUI.setText(findTestObject('Konten dan Informasi/Page_RecyThing Web/input_SEARCH Kelola Kategori dan Jenis Sampah_chakra-input css-lohvid'),
			'limbah')
	}
	
	@Then("Verify that the data displayed matches the keywords searched K2")
	def verifyMatchKeywordsK2(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/p_limbah-kategori'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users entered invalid keywords on Search Field K2")
	def searchInvalidKeywordsK2(){
		WebUI.setText(findTestObject('Konten dan Informasi/Page_RecyThing Web/input_SEARCH Kelola Kategori dan Jenis Sampah_chakra-input css-lohvid'),
			'*')
	}
	
	@Then("Verify that no data with the invalid keyword can be found K2")
	def verifyNotFoundKeywordsK2(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/td_Data tidak ditemukan-kategori'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users click the arrow icon to navigate or change pages K2")
	def navigatePagesK2(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_NEXT Kategori_chakra-button css-1rjox9p'))
	}
	
	@Then("Verify that the data displayed changes according to the page K2")
	def verifyPagesChangesK2(){
		WebUI.closeBrowser()
	}
	
	
	@And("User click Konten dan Informasi and Drop Point")
	def clickDropPointK3(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/div_Konten dan Informasi'))
		
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/div_Data Drop Point'))
	}
	
	@And("User click a Drop Point view Drop Point Details")
	def clickAnDropPointK3(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/View Detail Drop Point_chakra-button css-tsy6hp'))
	}
	
	@Then("Verify the Drop Point Detail is displayed")
	def verifyDetailDisplayedK3(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Kembali-Detail Drop Point'), 0)
		
		WebUI.closeBrowser()
	}
	
	@Then("User click button Kembali to close the Detail Drop Point")
	def clickKembaliK3(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Kembali-Detail Drop Point'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.closeBrowser()
	}
	
	@And("User click icon edit to editing Drop Point")
	def clickEditK3() {
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Edit Drop Point_chakra-button css-tsy6hp'))
	}
	
	@Then("User click Batal to cancel editing Drop Point")
	def clickBatalEditK3(){
		WebUI.closeBrowser()
	}
	
	@And("User click icon delete to deleting Drop Point")
	def clickDeleteDropPoint(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Delete Data Drop Point'))
	}
	
	@Then("User click button Batal to close the Delete Pop Up Drop Point")
	def clickBatalDeleteK3(){
		WebUI.closeBrowser()
	}
	
	@And("Users input appropriate keywords on Search Field K3")
	def searchValidKeywordsK3(){
		WebUI.setText(findTestObject('Konten dan Informasi/Page_RecyThing Web/input_Search Data Drop Point_chakra-input css-lohvid'),
			'Ubud')
	}
	
	@Then("Verify that the data displayed matches the keywords searched K3")
	def verifyMatchKeywordsK3(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/p_Drop Point Ubud'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users entered invalid keywords on Search Field K3")
	def searchInvalidKeywordsK3(){
		WebUI.setText(findTestObject('Konten dan Informasi/Page_RecyThing Web/input_Search Data Drop Point_chakra-input css-lohvid'),
			'*')
	}
	
	@Then("Verify that no data with the invalid keyword can be found K3")
	def verifyNotFoundKeywordsK3(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/td_Data tidak ditemukan - Drop Point'),
			0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users click the arrow icon to navigate or change pages K3")
	def navigatePagesK3(){
		WebUI.click(findTestObject('Konten dan Informasi/Page_RecyThing Web/button_Next Page Drop Point_chakra-button css-1rjox9p'))
	}
	
	@Then("Verify that the data displayed changes according to the page K3")
	def verifyPagesChangesK3(){
		WebUI.verifyElementPresent(findTestObject('Konten dan Informasi/Page_RecyThing Web/input_Search Data Drop Point_chakra-input css-lohvid'),
			0)
		
		WebUI.closeBrowser()
	}
}