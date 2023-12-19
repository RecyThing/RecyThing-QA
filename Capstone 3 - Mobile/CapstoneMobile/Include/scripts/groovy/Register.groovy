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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On Register Page")
	def IamOnRegisterPage() {
		Mobile.startApplication('D:\\download 1\\app-release (9).apk', false)
		Mobile.tap(findTestObject('Login Page/Register Button'), 0)
	}

	@When("I Input All Of (.*) and (.*) and (.*) and (.*) Field")
	def IInputAllFieldOnRegister(String name, String email, String password, String confirm ) {
		Mobile.tap(findTestObject('Register Page/Nama Lengkap Field'), 30)
		Mobile.setText(findTestObject('Register Page/NamaLengkap'), name, 30)
		Mobile.tap(findTestObject('Register Page/EmailField'), 30)
		Mobile.setText(findTestObject('Register Page/EmailField'), email, 30)
		Mobile.tap(findTestObject('Register Page/Pass'), 30)
		Mobile.setText(findTestObject('Register Page/Pass'), password, 30)
		Mobile.tap(findTestObject('Register Page/Confirms'), 30)
		Mobile.setText(findTestObject('Register Page/Confirms'), confirm, 30)
	}

	@And("I click Button Registers")
	def IClickButtonRegister() {
		Mobile.swipe(200, 250, 400, 0)
		Mobile.tap(findTestObject('Register Page/Register Button'), 30)
	}

	@Then("I (.*) Register")
	def IVerifyRegister(String verify) {
		Mobile.verifyElementExist(findTestObject(verify), 30)
		Mobile.closeApplication()
	}

	@When("I Click (.*) on Buttons")
	def IClickButtonOnRegister(String tombol) {
		Mobile.swipe(200, 200, 400, 0)
		Mobile.tap(findTestObject(tombol), 30)
	}

	@Then("I (.*) per Button")
	def IVerifyPerButtonOnRegister(String verify1) {
		Mobile.verifyElementExist(findTestObject(verify1), 30)
		Mobile.closeApplication()
	}

	@When("I Input Password 1")
	def IInputPassword1OnRegister() {
		Mobile.tap(findTestObject('Register Page/Nama Lengkap Field'), 30)
		Mobile.setText(findTestObject('Register Page/NamaLengkap'), "", 30)
		Mobile.tap(findTestObject('Register Page/EmailField'), 30)
		Mobile.setText(findTestObject('Register Page/EmailField'), "", 30)
		Mobile.tap(findTestObject('Register Page/Pass'), 30)
		Mobile.setText(findTestObject('Register Page/Pass'), '12345678', 30)
		Mobile.tap(findTestObject('Register Page/Eye1'), 30)
	}

	@And("I Input Password 2")
	def IInputPassword2OnRegister() {
		Mobile.tap(findTestObject('Register Page/Confirms'), 30)
		Mobile.setText(findTestObject('Register Page/Confirms'), '12345678', 30)
		Mobile.tap(findTestObject('Register Page/Eye2'), 30)
	}

	@Then("I Verify Password can see")
	def IVerifyPasswordcansee() {
		Mobile.verifyElementText(findTestObject('Register Page/Pass'), '12345678')
		Mobile.verifyElementText(findTestObject('Register Page/Confirms'), '12345678')
		Mobile.closeApplication()
	}
}