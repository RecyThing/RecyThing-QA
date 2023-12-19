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



class DetailPointKu {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am On Detail Point Ku Page")
	def IamOnDetailPointKuPage() {
		Mobile.startApplication('D:\\download 1\\app-release (12).apk', false)

		Mobile.tap(findTestObject('MainMenu/Tukar Poin Button'), 0)
	}

	@When("I Click Kumpulkan Point")
	def IClickKumpulkanPoint() {

		Mobile.tap(findTestObject('Detail Pointku/Kumpulkan Button'), 0)
	}

	@Then("I Verify Kumpulkan Point")
	def IVerifyKumpulkanPoint() {
		Mobile.verifyElementExist(findTestObject('Detail Pointku/Validasi Claim Daily Point'), 0)

		Mobile.closeApplication()
	}
	
//	@When("I Click Riwayat")
//	def IClickRiwayat() {
//		Mobile.tap(findTestObject('Detail Pointku/Riwayat Button'), 0)
//		Mobile.closeApplication()
//	}
//
//	@And("I Click Card Riwayat")
//	def IClickCardRiwayat() {
//		Mobile.tap(findTestObject('Detail Pointku/CardRiwayat'), 0)
//	}
//	@Then("I Verify Riwayat")
//	def IVerifyRiwayat() {
//		Mobile.verifyElementExist(findTestObject('Detail Pointku/Validasi Detail Transaksi'), 0)
//		Mobile.closeApplication()
//	}

	@When("I Click Tukar Voucher")
	def IClickTukarVoucher() {
		Mobile.tap(findTestObject('Detail Pointku/Tukar Point1'), 0)

		Mobile.tap(findTestObject('Detail Pointku/Tukar Point2'), 0)
	}

	@And("I Fill Number Phone On Tukar Voucher")
	def IFillNumberPhoneOnTukarVoucher() {
		Mobile.tap(findTestObject('Detail Pointku/Nomor Telepon Button'), 0)

		Mobile.setText(findTestObject('Detail Pointku/Nomor Telepon Press Button'), '', 0)

		Mobile.tap(findTestObject('Detail Pointku/Konfirmasi Button'), 0)

		Mobile.tap(findTestObject('Detail Pointku/Tukar Voucher Ok'), 0)
	}
	@Then("I Verify Empty Number Phone")
	def IVerifyEmptyNumberButton() {
		Mobile.verifyElementExist(findTestObject('Detail Pointku/Validasi Empty Nomor Telepon'), 0)
		Mobile.closeApplication()
	}


	@When("I Click Tukar Voucher2")
	def IClickTukarVoucher2() {
		Mobile.tap(findTestObject('Detail Pointku/Tukar Point1'), 0)

		Mobile.tap(findTestObject('Detail Pointku/Tukar Point2'), 0)
	}

	@And("I Fill Number Phone On Tukar Voucher2")
	def IFillNumberPhoneOnTukarVoucher2() {

		Mobile.tap(findTestObject('Detail Pointku/Nomor Telepon Button'), 0)

		Mobile.setText(findTestObject('Detail Pointku/Nomor Telepon Press Button'), '085775648550', 0)

		Mobile.tap(findTestObject('Detail Pointku/Konfirmasi Button'), 0)

		Mobile.tap(findTestObject('Detail Pointku/Tukar Voucher Ok'), 0)
	}
	@Then("I Verify Redeem voucher")
	def IVerifyRedeemVoucher() {
		Mobile.verifyElementExist(findTestObject('Detail Pointku/Validasi redeem voucher'), 0)
		Mobile.closeApplication()
	}


	@When("I Click Tukar Voucher3")
	def IClickTukarVoucher3() {
		Mobile.tap(findTestObject('Detail Pointku/Tukar Point Button'), 0)

		Mobile.tap(findTestObject('Detail Pointku/Detail voucher 2'), 0)
	}

	@And("I Fill Number Phone")
	def IFillNumberPhone() {
		Mobile.tap(findTestObject('Detail Pointku/Nomor Telepon Button'), 0)

		Mobile.setText(findTestObject('Detail Pointku/Nomor Telepon Press Button'), '085775648550', 0)

		Mobile.tap(findTestObject('Detail Pointku/Konfirmasi Button'), 0)

		Mobile.tap(findTestObject('Detail Pointku/Tukar Voucher Ok'), 0)
	}

	@And("I Click Back To Main Menu Button On Voucher Success")
	def IClickBackToMainMenuButtonOnVoucherSuccess() {
		Mobile.tap(findTestObject('Detail Pointku/KembaliButton'), 30)
	}
	@Then("I Verify Back to Main Menu Button")
	def IVerifyBackToMainMenuButton() {
		Mobile.verifyElementExist(findTestObject('Detail Pointku/ValidasiSuccess'), 0)
		Mobile.closeApplication()
	}

	@When("I Click Tukar Voucher4")
	def IClickTukarVoucher4() {
		Mobile.tap(findTestObject('Detail Pointku/Tukar Point1'), 0)
	}

	@And("I Click Batal Button")
	def IClickBatalButton() {
		Mobile.tap(findTestObject('Detail Pointku/Batal Tukar Voucher Button'), 0)
	}
	@Then("I Verify Batal Tukar Voucher")
	def IVerifyBatalTukarVoucher() {
		Mobile.verifyElementExist(findTestObject('Detail Pointku/ValidasiBatalTukarVoucher'), 0)
		Mobile.closeApplication()
	}

	@Given("Iam On Tukar Point Page with Less than Point")
	def IamOnTukarPointPageWithLessThanPoint() {
		Mobile.closeApplication()
		Mobile.startApplication('D:\\download 1\\app-release (12).apk', false)

		Mobile.tap(findTestObject('Login Page/EmailField2'), 30)

		Mobile.setText(findTestObject('Login Page/Emailcoba'), 'ahmad@example.com', 30)

		Mobile.tap(findTestObject('Login Page/pss'), 30)

		Mobile.setText(findTestObject('Login Page/pss'), '12345678', 30)

		Mobile.tap(findTestObject('Login Page/Login Button'), 30)

		Mobile.verifyElementExist(findTestObject('Login Page/Validasi Recything'), 30)

		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('MainMenu/Tukar Poin Button'), 0)
	}

	@When("I Click Disable Tukar Button")
	def IClickDisableTukarButton() {
		Mobile.tap(findTestObject('Detail Pointku/TukarDisableButton'), 0)
	}
	@Then("I Verify Disable Tukar Button")
	def IVerifyDisableTukarPoint() {
		Mobile.verifyElementExist(findTestObject('Detail Pointku/Validasi Voucher'), 0)

		Mobile.closeApplication()
	}

	@When("I Click Riwayat Button")
	def IClickRiwayatButton() {
		Mobile.tap(findTestObject('Detail Pointku/Riwayat Button'), 0)
	}

	@Then("I Verify Riwayat Button")
	def IVerifyRiwayatButton() {
		Mobile.verifyElementExist(findTestObject('Detail Pointku/Riwayat Button'), 0)
		Mobile.closeApplication()
	}
}