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



class Dashboard {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User navigated to Login Page D1")
	def openLoginPageD1() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://develop--recything-web.netlify.app/login')
	}

	@When("User fill in (.*) and (.*) on D1 field")
	def inputCredentialLoginD1(String emailD1, String passwordD1) {
		WebUI.setText(findTestObject('Login/Page_RecyThing Web/input_Email_email'), 'superadmin@gmail.com')

		WebUI.setEncryptedText(findTestObject('Login/Page_RecyThing Web/input_Email_password'), 'aeHFOx8jV/A=')
	}

	@And("User click Login Button and get directed to Homepage")
	def clickLoginButtonD1() {
		WebUI.click(findTestObject('Login/Page_RecyThing Web/button_Login'))
	}

	@And("User click pointer to hide the sidebar")
	def clickPointerD1() {
		WebUI.click(findTestObject('Dashboard/Page_RecyThing Web/svg_No_cursor-pointer'))
	}

	@Then("Verify the dashboard is displayed with a minimized sidebar")
	def verifyD1() {
		WebUI.verifyElementVisible(findTestObject('Login/Page_RecyThing Web/verify_Dashboard'))

		WebUI.closeBrowser()
	}

	@And("User click download button")
	def clickDownloadD1() {
		WebUI.click(findTestObject('Dashboard/Page_RecyThing Web/div_Download'))
	}

	@Then("User directed to the Download Page")
	def directedToDownloadPageD1() {
		WebUI.verifyElementPresent(findTestObject('Dashboard/Page_RecyThing Web/h1_Download Laporan'), 0)

		WebUI.closeBrowser()
	}

	@And("User click button kembali")
	def clickDownloadD2() {
		WebUI.click(findTestObject('Dashboard/Page_RecyThing Web/button_Kembali'))
	}

	@Then("User directed back from Download Page to Dashboard")
	def directedBackToDashboardD1() {
		WebUI.verifyElementVisible(findTestObject('Login/Page_RecyThing Web/verify_Dashboard'))

		WebUI.closeBrowser()
	}
}