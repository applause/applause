package org.applause.util.xcode.project

import java.security.MessageDigest
import java.security.SecureRandom
import org.apache.commons.codec.binary.Hex
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory

class XcodeProjectUtils {
	
	def static String generateUUID() { 
		val MessageDigest md = MessageDigest::getInstance("SHA1")
		val SecureRandom prng = SecureRandom::getInstance("SHA1PRNG")
		val String randomNumber = prng.nextInt.toString
		val String ref = Hex::encodeHexString(md.digest(randomNumber.bytes))
		ref.toUpperCase.substring(0, 24);
	}	
	
	def static makePath(String path) {
		val result = PbxprojFactory::eINSTANCE.createPath
		
		val fragment = if (path.indexOf(" ") > 0) {
			val f = PbxprojFactory::eINSTANCE.createPathString
			f.value = path
			f
		}
		else {
			val f = PbxprojFactory::eINSTANCE.createPathID
			f.value = path
			f
		}
		result.fragments.add(fragment)
		result
	}
	
}