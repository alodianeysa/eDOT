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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling


def validUsername = "Zhuanle_988"
def validPassword = "Zhuanlee1&"
def invalidUsername = "admin12_12"
def invalidPassword = "cobacoba1!"



Mobile.startApplication('C:\\Users\\Neysa\\Downloads\\eDOT_4.2.3_apkcombo.com.apk', false)

Mobile.tap(findTestObject('signin/btn_skip'), 0)
Mobile.tap(findTestObject('signin/btn_masuk_landing'), 0)
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)


def loopCount = 2
def iteration = 1


while (iteration <= loopCount) {
	
	
	def currentUsername
	def currentPassword
	if (iteration == 1) {
		currentUsername = invalidUsername
		currentPassword = invalidPassword
	} else if (iteration == 1) {
		currentUsername = validUsername
		currentPassword = invalidPassword
	} else {
		currentUsername = validUsername
		currentPassword = validPassword
	}
	
	Mobile.setText(findTestObject('signin/txt_username'), currentUsername, 0)
	Mobile.setText(findTestObject('signin/txt_pass'), currentPassword, 0)
	
	'check captcha'
	Mobile.tap(findTestObject('signin/btn_captcha'), 0)
	Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.tap(findTestObject('signin/btn_masuk'), 0)
	Mobile.delay(5)
	
	// Lakukan langkah-langkah sesuai kebutuhan setelah login
	
	iteration++
}
	//Mobile.closeApplication()
'user input username'
Mobile.setText(findTestObject('signin/txt_username'), 'Zhuanlee_988', 0)

'user input password'
Mobile.setText(findTestObject('signin/txt_pass'), 'Zhuanlee1&', 0)

'check captcha'
Mobile.tap(findTestObject('signin/btn_captcha'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('signin/btn_masuk'), 0)

//'success login'
Mobile.verifyElementVisible(findTestObject('signin/verif_landingpage'), 0)

