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



class OnBoarding {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I Open RecyThing Application OnBoarding")
	def OpenRecyThingOnBoarding() {
		Mobile.startApplication('D:\\download 1\\app-release (2).apk', false)
	}

	@When("I Click Selanjutnya Button")
	def ClickSelanjutnyaOnBoarding() {
		Mobile.tap(findTestObject('OnBoarding Object/Selanjutnya Button'), 0)
	}

	@Then("I verify Next Page OnBoarding Page")
	def VerifyNextPageOnBoarding() {
		Mobile.verifyElementExist(findTestObject('OnBoarding Object/Validasi Page 2 OnBoarding'), 0)
		Mobile.closeApplication()
	}

	@When("I Click Selanjutnya Button Until End Page 1")
	def ClickSelanjutnyaUntilEnd1OnBoarding() {
		Mobile.tap(findTestObject('OnBoarding Object/Selanjutnya Button'), 0)

		Mobile.tap(findTestObject('OnBoarding Object/Selanjutnya Button'), 0)
	}

	@Then("I verify Login Button")
	def VerifyLoginButton() {
		Mobile.tap(findTestObject('OnBoarding Object/Login Button'), 0)
		Mobile.verifyElementExist(findTestObject('OnBoarding Object/Validasi Login'), 0)
		Mobile.closeApplication()
	}

	@When("I Click Selanjutnya Button Until End Page 2")
	def ClickSelanjutnyaUntilEnd2OnBoarding() {
		Mobile.tap(findTestObject('OnBoarding Object/Selanjutnya Button'), 0)

		Mobile.tap(findTestObject('OnBoarding Object/Selanjutnya Button'), 0)
	}

	@Then("I verify Register Button")
	def VerifyRegisterButton() {
		Mobile.tap(findTestObject('OnBoarding Object/Register Button'), 0)

		Mobile.verifyElementExist(findTestObject('OnBoarding Object/Validasi Register'), 0)
		Mobile.closeApplication()
	}

	@When("I Click Lewati Button")
	def ClickLewatiButton() {
		Mobile.tap(findTestObject('OnBoarding Object/Lewati Button'), 0)
	}

	@Then("I verify Lewati Button")
	def VerifyLewatiButton() {
		Mobile.verifyElementExist(findTestObject('OnBoarding Object/Validasi Login'), 0)
		Mobile.closeApplication()
	}
}