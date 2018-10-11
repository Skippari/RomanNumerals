package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_I {


			@Test
			public void ItoOne() {

				String roman = "I";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1);

			}
			
			@Test
			public void ItoOneFail() {

				String roman = "I";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 100);

			}
			
		
	}