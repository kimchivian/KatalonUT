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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Rekening Bank/RekeningBank_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Rekening Bank/Harusdiisi_error_message'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaPemilikAkun_text'), 10)

//generateAccountName
Random randAccountName = new Random();
int randAccountNameChoice = randAccountName.nextInt(5-1+1)+1;

switch(randAccountNameChoice) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaPemilikAkun_edit_text'), 'Afifah', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaPemilikAkun_edit_text'), 'Bp Andi Nugroho', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaPemilikAkun_edit_text'), 'Phoebe Manthis', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaPemilikAkun_edit_text'), 'Jessica Gomes', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaPemilikAkun_edit_text'), 'Agus Ringgo', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaBank_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/PilihNamaBank_button'), 10)

//generateBankName
Random randBankName = new Random();
int randBankNameChoice = randBankName.nextInt(5-1+1)+1;

switch(randBankNameChoice) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaBankMandiri_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaBankBCA_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaBankBNI_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaBankBRI_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/NamaBankPermataBank_radiobutton'), 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Rekening Bank/NomorRekeningBank_text'), 10)

if(randBankNameChoice==1) {
	
	Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NomorRekeningBank_edit_text'), '1234123412345', 10)
	
} else if(randBankNameChoice==2) {

	Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NomorRekeningBank_edit_text'), '9876512340', 10)

} else if(randBankNameChoice==3) {

	Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NomorRekeningBank_edit_text'), '8877615132', 10)

} else if(randBankNameChoice==4) {

	Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NomorRekeningBank_edit_text'), '123412341234123', 10)

} else if(randBankNameChoice==5) {

	Mobile.setText(findTestObject('Object Repository/Create New Loan/Rekening Bank/NomorRekeningBank_edit_text'), '971005564', 10)

}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Rekening Bank/CheckBoxAgreement_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/CheckBoxAgreement_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Rekening Bank/SELANJUTNYA_button'), 10)
