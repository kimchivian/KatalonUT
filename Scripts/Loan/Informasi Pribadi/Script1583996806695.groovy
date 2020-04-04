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

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Apaalamatemailmu_text'), 10)

Mobile.scrollToText('Pendidikan Terakhir Kamu')

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/SELANJUTNYA_button'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Harusdiisi_errormessage'), 10)

Mobile.scrollToText('Apa alamat emailmu?')

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Apaalamatemailmu_text'), 10)

Mobile.verifyElementHasAttribute(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Apaalamatemailmu_edit_text'), 'text', 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NomorTelepon_text'), 10)

Mobile.verifyElementHasAttribute(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NomorTelepon_edit_text'), 'text', 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NomorKTP_text'), 10)

Random randTest = new Random();
for(int i=0;i<10;i++){
	int randTestj = randTest.nextInt(2-1+1)+1;
	println (randTestj);
}

//generateKTP
Random randNumberID = new Random();
int generateID1 = randNumberID.nextInt(9999-1111+1)+1;
int generateID2 = randNumberID.nextInt(9999-1111+1)+1;
int generateID3 = randNumberID.nextInt(9999-1111+1)+1;
int generateID4 = randNumberID.nextInt(9999-1111+1)+1;

String KTP = generateID1.toString()+generateID2.toString()+generateID3.toString()+generateID4.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NomorKTP_edit_text'), KTP, 10)

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NPWP_text'), 10)

//generateNPWP
Random randNumberNPWP = new Random();
int generateNPWP1 = randNumberNPWP.nextInt(99999-11111+1)+1;
int generateNPWP2 = randNumberNPWP.nextInt(99999-11111+1)+1;
int generateNPWP3 = randNumberNPWP.nextInt(99999-11111+1)+1;

String NPWP = generateNPWP1.toString()+generateNPWP2.toString()+generateNPWP3.toString();

Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NPWP_edit_text'), NPWP, 10)

Mobile.scrollToText("Jenis kelamin")

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaLengkap_text'), 10)

Random randName = new Random();
int randNameChoice = randName.nextInt(5-1+1)+1;

switch(randNameChoice) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaLengkap_edit_text'), 'Afifah', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaLengkap_edit_text'), 'Bp Andi Nugroho', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaLengkap_edit_text'), 'Phoebe Manthis', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaLengkap_edit_text'), 'Jessica Gomes', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaLengkap_edit_text'), 'Agus Ringgo', 10)
	break;
	
}

Mobile.scrollToText("Jenis kelamin")

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Jeniskelamin_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Jeniskelamin_edit_text'), 10)

//genderPicker
Random randNumberGender = new Random();
int randGenderPicker = randNumberGender.nextInt(2-1+1)+1;

switch(randGenderPicker){
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Lakilaki_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Perempuan_radiobutton'), 10)
	break;
	
}

Mobile.scrollToText("Tempat lahir")

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tempatlahir_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tempatlahir_edit_text'), 10)

//birthPlace
Random randBirthPlace = new Random();
int randBirthPlaceChoice = randBirthPlace.nextInt(5-1+1)+1;

switch(randBirthPlaceChoice){
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tempatlahir_edit_text'), 'Jakarta', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tempatlahir_edit_text'), 'Bogor', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tempatlahir_edit_text'), 'Depok', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tempatlahir_edit_text'), 'Bekasi', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tempatlahir_edit_text'), 'Tangerang', 10)
	break;
	
}

Mobile.pressBack()

Mobile.scrollToText("Tanggal lahir")

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tanggallahir_text'), 10)

//birthYear
Random randNumberBirthYear = new Random();
int randBirthYear = randNumberBirthYear.nextInt(2002-1980+1)+1;

//birthMonth
Random randNumberBirthMonth = new Random();
int randBirthMonth = randNumberBirthMonth.nextInt(12-1+1)+1;

