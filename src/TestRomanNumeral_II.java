package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_II {


			@Test
			public void IItoTwo() {

				String roman = "II";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 2);

			}
			
			@Test
			public void IItoTwoFail() {

				String roman = "II";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1078);

			}
			
		
	}