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



class MenuProfile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Iam On Menu Profile")
	def IamOnMenuProfile() {
		Mobile.startApplication('D:\\download 1\\app-release (12).apk', false)

		Mobile.tap(findTestObject('Menu Profile/Tanya Recy/ProfileButtonTolong'), 30)
	}

	@When("Input All Data Except Date Of Birth")
	def InputAllDataExceptDateOfBirth() {
		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/NamaLengkap2'), 0)

Mobile.setText(findTestObject('Menu Profile/Profile saya Folder/NamaLengkap2Press'), 'Jiddan QA Handal', 0)

Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Alamat Press 2'), 0)

Mobile.setText(findTestObject('Menu Profile/Profile saya Folder/Alamat Press 2'), 'JL. Mamang Koral', 0)
		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Tujuan Drop Down'), 0)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Select Tujuan'), 0)
	}

	@Then("I verify Empty Date Of Birth")
	def IVerifyEmptyDateOfBirth() {
		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Simpan Button'), 0)

		Mobile.verifyElementExist(findTestObject('Menu Profile/Profile saya Folder/Validasi Empty'), 0)
		Mobile.closeApplication()
	}

	@When("Change Email Disable")
	def ChangeEmailDisable() {
		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Profile Saya Button'), 0)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Email Disable'), 0)
	}

	@Then("I verify Can't Change email")
	def ICantChangeEmail() {
		Mobile.verifyElementExist(findTestObject('Menu Profile/Profile saya Folder/Validasi Change Email'), 0)
		Mobile.closeApplication()
	}

	@When("I Input (.*) and than (.*) Data on Change Profile")
	def IInputFullnameandAddress(String Fullname, String address) {
		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Profile Saya Button'), 0)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/NamaLengkap2'), 0)

Mobile.setText(findTestObject('Menu Profile/Profile saya Folder/NamaLengkap2Press'), Fullname, 0)

Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Alamat Press 2'), 0)

