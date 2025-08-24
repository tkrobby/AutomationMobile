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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import utils.generator as DataGenerator


// Simple generate random data
String PHONE_NUMBER = CustomKeywords.'utils.generator.generatePhoneNumber'()

//KeywordUtil.logInfo("NIK Simple: " + RANDOM_NIK)
String RANDOM_EMAIL = CustomKeywords.'utils.generator.generateEmail'('qamail.com')

KeywordUtil.logInfo("Generated email: " + RANDOM_EMAIL)

GlobalVariable.RANDOM_EMAIL_REGISTER = RANDOM_EMAIL

//Mobile.startApplication('APP/gvm-staging-waf.apk', false)
String ANDROID_APP = RunConfiguration.getProjectDir() + GlobalVariable.ANDROID_APK

Mobile.startApplication(ANDROID_APP, true)

Mobile.delay(2)

TestObject btnSelanjutnya = findTestObject('Object Repository/ONBOARDING/android.widget.Button')

for (int i = 0; i < 2; i++) {
    Mobile.tap(btnSelanjutnya, 0)

    Mobile.delay(2)
}

Mobile.tap(findTestObject('Object Repository/ONBOARDING/BUTTON_MASUK'), 0)

Mobile.tap(findTestObject('Object Repository/HOMEPAGE/android.widget.ImageViewProfile'), 0)

Mobile.tap(findTestObject('Object Repository/ONBOARDING/LINK_DAFTAR'), 0)

Mobile.setText(findTestObject('Object Repository/REGISTER_PAGE/android.widget.EditTextEmail'), RANDOM_EMAIL, 0)

Mobile.setText(findTestObject('Object Repository/REGISTER_PAGE/android.widget.EditTextNamaKTP'), DataGenerator.getRandomName(), 0)

Mobile.setText(findTestObject('Object Repository/REGISTER_PAGE/android.widget.EditTextNoHp'), PHONE_NUMBER, 0)

Mobile.setText(findTestObject('Object Repository/REGISTER_PAGE/android.widget.EditTextCreataPassword'), 'Indones1@', 0)

Mobile.setText(findTestObject('Object Repository/REGISTER_PAGE/android.widget.EditTextUlangiPassword'), 'Indones1@', 0)

Mobile.tap(findTestObject('Object Repository/REGISTER_PAGE/android.view.ViewButtonDaftar'), 0)

