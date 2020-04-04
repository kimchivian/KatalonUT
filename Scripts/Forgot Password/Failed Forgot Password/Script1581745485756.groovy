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

Mobile.verifyElementExist(findTestObject('Object Repository/Forgot Password/UangTeman_logo'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Forgot Password/Versiterbarutelahtersedia_text'), 5)

Mobile.tap(findTestObject('Object Repository/Forgot Password/LainKali_button'), 5)

Mobile.verifyElementText(findTestObject('Object Repository/Forgot Password/PinjamanOnline_text'), 'Pinjaman Online')

Mobile.tap(findTestObject('Object Repository/Forgot Password/HamburgerBar_button'), 30)

Mobile.tap(findTestObject('Object Repository/Forgot Password/LoginNasabah_button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Forgot Password/LoginNasabah_text'), 'Login Nasabah')

Mobile.tap(findTestObject('Object Repository/Forgot Password/LupaKataSandi_button'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Forgot Password/ForgotPassword_text'), 'Forgot Password')

Mobile.verifyElementText(findTestObject('Object Repository/Forgot Password/AlamatEmail_text'), 'Alamat Email')

Mobile.tap(findTestObject('Object Repository/Forgot Password/Kirim_button'), 30)

Mobile.setText(findTestObject('Object Repository/Forgot Password/Isiemailmu_edit_text'), 'asd123', 30)

Mobile.tap(findTestObject('Object Repository/Forgot Password/Kirim_button'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Forgot Password/Formatemailmusalah_error_message'), 'Format emailmu salah. Cth: address@email.com')

Mobile.clearText(findTestObject('Object Repository/Forgot Password/Isiemailmu_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Forgot Password/Isiemailmu_edit_text'), 'asd123@gmail.com', 30)

Mobile.tap(findTestObject('Object Repository/Forgot Password/Kirim_button'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Forgot Password/forgetpasswordfailed_error_message'), 'forget password failed')

Mobile.tap(findTestObject('Object Repository/Forgot Password/OK_button'), 30)
