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



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I Start RecyThing Application Login")
	def StartLoginApp() {
		Mobile.startApplication('D:\\download 1\\app-release (8).apk', false)
	}

	@When("I Input (.*) On Email Field")
	def InputEmail(String email) {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/EmailField2'), 30)
		Mobile.setText(findTestObject('Login Page/EmailCoba'), email, 30)
	}

	@And("I Input (.*) On Password Field")
	def InputPassword(String password) {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/pss'), 30)
		Mobile.setText(findTestObject('Login Page/pss'), password, 30)
	}

	@Then("I (.*) Login Function")
	def VerifyLoginFunction(String verify) {
		Mobile.tap(findTestObject('Login Page/Login Button'), 30)

		Mobile.verifyElementExist(findTestObject(verify), 30)
		Mobile.closeApplication()
	}

	@When("I Tap Atur Ulang Button")
	def TapAturUlangButton() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/AturUlang'), 30)
	}

	@Then("I verify Atur Ulang Function Function")
	def VerifyAturUlangFunction() {
		Mobile.verifyElementExist(findTestObject('Login Page/Validasi Atur Ulang Kata sandi'), 30)
		Mobile.closeApplication()
	}

	@When("I Input On Password Field")
	def IInputPasswordField() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/EmailField2'), 30)
		Mobile.setText(findTestObject('Login Page/EmailCoba'), 'ahmad@example.com', 30)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/pss'), 30)
		Mobile.setText(findTestObject('Login Page/pss'), 'Jiddan', 30)
	}

	@And("I Tap Eye Icon On Login")
	def ITapEyeIcon() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/Eyes'), 30)
	}

	@Then("I verify Eye Icon Function")
	def VerifyEyeFunction() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementText(findTestObject('Login Page/pss'), 'Jiddan', FailureHandling.STOP_ON_FAILURE)

		Mobile.closeApplication()
	}

	@When("I Tap Register Button On Register Button")
	def TapRegisterButton() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/Register Button'), 30)
	}

	@Then("I verify Register Function On Login")
	def VerifyRegisterOnLogin() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Register Page/Register Button'), 30, FailureHandling.STOP_ON_FAILURE)

		Mobile.closeApplication()
	}

	@When("I Input Email With Correct Data On Login")
	def IInputEmailWithCorrectData() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/EmailField2'), 30)
		Mobile.setText(findTestObject('Login Page/EmailCoba'), 'ahmad@example.com', 30)
	}

	@And("I Input Correct Password")
	def IInputCorrectPassword() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Login Page/pss'), 30)
		Mobile.setText(findTestObject('Login Page/pss'), '12345678', 30)
	}

	@Then("I verify RecyThing Login Function On Login")
	def VerifyRecyThingLoginFunction() {
		Mobile.tap(findTestObject('Login Page/Login Button'), 30)
		Mobile.verifyElementExist(findTestObject('Login Page/Validasi Recything'), 30)
		Mobile.closeApplication()
	}
}