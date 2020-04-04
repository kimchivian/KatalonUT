import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('APK/fls_81_93bd70c0_staging.apk', false)

Mobile.verifyElementExist(findTestObject('Object Repository/Register/UangTeman_logo'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Register/Versiterbarutelahtersedia_text'), 10)

Mobile.tap(findTestObject('Object Repository/Register/LainKali_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Register/PinjamanOnline_text'), 'Pinjaman Online')

Mobile.tap(findTestObject('Object Repository/Register/HamburgerBar_button'), 10)

Mobile.tap(findTestObject('Object Repository/Register/LoginNasabah_button'), 10)

Mobile.tap(findTestObject('Object Repository/Register/BELUMPUNYAAKUN_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Register/Daftar_text'), 'Daftar')

Mobile.tap(findTestObject('Object Repository/Register/DAFTAR_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Register/Harusdiisi_error_message'), 'Harus diisi')

Mobile.verifyElementText(findTestObject('Object Repository/Register/Nomorteleponkamu_text'), 'Nomor telepon kamu')

Mobile.setText(findTestObject('Object Repository/Register/Nomorteleponkamu_edit_text'), '0898711111180', 10)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/Register/Apaalamatemailkamu_text'), 'Apa alamat email kamu?')

Mobile.setText(findTestObject('Object Repository/Register/Apaalamatemailkamu_edit_text'), 'hamna123', 10)

Mobile.scrollToText('Konfirmasi Password')

Mobile.verifyElementText(findTestObject('Object Repository/Register/Password_text'), 'Password')

Mobile.setText(findTestObject('Object Repository/Register/Password_edit_text'), 'testing', 10)

Mobile.tap(findTestObject('Object Repository/Register/EyeSeeKataSandi_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Register/KonfirmasiPassword_text'), 'Konfirmasi Password')

Mobile.setText(findTestObject('Object Repository/Register/KonfirmasiPassword_edit_text'), 'testung', 10)

Mobile.tap(findTestObject('Object Repository/Register/EyeSeeKataSandi_button'), 10)

Mobile.tap(findTestObject('Object Repository/Register/DAFTAR_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Register/Formatemailmusalah_error_message'), 'Format emailmu salah. Cth: address@email.com')

Mobile.scrollToText('Not match')

Mobile.verifyElementText(findTestObject('Object Repository/Register/Notmatch_error_message'), 'Not match')

Mobile.scrollToText('Apa alamat email kamu?')

Mobile.clearText(findTestObject('Object Repository/Register/Apaalamatemailkamu_edit_text'), 10)

Mobile.setText(findTestObject('Object Repository/Register/Apaalamatemailkamu_edit_text'), 'hamna123@yopmail.com', 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Register/Password_text'), 10)

Mobile.setText(findTestObject('Object Repository/Register/Password_edit_text'), 'testing', 10)

Mobile.clearText(findTestObject('Object Repository/Register/KonfirmasiPassword_edit_text'), 10)

Mobile.setText(findTestObject('Object Repository/Register/KonfirmasiPassword_edit_text'), 'testing', 10)

Mobile.tap(findTestObject('Object Repository/Register/EyeSeeKataSandi_button'), 10)

Mobile.tap(findTestObject('Object Repository/Register/DAFTAR_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Register/hporemailalreadyregistered_error_message'), 'hp or email already registered')

Mobile.tap(findTestObject('Object Repository/Register/Ok_button'), 10)
