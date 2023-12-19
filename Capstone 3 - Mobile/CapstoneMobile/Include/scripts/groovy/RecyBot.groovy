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



class RecyBot {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Iam On RecyBot Page")
	def IamOnRecyBotPage() {
		WebUI.callTestCase(findTestCase('Login Page/Login With Correct Data'), [:], FailureHandling.STOP_ON_FAILURE)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('RecyBot/Profile'), 30)

		Mobile.swipe(200, 400, 400, 0)

		Mobile.tap(findTestObject('RecyBot/RecyBotButton'), 30)
	}

	@When("I Ask (.*) on RecyBot")
	def IAskQuestionOnRecyBot(String Question) {
		Mobile.tap(findTestObject('RecyBot/Text Field Recy'), 30)

		Mobile.tap(findTestObject('RecyBot/Text Field Press'), 30)

		Mobile.setText(findTestObject('RecyBot/Text Field Press'), Question, 30)
	}

	@And("I Click Send Button on RecyBots")
	def IClickSendButtonOnRecyBots() {
		Mobile.tap(findTestObject('RecyBot/Send Button'), 30)
	}
	@Then("I (.*) the Answer of RecyBot")
	def IVerifytheAnswerOfRecyBot(String verify2) {
		Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject(verify2), 30)
		Mobile.closeApplication()
	}

	@When("I ask 5 Question Together")
	def IAsk5QuestionTogether() {
		Mobile.tap(findTestObject('RecyBot/Text Field Recy'), 30)

		Mobile.tap(findTestObject('RecyBot/Text Field Press'), 30)

		Mobile.setText(findTestObject('RecyBot/Text Field Press'), 'cara membuang sampah', 0)

		Mobile.tap(findTestObject('RecyBot/Send Button'), 30)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('RecyBot/Text Field Recy'), 30)

		Mobile.tap(findTestObject('RecyBot/Text Field Press'), 30)

		Mobile.setText(findTestObject('RecyBot/Text Field Press'), 'cara membuang Limbah', 0)

		Mobile.tap(findTestObject('RecyBot/Send Button'), 30)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('RecyBot/Text Field Recy'), 30)

		Mobile.tap(findTestObject('RecyBot/Text Field Press'), 30)

		Mobile.setText(findTestObject('RecyBot/Text Field Press'), 'cara membuat karya daur ulang', 0)
	}

	@And("I click Send Button On Bot")
	def IClickSendButtonOnBot() {
		Mobile.tap(findTestObject('RecyBot/Send Button'), 30)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	}
	@Then("I verify the Answer")
	def IVerifytheAnswer() {
		Mobile.verifyElementExist(findTestObject('RecyBot/Validasi Recy'), 0)
		Mobile.closeApplication()
	}
}