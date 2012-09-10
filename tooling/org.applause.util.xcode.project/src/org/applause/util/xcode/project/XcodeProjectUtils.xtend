package org.applause.util.xcode.project

import java.security.MessageDigest
import java.security.SecureRandom
import org.apache.commons.codec.binary.Hex

class XcodeProjectUtils {
	
	def static String generateUUID() { 
		val MessageDigest md = MessageDigest::getInstance("SHA1")
		val SecureRandom prng = SecureRandom::getInstance("SHA1PRNG")
		val String randomNumber = prng.nextInt.toString
		val String ref = Hex::encodeHexString(md.digest(randomNumber.bytes))
		ref.toUpperCase.substring(0, 24);
	}	
}