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



class Artikel {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On Artikel Page")
	def IamOnArtikelPage() {
		Mobile.startApplication('D:\\download 1\\app-release (12).apk', false)
		
		Mobile.tap(findTestObject('MainMenu/Daur Ulang Button'), 0)
	}

	@When("I (.*) one of Artikel")
	def ISearchArtikel(String SearchArtikel) {
		Mobile.tap(findTestObject('Article/Search Artikel'), 0)
		
		Mobile.setText(findTestObject('Article/Search Artikel Press'), SearchArtikel, 0)
	}
	@Then("I (.*) Artikeles")
	def IVerifyArtikel(String verify9) {
		Mobile.verifyElementExist(findTestObject(verify9), 0)
	}

	@When("I Click Lihat Semua Kategori Function")
	def IClickLihatSemuaKategori() {
		Mobile.tap(findTestObject('Article/Lihat Semua Kategori Daur Ulang'), 0)
		
		
	}
	@Then("I Verify Lihat Semua Kategori Function")
	def IVerifyLihatSemuaKategori() {
		Mobile.verifyElementExist(findTestObject('Article/Validasi Lihat Semua Kategori'), 0)
	}

	@When("I Click Lihat Semua Artikel Populer Function")
	def IClickLihatSemuaArtikelPopuler() {
		Mobile.tap(findTestObject('Article/Lihat Semua Artikel Popular'), 0)
	}
	@Then("I Verify Lihat Semua Artikel Populer Function")
	def IVerifyLihatSemuaArtikel() {
		Mobile.verifyElementExist(findTestObject('Article/Validasi Lihat Semua Artikel Populer'), 0)
	}

	@When("I Click One Category Function")
	def IClickOneCategoryFunction() {
		Mobile.tap(findTestObject('Article/Plastik Icon'), 0)
		
		
	}
	@Then("I Verify One Category Function")
	def IVerifyOneCategoryFunction() {
		Mobile.verifyElementExist(findTestObject('Article/Validasi Plastik'), 0)
	}

	@When("I Click Lihat Semua Artikel Populer Function2")
	def IClickLihatSemuaArtikelPopuler2() {
		Mobile.tap(findTestObject('Article/Lihat Semua Artikel Popular'), 0)
	}
	
	
	
	@And("I Click Terbaru Button")
	def IClickTerbaruButton() {
		Mobile.tap(findTestObject('Article/Terbaru Button'), 0)
		
	
	}

	@Then("I Verify Lihat Semua Artikel Populer Function2")
	def IVerifyLihatSemuaArtikelPopuler() {
		Mobile.verifyElementExist(findTestObject('Article/Validasi Lihat Semua Artikel Populer'), 0)
	}

	@When("I Click Lihat Category Daur Ulang")
	def IClickLihatCategoryDaurUlang() {
		Mobile.tap(findTestObject('Article/Lihat Semua Kategori Daur Ulang'), 0)
		
		
		
	}
	@And("I Choose Elektronik Kategori")
	def IChooseElektronikKategori() {
		Mobile.tap(findTestObject('Article/Select Elektronik Kategori'), 0)
		
		Mobile.tap(findTestObject('Article/Select Elektronik Artikel'), 0)
		
		
	}

	@Then("I Verify can See Artikel Elektronik")
	def IVerifyLihatCategoryDaurUlang() {
		Mobile.verifyElementExist(findTestObject('Article/Validasi Read Artikel'), 0)
	}

	@When("I Click Lihat Category Daur Ulang2")
	def IClickLihatCategoryDaurUlang2() {
		Mobile.tap(findTestObject('Article/Lihat Semua Kategori Daur Ulang'), 0)
		
		
		
	}
	@And("I Choose Elektronik Kategori2")
	def IChooseElektronikKategori2() {
		Mobile.tap(findTestObject('Article/Select Elektronik Kategori'), 0)
		
		Mobile.tap(findTestObject('Article/Select Elektronik Artikel'), 0)
		
		
	}

	@And("I Click Like Button")
	def IClickLikeButton() {
		Mobile.tap(findTestObject('Article/Like Artikel'), 0)
		

	}

	@Then("I Verify Like Function")
	def IVerifyLikeFunction() {
		Mobile.verifyElementExist(findTestObject('Article/Validasi Like Artikel'), 0)
	}
}