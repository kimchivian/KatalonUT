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

Mobile.startApplication('APK/clnt_5_6_092542a7_staging.apk', false)

Mobile.verifyElementExist(findTestObject('Object Repository/Login/UangTeman_logo'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Login/Versiterbarutelahtersedia_text'), 30)

Mobile.tap(findTestObject('Object Repository/Login/LainKali_button'), 30)

Mobile.tap(findTestObject('Object Repository/Create New Loan/AjukanPinjaman_button'), 30)

Mobile.tap(findTestObject('Object Repository/Login/HamburgerBar_button'), 30)

Mobile.tap(findTestObject('Object Repository/Login/LoginNasabah_button'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_text'), 'Alamat Email atau Nomor HP')

Mobile.clearText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Login/AlamatEmailatauNomorHP_edit_text'), 'irauan@yopmail.com', 30)

Mobile.verifyElementText(findTestObject('Object Repository/Login/KataSandi_text'), 'Kata Sandi')

Mobile.clearText(findTestObject('Object Repository/Login/KataSandi_edit_text'), 30)

Mobile.setText(findTestObject('Object Repository/Login/KataSandi_edit_text'), 'yFeZ177s', 30)

Mobile.tap(findTestObject('Object Repository/Login/MASUK_button'), 30)

Mobile.tap(findTestObject('Object Repository/Ajukan Pinjaman/PINJAMSEKARANG_button'), 0)

int x1 = Mobile.getElementLeftPosition(findTestObject('Ajukan Pinjaman/Jumlah Pinjaman'), 0)
int y1 = Mobile.getElementTopPosition(findTestObject('Ajukan Pinjaman/Jumlah Pinjaman'), 0)

x1 = x1+200;
y1 = y1;

Mobile.tapAtPosition(x1,y1)

int x2 = Mobile.getElementLeftPosition(findTestObject('Ajukan Pinjaman/Durasi Pinjaman'), 0)
int y2 = Mobile.getElementTopPosition(findTestObject('Ajukan Pinjaman/Durasi Pinjaman'), 0)

x1 = x1+20;
y1 = y1;

Mobile.tapAtPosition(x2, y2)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 0)

int x3 = Mobile.getElementLeftPosition(findTestObject('Ajukan Pinjaman/Pendidikan Text'), 0)
int y3 = Mobile.getElementTopPosition(findTestObject('Ajukan Pinjaman/Pendidikan Text'), 0)

x3 = x3+950;
y3 = y3;

Mobile.tapAtPosition(x3, y3)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Arrow Informasi Pribadi'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

int x4 = Mobile.getElementLeftPosition(findTestObject('Ajukan Pinjaman/Penyataan Rekening Bank'), 30)
int y4 = Mobile.getElementTopPosition(findTestObject('Ajukan Pinjaman/Penyataan Rekening Bank'), 30)

x4 = x4+5;
y4 = y4+5;

Mobile.tapAtPosition(x4, y4)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.delay(5)

int devicewidth = Mobile.getDeviceWidth()
int deviceheight = Mobile.getDeviceHeight()
int x5
int y5
int x6
int y6

x5 = devicewidth/2;
y5 = deviceheight-750;
x6 = x5;
y6 = deviceheight-1600;

Mobile.swipe(x5, y5, x6, y6)

Mobile.scrollToText('Foto KTP / Selfie / Video')

Mobile.tap(findTestObject('Ajukan Pinjaman/Foto KTP  Selfie  Video'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Upload Video Kamu'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Upload Video Diri'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Ajukan Pinjaman/Emailverifikasisudahdikirim_text'), 30)

Mobile.tap(findTestObject('Object Repository/Ajukan Pinjaman/Ok_button'), 30)

Mobile.delay(60)

Mobile.verifyElementText(findTestObject('Object Repository/Ajukan Pinjaman/RekamWajah_text'), 'Rekam Wajah')

Mobile.tap(findTestObject('Object Repository/Ajukan Pinjaman/AktifkanKamera_button'), 30)

Mobile.delay(60)

Mobile.verifyElementExist(findTestObject('Object Repository/Ajukan Pinjaman/UploadVideoSelesai_text'), 30)

Mobile.tap(findTestObject('Object Repository/Ajukan Pinjaman/Ok_button'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Selanjutnya'), 30)

Mobile.tap(findTestObject('Ajukan Pinjaman/Proses Peminjaman'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Ajukan Pinjaman/RincianPinjaman_text'), 'Rincian Pinjaman')

Mobile.scrollToText('Data Debitur')

Mobile.verifyElementText(findTestObject('Object Repository/Ajukan Pinjaman/DataDebitur_text'), 'Data Debitur')

Mobile.scrollToText('Lihat Perjanjian Secara Lengkap')

Mobile.tap(findTestObject('Object Repository/Ajukan Pinjaman/LihatPerjanjianSecaraLengkap_button'), 30)

Mobile.tap(findTestObject('Object Repository/Ajukan Pinjaman/SELANJUTNYA_button'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Ajukan Pinjaman/Informasi_text'), 30)

Mobile.tap(findTestObject('Object Repository/Ajukan Pinjaman/Ok_button'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Ajukan Pinjaman/StatusPinjamankamu_text'), 'Status Pinjaman kamu')

Mobile.verifyElementText(findTestObject('Object Repository/Ajukan Pinjaman/Masihdalamprosesverifikasi_text'), 30)

Mobile.tap(findTestObject('Object Repository/Login/HamburgerBar_button'), 30)

Mobile.scrollToText('Log Out')

Mobile.tap(findTestObject('Object Repository/Login/LogOut_button'), 30)

Mobile.closeApplication()




