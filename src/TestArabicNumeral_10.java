package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArabicNumeral_10 {

			@Test
			public void TentoX() {

				int arabic = 10;

				String result = RomanArabicConverter.arabicToRoman(arabic);

				assertEquals(result, "X");

			}
			
			@Test
			public void TentoXFail() {

				int arabic = 10;

				String result = RomanArabicConverter.arabicToRoman(arabic);

				assertEquals(result, "IV");

			}
			
		
	}