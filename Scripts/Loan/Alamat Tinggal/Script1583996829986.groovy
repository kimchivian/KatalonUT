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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/Jabodetabek_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/Tidak_radiobutton'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/Maaf ya Teman_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/Sayamengerti_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat_gotosection'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/Jabodetabek_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/Iya_radiobutton'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/AlamatTinggal_text'), 10)

Mobile.scrollToText('Alamat Tempat Tinggal')

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/Harusdiisi_error_message'), 10)

Mobile.scrollToText('No. Telepon Tempat Tinggal')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/No.TeleponTempatTinggal_text'), 10)

//generateHomeNumber
Random randHomeNumber = new Random();
int randKodeArea = randHomeNumber.nextInt(999-111)+1;
int randNoTelpon = randHomeNumber.nextInt(999999-111111)+1;

String kodeArea = randKodeArea.toString();
String homeNumber = randNoTelpon.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/KodeArea_edit_text'), kodeArea, 10)

Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/NomorTelepon_edit_text'), homeNumber, 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/StatusTempatTinggalKamu_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/PilihStatusRumah_edit_text'), 10)

//generateHomeStatus
Random randHomeStatusNumber = new Random();
int randHomeStatus = randHomeStatusNumber.nextInt(5-1)+1;

switch(randHomeStatus) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/RumahOrangTua_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/Kontrak_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/RumahSendiri_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/Kos_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/RumahDinas_radiobutton'), 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/AlamatTempatTinggal_text'), 10)

//generateAddress
Random randAddressNumber = new Random();
int randAddress = randAddressNumber.nextInt(5-1)+1;

switch(randAddress) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/AlamatTempatTinggal_edit_text'), 'Jl. Pakis Raya No. 56', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/AlamatTempatTinggal_edit_text'), 'Jl. Casablanca 88 No. 8', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/AlamatTempatTinggal_edit_text'), 'Jl. Ichiban Sushi Ramenya', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/AlamatTempatTinggal_edit_text'), 'Jl. Sheirokya XX No. 21', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/AlamatTempatTinggal_edit_text'), 'Jl. Edamame No. I4', 10)
	break;
	
}

Mobile.scrollToText('Provinsi Tempat Tinggal')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/RT_text'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/RW_text'), 10)

//generateRT
Random randRTNumber = new Random();
int randRT = randRTNumber.nextInt(999-111)+1;

String generateRT = randRT.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/RT_edit_text'), generateRT, 10)

//generateRW
Random randRWNumber = new Random();
int randRW = randRWNumber.nextInt(999-111)+1;

String generateRW = randRW.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Alamat/RW_edit_text'), generateRW, 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/ProvinsiTempatTinggal_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/PilihProvinsi_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/DKIJakarta_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/KotaTempatTinggal_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/PilihKota_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KotaJakartaPusat_radiobutton'), 10)

////chooseCity
//Random randChooseCity = new Random();
//int chooseCity = randChooseCity.nextInt(2-1)+1;
//
//switch(chooseCity) {
//	
//	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KotaJakartaPusat_radiobutton'), 10)
//	break;
//	
//	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KotaJakartaSelatan_radiobutton'), 10)
//	break;
//	
//}

//chooseDistrict
//Random randChooseDistrict = new Random();
//int chooseDistrict = randChooseDistrict.nextInt(2-1)+1;

Mobile.scrollToText('Kelurahan Tempat Tinggal')

Mobile.doubleTap(findTestObject('Object Repository/Create New Loan/Alamat/PilihKecamatan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KecamatanMenteng_radiobutton'), 10)

//if(chooseCity==1) {
//			
//	switch(chooseDistrict) {
//		
//		case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KecamatanKemayoran_radiobutton'), 10)
//		break;
//		
//		case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KecamatanMenteng_radiobutton'), 10)
//		break;
//			
//	}
//	
//} else if (chooseCity==2) {
//
//	switch(chooseDistrict) {
//	
//		case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KecamatanMampangPrapatan_radiobutton'), 10)
//		break;
//	
//		case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KecamatanTebet_radiobutton'), 10)
//		break;
//
//	}
//
//}
//
////chooseSubDistrict
//Random randChooseSubDistrict = new Random();
//int chooseSubDistrict = randChooseSubDistrict.nextInt(3-1)+1;

Mobile.doubleTap(findTestObject('Object Repository/Create New Loan/Alamat/PilihKelurahan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanMenteng_radiobutton'), 10)

//if(chooseDistrict==1) {
//	
//	switch(chooseSubDistrict) {
//		
//		case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanGunungSahariSelatan_radiobutton'), 10)
//		break;
//
//		case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanKebonKosong_radiobutton'), 10)
//		break;
//		
//		case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanKemayoran_radiobutton'), 10)
//		break;
//		
//	}
//	
//} else if(chooseDistrict==2) {
//
//	switch(chooseSubDistrict) {
//		
//		case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanCikini_radiobutton'), 10)
//		break;
//		
//		case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanKebonSirih_radiobutton'), 10)
//		break;
//		
//		case 6:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanMenteng_radiobutton'), 10)
//		break;
//		
//	}
//
//} else if(chooseDistrict==3) {
//
//	switch(chooseSubDistrict) {
//	
//		case 7:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanBangka_radiobutton'), 10)
//		break;
//		
//		case 8:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanMampangPrapatan_radiobutton'), 10)
//		break;
//		
//		case 9:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanTegalParang_radiobutton'), 10)
//		break;
//		
//	}
//
//} else if(chooseDistrict==4) {
//
//	switch(chooseSubDistrict) {
//		
//		case 10:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanManggarai_radiobutton'), 10)
//		break;
//		
//		case 11:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanTebetBarat_radiobutton'), 10)
//		break;
//		
//		case 12:Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/KelurahanTebetTimur_radiobutton'), 10)
//		break;
//		
//	}
//
//}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Alamat/KodePosTempatTinggal_text'), 10)

Mobile.verifyElementHasAttribute(findTestObject('Object Repository/Create New Loan/Alamat/KodePosTempatTinggal_edit_text'), 'text', 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Alamat/SELANJUTNYA_button'), 10)