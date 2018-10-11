package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_C {


			@Test
			public void CtoHundred() {

				String roman = "C";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 100);

			}
			
			@Test
			public void CtoHundredFail() {

				String roman = "C";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1);

			}
			
		
	}