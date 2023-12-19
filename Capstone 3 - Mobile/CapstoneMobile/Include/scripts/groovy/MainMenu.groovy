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



class MainMenu {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Iam On Recything Main Menu")
	def IamOnRecyThingMainMenu() {
		WebUI.callTestCase(findTestCase('Login Page/Login With Correct Data'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I Click (.*) on Main Menu Page")
	def IClickElementOnMainMenuPage(String Element) {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject(Element), 30)
	}

	@Then("I (.*) Element Connect To Main Menu")
	def IVerifyElementConnectToMainMenu(String verify3) {
		Mobile.verifyElementExist(findTestObject(verify3), 30)

		Mobile.closeApplication()
	}

	@When("I Click (.*) Articles on Main Menu")
	def IClickArticleOnMainMenu(String Article) {
		Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)
		Mobile.swipe(0, 300, 0, 0)
		Mobile.tap(findTestObject(Article), 30)
	}

	@Then("I (.*) Article Connect To Main Menu")
	def IVerifyArticleConnectToMainMenu(String verify4) {
		Mobile.verifyElementExist(findTestObject(verify4), 30)
		Mobile.closeApplication()
	}

	@When("I Click Beranda Button")
	def IClickBerandaButton() {
		Mobile.tap(findTestObject('MainMenu/Daur Ulang Button'), 0)
		Mobile.tap(findTestObject('MainMenu/BerandaButton'), 0)
	}

	@Then("I verify Beranda Button")
	def IVerifyBerandaButtonFunction() {
		Mobile.verifyElementExist(findTestObject('MainMenu/Validasi Beranda'), 0)
		Mobile.closeApplication()
	}
}