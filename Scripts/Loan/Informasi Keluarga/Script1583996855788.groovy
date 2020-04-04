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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/InformasiKeluarga_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/Harusdiisi_error_message'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/Hubungan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihHubungan_button'), 10)

//generateRelationship
Random randNumberRelationship = new Random();
int randRelationship = randNumberRelationship.nextInt(4-1+1)+1;

switch(randRelationship) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihHubunganOrangTua_button'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihHubunganSaudaraKandung_button'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihHubunganSuamiIstri_button'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihHubunganAnak_button'), 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/NamaKeluargaSaudara_text'), 10)

//generateFamilyName
Random randNumberFamilyName = new Random();
int randFamilyName = randNumberFamilyName.nextInt(4-1+1)+1;

switch(randFamilyName) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/NamaKeluargaSaudara_edit_text'), 'Bp Sanusi', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/NamaKeluargaSaudara_edit_text'), 'Ibu Aminah', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/NamaKeluargaSaudara_edit_text'), 'Bp Sutaryo Wicaksono', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/NamaKeluargaSaudara_edit_text'), 'Ibu Erica Lim', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/No.TeleponKeluargaSaudara_text'), 10)

//generateFamilyPhone
Random randFamilyPhoneNumber = new Random();
int randFamilyPhone = randFamilyPhoneNumber.nextInt(5-1)+1;

switch(randFamilyPhone) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/No.TeleponKeluargaSaudara_text'), '0859786545532', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/No.TeleponKeluargaSaudara_text'), '0877867909021', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/No.TeleponKeluargaSaudara_text'), '0813606099871', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/No.TeleponKeluargaSaudara_text'), '085096554325', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/No.TeleponKeluargaSaudara_text'), '085299995421', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/AlamatTempatTinggalKeluarga_text'), 10)

//generateFamilyAddress
Random randFamilyAddressNumber = new Random();
int randFamilyAddress = randFamilyAddressNumber.nextInt(5-1)+1;

switch(randFamilyAddress) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Blora Raya No. 10', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Hamengkubowono X No. 5', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Tytyan Kencana II', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. Harapan Indah Cluster', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/AlamatTempatTinggalKeluarga_edit_text'), 'Jl. I Gusti Ngurah Rai', 10)
	break;
	
}

Mobile.scrollToText('Kota Tempat Tinggal Keluarga')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/RT_text'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/RW_text'), 10)

//generateRTFamily
Random randRTFamilyNumber = new Random();
int randRTFamily = randRTFamilyNumber.nextInt(999-111)+1;

String generateRTFamily = randRTFamily.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/RT_edit_text'), generateRTFamily, 10)

//generateRWFamily
Random randRWFamilyNumber = new Random();
int randRWFamily = randRWFamilyNumber.nextInt(999-111)+1;

String generateRWFamily = randRWFamily.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/RW_edit_text'), generateRWFamily, 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/ProvinsiTempat_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihProvinsi_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/DKIJakarta_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KotaTempat_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihKota_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KotaJakartaPusat_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KecamatanTempat_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihKecamatan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KecamatanMenteng_radiobutton'), 10)

Mobile.scrollToText('Foto KK untuk pencairan lebih cepat')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KelurahanTempat_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/PilihKelurahan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KelurahanMenteng_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KodePosTempat_text'), 10)

Mobile.verifyElementHasAttribute(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/KodePosTempat_edit_text'), 'text', 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/FotoKKuntuk_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/FotoKK_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/TakePicture_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Keluarga/SELANJUTNYA_button'), 10)