//birthDate
Random randNumberBirthDate = new Random();
int randBirthDate = randNumberBirthDate.nextInt(28-1+1)+1;

String Date = randBirthDate.toString() + "-" + randBirthMonth.toString() + "-" + randBirthYear.toString();

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Tanggallahir_edit_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Year_button'), 10)

for(int i=0;i<randBirthMonth/2;i++){
	Mobile.swipe(500, 1500, 500, 1000)
}
	Mobile.tapAtPosition(500, 1500)

for(int i=0;i<randBirthMonth;i++){
	Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NextDatePickerButton'), 10)
}

Random randDeviceNumber = new Random();

int DateX = randDeviceNumber.nextInt(3-1+1)+1;
int DateY = randDeviceNumber.nextInt(5-1+1)+1;
int deviceheight=Mobile.getDeviceHeight()/2;
int devicewidth= Mobile.getDeviceWidth()/2;

Mobile.tapAtPosition(DateX*50+devicewidth, DateY*100+deviceheight)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/OK_button_dateofbirth'), 10)

Mobile.scrollToText("Agama")

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Agama_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Agama_edit_text'), 10)

//selectReligion
Random randNumberReligion = new Random();
int randReligion = randNumberReligion.nextInt(6-1+1)+1;

switch(randReligion){
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Islam_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Kristenprotestan_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Kristenkatolik_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Budha_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Hindu_radiobutton'), 10)
	break;
	
	case 6:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Konghucu_radiobutton'), 10)
	break;
	
}

Mobile.scrollToText("Status Pernikahan")

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/StatusPernikahan_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/StatusPernikahan_edit_text'), 10)

//selectMartialStatus
Random randNumberMaritalStatus = new Random();
int randMaritalStatus = randNumberMaritalStatus.nextInt(5-1+1)+1;

switch(randMaritalStatus){
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Lajang_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Duda_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Bercerai_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Menikah_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/Janda_radiobutton'), 10)
	break;
	
}

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaGadisIbuKandung_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaGadisIbuKandung_edit_text'), 10)

//randomMotherMaidenName
Random randNumberMotherMaidenName = new Random();
int randMotherMaidenName = randNumberMotherMaidenName.nextInt(5-1+1)+1;

switch(randMotherMaidenName) {
	
	case 1:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaGadisIbuKandung_edit_text'), 'Ummi Hanifah', 10)
	break;
	
	case 2:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaGadisIbuKandung_edit_text'), 'Erica Lim', 10)
	break;
	
	case 3:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaGadisIbuKandung_edit_text'), 'Tania Twain', 10)
	break;
	
	case 4:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaGadisIbuKandung_edit_text'), 'Romlah', 10)
	break;
	
	case 5:Mobile.setText(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/NamaGadisIbuKandung_edit_text'), 'Sarah Gomes', 10)
	break;
	
}

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/PendidikanTerakhirKamu_text'), 10)

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/PendidikanTerakhirKamu_edit_text'), 10)

Random randNumberEducation = new Random();
int randEducation = randNumberEducation.nextInt(9-1+1)+1;

switch(randEducation) {
	
	case 1:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/SD_radiobutton'), 10)
	break;
	
	case 2:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/SLTP_radiobutton'), 10)
	break;
	
	case 3:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/SLTA_radiobutton'), 10)
	break;
	
	case 4:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/DIPLOMA I_radiobutton'), 10)
	break;
	
	case 5:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/DIPLOMA II_radiobutton'), 10)
	break;
	
	case 6:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/DIPLOMA III_radiobutton'), 10)
	break;
	
	case 7:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/S1_radiobutton'), 10)
	break;
	
	case 8:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/S2_radiobutton'), 10)
	break;
	
	case 9:Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/S3_radiobutton'), 10)
	break;
}

Mobile.tap(findTestObject('Object Repository/Create New Loan/Informasi Pribadi/SELANJUTNYA_button'), 10)