Mobile.setText(findTestObject('Menu Profile/Profile saya Folder/Alamat Press 2'), address, 0)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Date Button ini'), 0)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Tanggal 1'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Date Ok'), 0)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Tujuan Drop Down'), 0)

		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Select Tujuan'), 0)
	}

	@Then("I verify the (.*) in step")
	def IVerifytheverify5(String verify5) {
		Mobile.tap(findTestObject('Menu Profile/Profile saya Folder/Simpan Button'), 0)

		Mobile.verifyElementExist(findTestObject(verify5), 0)

		Mobile.closeApplication()
	}

	@When("I Input (.*) and than (.*) and than (.*) Data on Change Profile")
	def IInputPresentPassNewPassAndConfirmPass(String PresentPass, String NewPass, String ConfirmPass ) {
		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Kata sandi Sekarang'), 0)

		Mobile.setText(findTestObject('Menu Profile/Ubah Password/Kata sandi sekarang Press'), PresentPass, 0)

		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Kata sandi Baru'), 0)

		Mobile.setText(findTestObject('Menu Profile/Ubah Password/Kata sandi Baru'), NewPass, 0)

		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Confirm Password'), 0)

		Mobile.setText(findTestObject('Menu Profile/Ubah Password/Confirm Password'),ConfirmPass , 0)
	}

	@Then("I verify the (.*) in step6")
	def IVerifyTheverify6(String verify6) {
		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Simpan Button'), 0)

		Mobile.verifyElementExist(findTestObject('Menu Profile/Ubah Password/Validasi berhasil'), 0)
		Mobile.closeApplication()
	}

	@When("Input Password on Change Password")
	def InputPasswordOnChangePassword( ) {
		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Kata sandi Sekarang'), 0)

		Mobile.setText(findTestObject('Menu Profile/Ubah Password/Kata sandi sekarang Press'), '12345678', 0)

		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Kata sandi Baru'), 0)

		Mobile.setText(findTestObject('Menu Profile/Ubah Password/Kata sandi Baru'), '123456789', 0)

		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Confirm Password'), 0)

		Mobile.setText(findTestObject('Menu Profile/Ubah Password/Confirm Password'), '123456789', 0)
	}

	@And("Click Eye Icon on Change Password")
	def ClickEyeIconOnChangePassword() {
		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Eye 1'), 0)
		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Eye 2'), 0)
		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Eye 3'), 0)
	}

	@Then("I verify All Eye Icon on Change Password")
	def IVerifyAllEyeIconOnChangePassword() {
		Mobile.verifyElementText(findTestObject('Menu Profile/Ubah Password/Kata sandi sekarang Press'), '12345678')

		Mobile.verifyElementText(findTestObject('Menu Profile/Ubah Password/Kata sandi Baru'), '123456789')

		Mobile.verifyElementText(findTestObject('Menu Profile/Ubah Password/Confirm Password'), '123456789')
		Mobile.closeApplication()
	}

	@When("Click Back Button On Change Password")
	def ClickBackButtonOnChangePassword() {
		Mobile.tap(findTestObject('Menu Profile/Ubah Password/Ubah Password Button'), 0)

		Mobile.tap(findTestObject('Menu Profile/Tanya Recy/Back Button Password'), 0)
	}

	@Then("I verify Back button on Change Password")
	def IVerifyBackButton() {
		Mobile.verifyElementExist(findTestObject('MainMenu/Validasi Profile'), 0)
		Mobile.closeApplication()
	}

	@When("Click Lencana Button")
	def ClickLencanaButton() {
		Mobile.tap(findTestObject('Menu Profile/Lencana Folder/Lencana Button'), 0)

		Mobile.tap(findTestObject('Menu Profile/Lencana Folder/Platinum Button'), 0)
	}

	@Then("I verify Lencana Feature")
	def IVerifyLencanaButton() {
		Mobile.verifyElementExist(findTestObject('Menu Profile/Lencana Folder/Validasi Platinum'), 0)
		Mobile.closeApplication()
	}

	@When("Click RecyBot Button on Menu Profile")
	def ClickRecyBotButtonOnMenuProfile() {

		Mobile.tap(findTestObject('Menu Profile/Tanya Recy/RecyButton'), 0)
	}

	@Then("I verify RecyBot on Menu Profile")
	def IVerifyRecyBotOnMenuProfile() {
		Mobile.verifyElementExist(findTestObject('Menu Profile/Tanya Recy/Validasi Recy'), 0)
		Mobile.closeApplication()
	}

	@When("I Input (.*) on FAQ")
	def IInputSearchFAQ(String SearchFAQ) {
		Mobile.tap(findTestObject('Menu Profile/FAQ/FAQ Button'), 0)

		Mobile.tap(findTestObject('Menu Profile/FAQ/Cari Pertanyaan'), 0)

		Mobile.setText(findTestObject('Menu Profile/FAQ/Cari Pertanyaan press'), SearchFAQ, 0)
	}

	@Then("I verify the (.*) in step7")
	def IVerifytheverify7(String verify7) {
		Mobile.checkElement(findTestObject(verify7), 0)
		Mobile.closeApplication()
	}

	@When("Click FAQ Button")
	def ClickFAQButton( ) {
		Mobile.tap(findTestObject('Menu Profile/FAQ/FAQ Button'), 0)

		Mobile.tap(findTestObject('Menu Profile/FAQ/Card FAQ'), 0)
	}

	@And("Click Selengkapnya Button")
	def ClickSelengkapnyaButton() {
		Mobile.tap(findTestObject('Menu Profile/FAQ/Selengkapnya Button'), 0)
	}

	@Then("I verify Selengkapnya FAQ on Menu Profile")
	def IVerifySelengkapnyaFAQonMenuProfile() {
		Mobile.verifyElementExist(findTestObject('Menu Profile/FAQ/Validasi Selanjutnya'), 0)
		Mobile.closeApplication()
	}

	@When("Click Back Button On Menu Profile")
	def ClickBackButtonOnMenuProfile() {
		Mobile.tap(findTestObject('Menu Profile/Tanya Recy/Back Button'), 0)
	}

	@Then("I verify Back Button On Menu Profile")
	def IVerifyBackButtonOnMenuProfile() {
		Mobile.verifyElementExist(findTestObject('MainMenu/Validasi Beranda'), 0)
		Mobile.closeApplication()
	}
}
