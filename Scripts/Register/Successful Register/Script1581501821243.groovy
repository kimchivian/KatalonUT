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

Mobile.verifyElementText(findTestObject('Object Repository/Register/Nomorteleponkamu_text'), 'Nomor telepon kamu')

Mobile.clearText(findTestObject('Object Repository/Register/Nomorteleponkamu_edit_text'), 30)

//generatePhoneNumber
Random randPhoneNum = new Random();
int generatePhoneNumber1 = randPhoneNum.nextInt(9999-1+1)+1;
int generatePhoneNumber2 = randPhoneNum.nextInt(9999-1+1)+1;
int generatePhoneNumber3 = randPhoneNum.nextInt(999-1+1)+1;

String PhoneNumber = 0+generatePhoneNumber1.toString()+generatePhoneNumber2.toString()+generatePhoneNumber3.toString();

Mobile.setText(findTestObject('Object Repository/Register/Nomorteleponkamu_edit_text'), PhoneNumber, 30)

Mobile.verifyElementText(findTestObject('Object Repository/Register/Apaalamatemailkamu_text'), 'Apa alamat email kamu?')

Mobile.clearText(findTestObject('Object Repository/Register/Apaalamatemailkamu_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Register/Apaalamatemailkamu_edit_text'), "abba123@yopmail.com", 30)

Mobile.scrollToText('Konfirmasi Password')

Mobile.verifyElementText(findTestObject('Object Repository/Register/Password_text'), 'Password')

Mobile.clearText(findTestObject('Object Repository/Register/Password_edit_text'), 30)

//randomPassword
Random randNumberPassword = new Random();
int randPassword = randNumberPassword.nextInt(2-1+1)+1;

switch(randPassword) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Register/Password_edit_text'), 'testing', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Register/Password_edit_text'), '12312345', 10)
	break;
	
}

Mobile.tap(findTestObject('Object Repository/Register/EyeSeeKataSandi_button'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Register/KonfirmasiPassword_text'), 'Konfirmasi Password')

Mobile.clearText(findTestObject('Object Repository/Register/KonfirmasiPassword_edit_text'), 30)

if(randPassword==1) {
	
	Mobile.setText(findTestObject('Object Repository/Register/KonfirmasiPassword_edit_text'), 'testing', 10)
	
} else if(randPassword==2) {

	Mobile.setText(findTestObject('Object Repository/Register/KonfirmasiPassword_edit_text'), '12312345', 10)

}

Mobile.tap(findTestObject('Object Repository/Register/EyeSeeKataSandi_button'), 30)

Mobile.tap(findTestObject('Object Repository/Register/DAFTAR_button'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Register/RegistrasiBerhasil_text'), 30)

Mobile.tap(findTestObject('Object Repository/Register/OK_button (1)'), 30)

Mobile.tap(findTestObject('Object Repository/Register/HamburgerBar_button'), 30)

Mobile.scrollToText('Log Out')

Mobile.tap(findTestObject('Object Repository/Register/LogOut_button'), 30)