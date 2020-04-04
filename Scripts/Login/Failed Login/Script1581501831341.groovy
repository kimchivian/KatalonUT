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

Mobile.verifyElementExist(findTestObject('Object Repository/Login/UangTeman_logo'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Login/Versiterbarutelahtersedia_text'), 0)

Mobile.tap(findTestObject('Object Repository/Login/LainKali_button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Login/PinjamanOnline_text'), 'Pinjaman Online')

Mobile.tap(findTestObject('Object Repository/Login/HamburgerBar_button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/LoginNasabah_button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Login/LoginNasabah_text'), 'Login Nasabah')

Mobile.tap(findTestObject('Object Repository/Login/MASUK_button'), 5)

Mobile.verifyElementText(findTestObject('Object Repository/Login/Harapmasukanemaildanpasswordmu_error_message'), 'Harap masukan email dan passwordmu!')

Mobile.tap(findTestObject('Object Repository/Login/Ok_button'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Login/Harusdiisi_error_message'), 'Harus diisi')

Mobile.verifyElementText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_text'), 'Alamat Email atau Nomor HP')

Mobile.setText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_edit_text'), 'asd123@yopmail.com', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Login/KataSandi_text'), 'Kata Sandi')

Mobile.setText(findTestObject('Object Repository/Login/KataSandi_edit_text'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/Login/EyeSeeKataSandi_button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/MASUK_button'), 5)

Mobile.verifyElementText(findTestObject('Object Repository/Login/invalidusernameorpassword_text'), 'invalid username or password')

Mobile.tap(findTestObject('Object Repository/Login/Ok_button'), 0)

