
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "utils.generator.generatePhoneNumber"() {
    (new utils.generator()).generatePhoneNumber()
}


def static "utils.generator.getRandomName"() {
    (new utils.generator()).getRandomName()
}

 /**
		 * Generate NIK simple (16 digit random)
		 */ 
def static "utils.generator.generateSimpleNIK"() {
    (new utils.generator()).generateSimpleNIK()
}

 /**
		 * Generate Fake NIK lebih mirip asli
		 * Format: 3174 + ddMMyy + nomor urut 6 digit
		 * @param birthDate (format ddMMyy, contoh: 220895)
		 */ 
def static "utils.generator.generateFakeNIK"(
    	String birthDate	) {
    (new utils.generator()).generateFakeNIK(
        	birthDate)
}

 /**
		 * Generate emial
		 * @param domain
		 * @return
		 */ 
def static "utils.generator.generateEmail"(
    	String domain	) {
    (new utils.generator()).generateEmail(
        	domain)
}

 /**
		 * Generate account number
		 * @param
		 * @return
		 */ 
def static "utils.generator.generateAccountNumber"(
    	int length	) {
    (new utils.generator()).generateAccountNumber(
        	length)
}


def static "utils.generator.generateFakeNIK"() {
    (new utils.generator()).generateFakeNIK()
}


def static "utils.generator.generateEmail"() {
    (new utils.generator()).generateEmail()
}


def static "utils.generator.generateAccountNumber"() {
    (new utils.generator()).generateAccountNumber()
}
