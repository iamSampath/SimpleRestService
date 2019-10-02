package org.application.rest.SimpleRestService;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/isAnagram/check")
	public String AppModel(@RequestParam("S1") String S1,@RequestParam("S2") String S2) {
		
		
		
		String spaceStripString1 = S1.replaceAll("[\\s]", "");
		String spaceStripString2 = S2.replaceAll("[\\s]", "");
		
		if(spaceStripString1.length() != spaceStripString2.length()) {
			return spaceStripString1+" Is Not a Anagram to "+spaceStripString2;
			
		}
		
		// Convert the String to Character Array
		char charArray1[] = spaceStripString1.toLowerCase().toCharArray();
		char charArray2[] = spaceStripString2.toLowerCase().toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		

		// Loop for comparison of each character across two arrays
		for(int i=0;i<charArray1.length;i++) {
		  if(charArray1[i]!=charArray2[i]) {
			  return S2 +" Is Not a Anagram to "+ S1;
		  }
			
		}
		
		return S2 +" Is Anagram to "+ S1;
	}
	
	
	
}
