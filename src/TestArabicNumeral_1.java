package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArabicNumeral_1 {

			@Test
			public void OnetoI() {

				int arabic = 1;

				String result = RomanArabicConverter.arabicToRoman(arabic);

				assertEquals(result, "I");

			}
			
			@Test
			public void OnetoIFail() {

				int arabic = 1;

				String result = RomanArabicConverter.arabicToRoman(arabic);

				assertEquals(result, "IV");

			}
			
		
	}