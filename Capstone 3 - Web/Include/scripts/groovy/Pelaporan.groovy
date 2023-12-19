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



class Pelaporan {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("User navigated to Login Page P1")
	def openLoginPageP1(){
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://develop--recything-web.netlify.app/login')
	}

	@When("User fill (.*) and (.*) on P1 field")
	def inputCredentialLoginP1(String emailP1, String passwordP1){
		WebUI.setText(findTestObject('Login/Page_RecyThing Web/input_Email_email'), 'superadmin@gmail.com')

		WebUI.setEncryptedText(findTestObject('Login/Page_RecyThing Web/input_Email_password'), 'aeHFOx8jV/A=')
	}

	@And("User click Login Button and get directed to Dashboard P1")
	def clickLoginButtonP1(){
		WebUI.click(findTestObject('Login/Page_RecyThing Web/button_Login'))
		
		WebUI.verifyElementVisible(findTestObject('Login/Page_RecyThing Web/verify_Dashboard'))
	}
	
	@And("User click Pelaporan on the sidebar")
	def clickPelaporanP1(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/div_Pelaporan'))
	}
	
	@And("User click eye icon to view Report Details P1")
	def clickViewAllDetailsP1(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_icon-EYE-ALL_chakra-button css-11amxnw'))
	}
	
	@Then("Verify the Report Detail is displayed P1")
	def verifyDetailReportAllP1(){
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali-ALL'), 0)
		
		WebUI.closeBrowser()
	}
	
	@Then("User click button Kembali to close the Detail Report P1")
	def clickKembaliDetailAllP1(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali-ALL'))
		
		WebUI.closeBrowser()
	}
	
	@And("Users input appropriate keywords on Search Field P1")
	def inputValidKeywordsP1(){
		WebUI.setText(findTestObject('Pelaporan/Page_RecyThing Web/input_Search_chakra-input css-lohvid'), 'madvie')
	}
	
	@Then("Verify that the data displayed matches the keywords searched P1")
	def verifyMatchKeywordsP1(){
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/p_madvier83gmail.com'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users entered invalid keywords on Search Field P1")
	def inputInvalidKeywordsP1(){
		WebUI.setText(findTestObject('Pelaporan/Page_RecyThing Web/input_Search_chakra-input css-lohvid'), '*')
	}
	
	@Then("Verify that no data with the invalid keyword can be found P1")
	def verifyNotFoundKeywordsP1(){
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/td_Data tidak ditemukan'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("Users click the arrow icon to navigate or change pages P1")
	def clickNavigateIconP1(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_NEXT_chakra-button css-1rjox9p'))
	}
	
	@Then("Verify that the data displayed changes according to the page P1")
	def verifyPageChangesP1(){
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/h1_Kelola Data Pelaporan'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("User click Pelaporan on the sidebar and tab Perlu Tinjauan")
	def clickTabTinjauanP2(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/div_Pelaporan'))

		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Perlu Tinjauan75'))
	}
	
	@And("User click eye icon to view Report Details P2")
	def clickViewDetailReviewP2(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_ICON-EYE-perlu ditinjau_chakra-button css-11amxnw'))
	}
	
	@Then("Verify the Report Detail is displayed P2")
	def verifyDetailReportP2(){
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali_TINJAUAN'), 0)
		
		WebUI.closeBrowser()
	}
	
	@Then("User click button Kembali to close the Detail Report P2")
	def clickKembaliReportP2(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali_TINJAUAN'))
		
		WebUI.closeBrowser()
	}
	
	@And("User click button Setujui")
	def clickSetujuiP2(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Setujui'))
	}
	
	@Then("User click button Kembali to cancel approving a report P2")
	def clickKembaliAccP2(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Batal-Setuju'))
		
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/h1_Kelola Data Pelaporan'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("User click button Tolak")
	def clickTolakP2(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Tolak'))
	}
	
	@Then("User click button Kembali to cancel rejecting a report P2")
	def clickKembaliRejectP2(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Batal-Tolak'))
		
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/h1_Kelola Data Pelaporan'), 0)
		
		WebUI.closeBrowser()
	}
	
	@And("User click Pelaporan on the sidebar and tab Disetujui")
	def clickTabDisetujuiP3(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/div_Pelaporan'))
		
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Disetujui30'))
	}
	
	@And("User click eye icon to view Report Details P3")
	def clickViewDetailAccP3(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_icon-EYE-ACC_chakra-button css-11amxnw'))
	}
	
	@Then("Verify the Report Detail is displayed P3")
	def verifyDetailDisplayedP3(){
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali-Acc'), 0)
		
		WebUI.closeBrowser()
	}
	
	@Then("User click button Kembali to close the Detail Report P3")
	def closeDetailReportP3(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali-Acc'))
		
		WebUI.closeBrowser()
	}
	
	@And("User click Pelaporan on the sidebar and tab Ditolak")
	def clickTabDitolakP4(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/div_Pelaporan'))
		
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Ditolak18'))
	}
	
	@And("User click eye icon to view Report Details P4")
	def clickViewDetailRejectP4(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_icon-EYE-ditolak_chakra-button css-11amxnw'))
	}
	
	@Then("Verify the Report Detail is displayed P4")
	def verifyDetailDisplayedP4(){
		WebUI.verifyElementPresent(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali-Tolak'), 0)
		
		WebUI.closeBrowser()
	}
	
	@Then("User click button Kembali to close the Detail Report P4")
	def closeDetailReportP4(){
		WebUI.click(findTestObject('Pelaporan/Page_RecyThing Web/button_Kembali-Tolak'))
		
		WebUI.closeBrowser()
	}
}