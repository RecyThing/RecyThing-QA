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



class Reporting {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On Pelaporan Page")
	def IamOnPelaporanSampah() {
		Mobile.startApplication('D:\\download 1\\app-release (12).apk', false)
		
		Mobile.tap(findTestObject('MainMenu/Pelaporan Button'), 0)
	}

	@When("I Input Data With (.*) ands (.*) On Report Rubbish")
	def IInputDataWithLokasiPatokanDanKondisiSampah(String LokasiPatokan, String KondisiSampah) {
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Tumpukan Sampah Button'), 0)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Maps Button'), 0)
		
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Search Map Report Rubbish'), 0)
		
		Mobile.setText(findTestObject('Reporting/Report Rubbish/Search Map Report Rubbish Press'), 'bandung', 0)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Select Bandung As a map'), 0)
		
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Selanjutnya Button'), 0)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Lokasi Patokan'), 0)
		
		Mobile.setText(findTestObject('Reporting/Report Rubbish/Lokasi Patokan Press'), LokasiPatokan, 0)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Sampah Kering'), 0)
		
		Mobile.swipe(0, 400, 0, 0)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Ceritakan Kondisi Sampah'), 0)
		
		Mobile.setText(findTestObject('Reporting/Report Rubbish/Ceritakan Kondisi Sampah Press'), KondisiSampah,
			0)
		
		Mobile.swipe(0, 400, 0, 0)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Bukti foto atau video'), 0)
		
		Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.tap(findTestObject('Reporting/Report Rubbish/Foto'), 0)
		
		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I verify the result with empty lokasi patokan and asmpah")
	def IVerifyTheResultWithEmptyLokasidanSampah() {
	}

	@When("I Don't Input Maps")
	def IDontInputMaps() {
	}

	@Then("I verify the result of Empty Maps")
	def IVerifyTheResultEmptyMaps() {
	}

	@When("I Don't Input Photo")
	def IDontInputPhoto() {
	}

	@Then("I verify the result of Empty Photo")
	def IVerifyTheResultOfEmptyPhoto() {
	}

	@When("I Input Correct data on Report Rubbishes")
	def InputCorrectDataOnReportRubbishes() {
	}

	@Then("I verify the result of Correct Data on Report Rubbishes")
	def IVerifyResultCorrectDataOnReportRubbish() {
	}

	@When("I Input Media More than 20 MB")
	def IInputMediaMoreThan20MB() {
	}

	@Then("I verify the result of Upload Media More Than 20 MB")
	def IVerifyResultOfUploadMediaMoreThan20MB() {
	}

	@When("I Input Search Location")
	def IInputSearchLocation() {
	}

	@Then("I verify the result of Search Location")
	def IVerifyTheResultSearchLocation() {
	}

	@When("I Input Random Keyword On Search Location")
	def IInputRandomKeywordOnSearchLocation() {
	}

	@Then("I verify the result of Search Location With Random Keyword")
	def IVerifySearchLocationWithRandomKeyword() {
	}

	@When("I verify Explanation Of Individual Littering")
	def IVerifyExplanationIndividualLittering() {
	}

	@Then("I verify the result of Explanation Individual Littering")
	def IVerifyResultExplanationIndividualLittering() {
	}

	@When("I Click Explanation Of Company Littering")
	def IClickExplanationCompanyLittering() {
	}

	@Then("I verify the result of Explanation Company Littering")
	def IVerifyExplanationCompanyLittering() {
	}

	@When("I Input Data With (.*) ands (.*) On Report Littering")
	def IInputDataOnReportLittering(String LokasiPatokan2, String KondisiSampah2) {
	}

	@Then("I verify the result with Littering Individu All Condition")
	def IVerifyTheResultLitteringIndividuWithAllCondition() {
	}

	@When("I Input Data With (.*) ands (.*) ands (.*) On Report Litering2")
	def IInputDataOnReport(String LokasiPatokan3, String KondisiSampah3, String NamaPT) {
	}

	@Then("I verify the result with Littering Company All Condition")
	def IVerifyResultLitteringIndividuAllCondition() {
	}
}