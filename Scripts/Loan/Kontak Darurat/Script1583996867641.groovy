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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KontakDarurat_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/Harusdiisi_error_message'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/Hubungan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/PilihHubungan_button'), 10)

//generateEmergencyRelationship
Random randNumberEmergencyRelationship = new Random();
int randEmergencyRelationship = randNumberEmergencyRelationship.nextInt(7-1+1)+1;

switch(randEmergencyRelationship) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HubunganOrangTua_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HubunganSaudaraKandung_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HubunganSuamiIstri_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HubunganAnak_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HubunganPamanBibi_radiobutton'), 10)
	break;
	
	case 6:Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HubunganSepupu_radiobutton'), 10)
	break;
	
	case 7:Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HubunganKeponakan_radiobutton'), 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/NamaKeluargaSaudara_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HelpNamaKeluargaSaudara_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HelpNamaKeluargaSaudara_text'), 10)

//generateEmergencyFamilyName
Random randNumberEmergencyFamilyName = new Random();
int randEmergencyFamilyName = randNumberEmergencyFamilyName.nextInt(4-1+1)+1;

switch(randEmergencyFamilyName) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/NamaKeluargaSaudara_edit_text'), 'Ahmad Bachrudin', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/NamaKeluargaSaudara_edit_text'), 'Niko Iskandar', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/NamaKeluargaSaudara_edit_text'), 'Lasita Kharina', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/NamaKeluargaSaudara_edit_text'), 'Masayu Halimah', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/No.TeleponKeluargaSaudara_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HelpNo.TeleponKeluargaSaudara_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/HelpNo.TeleponKeluargaSaudara_text'), 10)

//generateEmergencyFamilyPhone
Random randNumberEmergencyFamilyPhone = new Random();
int randEmergencyFamilyPhone = randNumberEmergencyFamilyPhone.nextInt(4-1+1)+1;

switch(randEmergencyFamilyPhone) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/No.TeleponKeluargaSaudara_edit_text'), '085689897654', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/No.TeleponKeluargaSaudara_edit_text'), '0812377876153', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/No.TeleponKeluargaSaudara_edit_text'), '0878777777890', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/No.TeleponKeluargaSaudara_edit_text'), '083599998654', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/AlamatTempatTinggalKeluarga_text'), 10)

//generateEmergencyFamilyAddress
Random randNumberEmergencyFamilyAddress = new Random();
int randEmergencyFamilyAddress = randNumberEmergencyFamilyAddress.nextInt(4-1+1)+1;

switch(randEmergencyFamilyAddress) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Paseban Baru Dalam II', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Kramat Jati X No. 11', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Salemba Raya No. 49', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Jatinegara Baru Blok C No. 1', 10)
	break;
	
}

Mobile.scrollToText('Kota Tempat Tinggal Keluarga')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/RT_text'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/RW_text'), 10)

//generateRTEmergencyFamily
Random randRTEmergencyFamilyNumber = new Random();
int randRTEmergencyFamily = randRTEmergencyFamilyNumber.nextInt(999-111)+1;

String generateRTEmergencyFamily = randRTEmergencyFamily.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/RT_edit_text'), generateRTEmergencyFamily, 10)

//generateRWEmergencyFamily
Random randRWEmergencyFamilyNumber = new Random();
int randRWEmergencyFamily = randRWEmergencyFamilyNumber.nextInt(999-111)+1;

String generateRWEmergencyFamily = randRWEmergencyFamily.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Kontak Darurat/RW_edit_text'), generateRWEmergencyFamily, 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/ProvinsiTempatTinggalKeluarga_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/PilihProvinsi_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/DKIJakarta_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KotaTempatTinggalKeluarga_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/PilihKota_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KotaJakartaSelatan_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KecamatanTempatTinggalKeluarga_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/PilihKecamatan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KecamatanMampangPrapatan_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KelurahanTempatTinggalKeluarga_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/PilihKelurahan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KelurahanMampangPrapatan_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KodePosTempatTinggalKeluarga_text'), 10)

Mobile.verifyElementHasAttribute(findTestObject('Object Repository/Create New Loan/Kontak Darurat/KodePosTempatTinggalKeluarga_edit_text'), 'text', 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Kontak Darurat/SELANJUTNYA_button'), 10)