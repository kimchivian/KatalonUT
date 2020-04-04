import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.Random

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.value_return
import org.junit.After

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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/UangTemanlogo'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Register/Versiterbarutelahtersedia_text'), 10)

Mobile.tap(findTestObject('Object Repository/Register/LainKali_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Create New Loan/PinjamanOnline_text'), 'Pinjaman Online')

Mobile.tap(findTestObject('Object Repository/Create New Loan/AjukanPinjaman_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Create New Loan/AjukanPinjaman_text'), 'Ajukan Pinjaman')

Mobile.tap(findTestObject('Object Repository/Create New Loan/SekaliBayar_Cicilan_toggle'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Ajukan Pinjaman/Cicilanhanyaberlaku_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Backto_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Create New Loan/BiayaLayanan_text'), 'Biaya Layanan')

int startXloan = Mobile.getElementLeftPosition(findTestObject('Object Repository/Create New Loan/SeekBar_tapandhold_loanamount'), 3)
int startYloan = Mobile.getElementTopPosition(findTestObject('Object Repository/Create New Loan/SeekBar_tapandhold_loanamount'), 3)
int endXloan = Mobile.getElementLeftPosition(findTestObject('Object Repository/Create New Loan/SeekBar_tapandhold_loanamount'), 3)
int endYloan = Mobile.getElementTopPosition(findTestObject('Object Repository/Create New Loan/SeekBar_tapandhold_loanamount'), 3)

//swipeLoan
startXloan = startXloan;
startYloan = startYloan;
endXloan = endXloan + 400;
endYloan = endYloan;

Mobile.swipe(startXloan, startYloan, endXloan, endYloan)

int startXtenure = Mobile.getElementLeftPosition(findTestObject('Object Repository/Create New Loan/Seekbar_tapandhold_tenure'), 3)
int startYtenure = Mobile.getElementTopPosition(findTestObject('Object Repository/Create New Loan/Seekbar_tapandhold_tenure'), 3)
int endXtenure = Mobile.getElementLeftPosition(findTestObject('Object Repository/Create New Loan/Seekbar_tapandhold_tenure'), 3)
int endYtenure = Mobile.getElementTopPosition(findTestObject('Object Repository/Create New Loan/Seekbar_tapandhold_tenure'), 3)

//swipeTenure
startXtenure = startXtenure;
startYtenure = startYtenure;
endXtenure = endXtenure + 200;
endYtenure = endYtenure;

Mobile.swipe(startXtenure, startYtenure, endXtenure, endYtenure)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Selanjutnya_button'), 10)

Mobile.verifyElementText(findTestObject('Object Repository/Create New Loan/AlasanPinjam_text'), 'Alasan Pinjam')

//loanReason
Random randNumber = new Random();
int reasonChoice = randNumber.nextInt(10-1+1)+1;

switch(reasonChoice) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pendidikan_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/PembelianKonsumen_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/MembayarHutang_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Liburan_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Lain-lain_radiobutton'), 10)
	break;
	
	case 6:Mobile.tap(findTestObject('Object Repository/Create New Loan/ModalUsaha_radiobutton'), 10)
	break;
	
	case 7:Mobile.tap(findTestObject('Object Repository/Create New Loan/TagihanMedis_radiobutton'), 10)
	break;
	
	break;
	
	case 9:
	Mobile.scrollToText("Pembelian Motor")
	Mobile.tap(findTestObject('Object Repository/Create New Loan/PembelianMotor_radiobutton'), 10)
	break;
	
	case 10:
	Mobile.scrollToText("Biaya Menikah")
	Mobile.tap(findTestObject('Object Repository/Create New Loan/BiayaMenikah_radiobutton'), 10)
	break;
	
}

if(reasonChoice==6){
	
	Random randNumberModal = new Random();
	int randNumberModalChoice = randNumberModal.nextInt(11-1+1)+1;
	
	switch(randNumberModalChoice){
		
		case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/PertanianPerburuan_radiobutton'), 10)
		break;
		
		case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/PertambangandanPenggalian_radiobutton'), 10)
		break;
		
		case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Perikanan_radiobutton'), 10)
		break;
		
		case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/IndustriPengolahan_radiobutton'), 10)
		break;
		
	}
	
}

Mobile.tap(findTestObject('Object Repository/Create New Loan/Selanjutnya_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/KelengkapanData_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/InformasiPribadi_gotosection'), 10)

