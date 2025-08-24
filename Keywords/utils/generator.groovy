package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class generator {
	private static Random rand = new Random()
	
		@Keyword
		def String generatePhoneNumber() {
			// Prefix nomor Indonesia biasanya 08
			String prefix = "8"
	
			// Panjang total nomor (misalnya 12 digit)
			int totalLength = 12
	
			// Sisa digit yang perlu di-generate
			int remainingLength = totalLength - prefix.length()
	
			StringBuilder phone = new StringBuilder(prefix)
	
			Random rand = new Random()
	
			for (int i = 0; i < remainingLength; i++) {
				phone.append(rand.nextInt(10)) // generate angka 0-9
			}
	
			return phone.toString()
		}
	
		@Keyword
		def static String getRandomName() {
			// List name
			String[] firstNames = [
				"Adi",
				"Johen",
				"Citra",
				"DevaTest",
				"Eko",
				"Farah",
				"Gita",
				"Hadi",
				"Indra",
				"Joko",
				"Kiki",
				"Lia",
				"Maya",
				"Nina",
				"Oka",
				"Putra",
				"Qori",
				"Rina",
				"Sinta",
				"Tono",
				"Umar",
				"Vina",
				"Wawan",
				"Xenia",
				"Yuni",
				"Zaki",
				"John",
				"Shine"
			]
	
			// get random dari list
			Random rand = new Random()
			return firstNames[rand.nextInt(firstNames.length)]
		}
	
		/**
		 * Generate NIK simple (16 digit random)
		 */
		@Keyword
		def generateSimpleNIK() {
			StringBuilder nik = new StringBuilder()
			for (int i = 0; i < 16; i++) {
				nik.append(rand.nextInt(10)) // angka 0–9
			}
			return nik.toString()
		}
	
		/**
		 * Generate Fake NIK lebih mirip asli
		 * Format: 3174 + ddMMyy + nomor urut 6 digit
		 * @param birthDate (format ddMMyy, contoh: 220895)
		 */
		@Keyword
		def generateFakeNIK(String birthDate = "220895") {
			String wilayah = "3174" // Jakarta Selatan (dummy)
			String urut = String.format("%06d", rand.nextInt(999999))
			return wilayah + birthDate + urut
		}
		/**
		 * Generate emial
		 * @param domain
		 * @return
		 */
		@Keyword
		def static String generateEmail(String domain = "qamail.com") {
			long timestamp = System.currentTimeMillis()
			int randomNum = (Math.random() * 1000).toInteger()
			return "user${timestamp}${randomNum}@${domain}"
		}
		/**
		 * Generate account number
		 * @param
		 * @return
		 */
		@Keyword
		def static String generateAccountNumber(int length = 10) {
			Random rand = new Random()
			StringBuilder accountNumber = new StringBuilder()
	
			// digit pertama jangan 0
			accountNumber.append(rand.nextInt(9) + 1)
	
			// sisa digit
			for (int i = 1; i < length; i++) {
				accountNumber.append(rand.nextInt(10))
			}
	
			return accountNumber.toString()
		}
}
