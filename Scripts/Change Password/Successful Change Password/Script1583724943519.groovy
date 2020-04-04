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

Mobile.verifyElementText(findTestObject('Object Repository/Change Password/Katasandisaatini_text'), 'Kata sandi saat ini')

Mobile.clearText(findTestObject('Object Repository/Change Password/Katasandisaatini_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Change Password/Katasandisaatini_edit_text'), '', 30)

Mobile.delay(60)

Mobile.tap(findTestObject('Object Repository/Change Password/EyeKataSandi_katasandisaatini'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Change Password/Katasandibaru_text'), 'Kata sandi baru')

Mobile.clearText(findTestObject('Object Repository/Change Password/Katasandibaru_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Change Password/Katasandibaru_edit_text'), 'testing', 30)

Mobile.tap(findTestObject('Object Repository/Change Password/EyeKataSandi_katasandibaru'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Change Password/Konfirmasikatasandi_text'), 'Konfirmasi kata sandi')

Mobile.clearText(findTestObject('Object Repository/Change Password/Konfirmasikatasandi_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Change Password/Konfirmasikatasandi_edit_text'), 'testing', 30)

Mobile.tap(findTestObject('Object Repository/Change Password/EyeKataSandi_konfirmasikatasandi'), 30)

Mobile.tap(findTestObject('Object Repository/Change Password/GANTIKATASANDI_button'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Change Password/KataSandiBerhasilDiganti_text'), 'Kata Sandi Berhasil Diganti')

Mobile.tap(findTestObject('Object Repository/Change Password/OK_button_katasandiberhasil'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Change Password/PinjamanOnline_text'), 'Pinjaman Online')

Mobile.tap(findTestObject('Object Repository/Change Password/HamburgerBar_button'), 30)

Mobile.scrollToText('Log Out')

Mobile.tap(findTestObject('Object Repository/Change Password/LogOut_button'), 30)
