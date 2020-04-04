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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Lainnya/Lainnya_text'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Lainnya/DarimanakamutahuUangTeman_text'), 10)

//generateOthersChoice
Random randOthersChoice = new Random();
int randOthers = randOthersChoice.nextInt(15-1+1)+1;

switch(randOthers) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Google_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Facebook_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Twitter_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Email_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Radio_radiobutton'), 10)
	break;
	
	case 6:Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/ReferensiTemanKerabat_radiobutton'), 10)
	break;
	
	case 7:
	Mobile.scrollToText('Billboard')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Billboard_radiobutton'), 10)
	break;
	
	case 8:
	Mobile.scrollToText('Others')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Others_radiobutton'), 10)
	break;
	
	case 9:
	Mobile.scrollToText('SMS')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/SMS_radiobutton'), 10)
	break;
	
	case 10:
	Mobile.scrollToText('Instagram')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Instagram_radiobutton'), 10)
	break;
	
	case 11:
	Mobile.scrollToText('Brosur')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Brosur_radiobutton'), 10)
	break;
	
	case 12:
	Mobile.scrollToText('Bioskop')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/Bioskop_radiobutton'), 10)
	break;
	
	case 13:
	Mobile.scrollToText('Iklan Banner di Aplikasi Mobile')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/IklanBannerdiAplikasiMobile_radiobutton'), 10)
	break;
	
	case 14:
	Mobile.scrollToText('Iklan Banner di suatu Website')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/IklanBannerdisuatuWebsite_radiobutton'), 10)
	break;
	
}

Mobile.tap(findTestObject('Object Repository/Create New Loan/Lainnya/SELANJUTNYA_button'), 10)