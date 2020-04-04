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

Mobile.verifyElementText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_text'), 'Alamat Email atau Nomor HP')

Mobile.clearText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_edit_text'), 'hamburger4@yopmail.com', 30)

Mobile.verifyElementText(findTestObject('Object Repository/Login/KataSandi_text'), 'Kata Sandi')

Mobile.clearText(findTestObject('Object Repository/Login/KataSandi_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Login/KataSandi_edit_text'), 'testing', 30)

Mobile.tap(findTestObject('Object Repository/Login/MASUK_button'), 5)

