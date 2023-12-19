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



class DropPoint {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On Daur ulang page")
	def IamOnDaurUlangPage() {
		Mobile.startApplication('D:\\download 1\\app-release (12).apk', false)

		Mobile.tap(findTestObject('DropPoint/DaurUlangButton'), 0)
	}

	@When("I Search (.*) on Drop Point")
	def ISearchDPKOnDropPoint(String DPK) {
		Mobile.tap(findTestObject('DropPoint/TukarSampahmuButton'), 0)

		Mobile.tap(findTestObject('DropPoint/SearchButton'), 0)

		Mobile.setText(findTestObject('DropPoint/SearchButtonPress'), DPK, 0)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I (.*) Search Drop Point")
	def Iverify8SearchDropPoint(String verify8) {
		Mobile.verifyElementExist(findTestObject(verify8), 0)
		Mobile.closeApplication()
	}

	@When("I Click Tukar sampah mu card")
	def IClickTukarPoint() {
		Mobile.tap(findTestObject('DropPoint/TukarSampahmuButton'), 0)
	}

	@Then("I Verify Tukar sampah card")
	def IVerifyTukarSampahCard() {
		Mobile.verifyElementExist(findTestObject('DropPoint/Validasi Tukar Sampah mu Card'), 0)

		Mobile.closeApplication()
	}
}