import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/Pekerjaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/Harusdiisi_error_message'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/NamaPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/HelpNamaPerusahaan_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/HelpNamaPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/NamaKantor_edit_text'), 10)

//generateOfficeName
Random randOfficeNameNumber = new Random();
int randOfficeName = randOfficeNameNumber.nextInt(5-1)+1;

switch(randOfficeName) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NamaKantor_edit_text'), 'Digiasia Bios', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NamaKantor_edit_text'), 'Digital Alpha Indonesia', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NamaKantor_edit_text'), 'Pakuwon Headquarter', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NamaKantor_edit_text'), 'Jimbaran Selayu', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NamaKantor_edit_text'), 'GRATIs', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/NomorTeleponPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/NomorTeleponPerusahaan_edit_text'), 10)

//generateOfficePhone
Random randOfficePhoneNumber = new Random();
int randOfficePhone = randOfficePhoneNumber.nextInt(5-1)+1;

switch(randOfficePhone) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NomorTeleponPerusahaan_edit_text'), '0812199876541', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NomorTeleponPerusahaan_edit_text'), '087786788902', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NomorTeleponPerusahaan_edit_text'), '0813807099871', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NomorTeleponPerusahaan_edit_text'), '085666654325', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/NomorTeleponPerusahaan_edit_text'), '0852728100987', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/AlamatPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/AlamatPerusahaan_edit_text'), 10)

//generateOfficeAddress
Random randOfficeAddressNumber = new Random();
int randOfficeAddress = randOfficeAddressNumber.nextInt(5-1)+1;

switch(randOfficeAddress) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AlamatPerusahaan_edit_text'), 'Jl. Pakis Bambu VI No. 18', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AlamatPerusahaan_edit_text'), 'Jl. Casablanca 10 No. 8', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AlamatPerusahaan_edit_text'), 'Jl. Denpasar II Blok B No. 20', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AlamatPerusahaan_edit_text'), 'Jl. Malika Bango IV No. 10', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AlamatPerusahaan_edit_text'), 'Jl. Raya Merah Muda No. 3', 10)
	break;
	
}

Mobile.scrollToText('Provinsi Perusahaan')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/RT_text'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/RW_text'), 10)

//generateRTOffice
Random randRTOfficeNumber = new Random();
int randRTOffice = randRTOfficeNumber.nextInt(999-111)+1;

String generateRTOffice = randRTOffice.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/RT_edit_text'), generateRTOffice, 10)

//generateRWOffice
Random randRWOfficeNumber = new Random();
int randRWOffice = randRWOfficeNumber.nextInt(999-111)+1;

String generateRWOffice = randRWOffice.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/RW_edit_text'), generateRWOffice, 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/ProvinsiPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/PilihProvinsi_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/DKIJakarta_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/KotaPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/PilihKota_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/KotaJakartaSelatan_radiobutton'), 10)

Mobile.scrollToText('Kelurahan Perusahaan')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/KecamatanPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/PilihKecamatan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/KecamatanTebet_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/KelurahanPerusahaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/PilihKelurahan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/KelurahanTebetBarat_radiobutton'), 10)

Mobile.scrollToText('Jenis Pekerjaan')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/KodePosPerusahaan_text'), 10)

Mobile.verifyElementHasAttribute(findTestObject('Object Repository/Create New Loan/Pekerjaan/KodePosPerusahaan_edit_text'), 'text', 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/JenisPekerjaan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/PilihJenisPekerjaan_button'), 10)

//generateJob
Random randJobNumber = new Random();
int randJob = randJobNumber.nextInt(4-1)+1;

switch(randJob) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/JenisPekerjaanMarketing_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/JenisPekerjaanTeknologiinformasi_radiobutton'), 10)
	break;
	
	case 3:
	Mobile.scrollToText('Wiraswasta')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/JenisPekerjaanWiraswasta_radiobutton'), 10)
	break;
	
	case 4:
	Mobile.scrollToText('Pegawai Swasta')
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/JenisPekerjaanPegawaiSwasta_radiobutton'), 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/BidangIndustri_text'), 10)

if(randJob==3) {
	
	//generateJobField
	Random randJobFieldNumber = new Random();
	int randJobField = randJobFieldNumber.nextInt(6-1)+1;
	
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/PilihBidangIndustri_button'), 10)
	
	switch(randJobField) {
		
		case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/BidangIndustriPertanian_radiobutton'), 10)
		break;
		
		case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/BidangIndustriPerikanan_radiobutton'), 10)
		break;
		
		case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/BidangIndustriPerdaganganBesar_radiobutton'), 10)
		break;
		
		case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/BidangIndustriTransportasi_radiobutton'), 10)
		break;
		
		case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/BidangIndustriPenyediaanAkomodasi_radiobutton'), 10)
		break;
		
		case 6:Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/BidangIndustriKonstruksi_radiobutton'), 10)
		break;
		
	}
	
} 

Mobile.scrollToText('Posisi')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/Posisi_text'), 10)

//generateJobPosition
Random randJobPositionNumber = new Random();
int randJobPosition = randJobPositionNumber.nextInt(4-1)+1;

switch(randJobPosition) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/Posisi_edit_text'), 'Programmer', 10)
	break;

	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/Posisi_edit_text'), 'Manajer', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/Posisi_edit_text'), 'AVP HR', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/Posisi_edit_text'), 'Staff', 10)
	break;
	
}

Mobile.scrollToText('Penghasilan per Bulan')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/LamaBekerja_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/Tahun_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/Tahun3_radiobutton'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/Bulan_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/Bulan7_radiobutton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_text'), 10)

//generateSalaryperMonth
Random randSalaryperMonthNumber = new Random();
int randSalaryperMonth = randSalaryperMonthNumber.nextInt(4-1)+1;

switch(randSalaryperMonth) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_edit_text'), '7500000', 10)
	break;

	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_edit_text'), '12000000', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_edit_text'), '5760000', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_edit_text'), '15300000', 10)
	break;
	
}

Mobile.scrollToText('Angsuran KPR')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/PengeluaranperBulan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/HelpPengeluaranperBulan_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/HelpPengeluaranperBulan_text'), 10)

//generateSpendingperMonth
Random randSpendingperMonthNumber = new Random();
int randSpendingperMonth = randSpendingperMonthNumber.nextInt(4-1)+1;

switch(randSpendingperMonth) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PengeluaranperBulan_edit_text'), '3000000', 10)
	break;

	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_edit_text'), '1550000', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_edit_text'), '2400000', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/PenghasilanperBulan_edit_text'), '1100000', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/AngsuranKPR_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/HelpAngsuranKPR_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/HelpAngsuranKPR_text'), 10)

//generateInstallmentperMonth
Random randInstallmentperMonthNumber = new Random();
int randInstallmentperMonth = randInstallmentperMonthNumber.nextInt(4-1)+1;

switch(randInstallmentperMonth) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AngsuranKPR_edit_text'), '750000', 10)
	break;

	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AngsuranKPR_edit_text'), '1200000', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AngsuranKPR_edit_text'), '4000000', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/AngsuranKPR_edit_text'), '1000000', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/BerapaJumlahTanggunganmu_text'), 10)

//generateAmenability
Random randAmenabilityNumber = new Random();
int randAmenability = randAmenabilityNumber.nextInt(3-1)+1;

switch(randAmenability) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/BerapaJumlahTanggunganmu_edit_text'), '1', 10)
	break;

	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/BerapaJumlahTanggunganmu_edit_text'), '3', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Pekerjaan/BerapaJumlahTanggunganmu_edit_text'), '2', 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Pekerjaan/FotoSlipGaji_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/FotoSlipGaji_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/TakePicture_button'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Pekerjaan/SELANJUTNYA_button'), 10)
