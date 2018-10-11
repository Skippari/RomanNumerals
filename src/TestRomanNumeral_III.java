package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_III {


			@Test
			public void IIItoThree() {

				String roman = "III";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 3);

			}
			
			@Test
			public void IIItoThreeFail() {

				String roman = "III";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1078);

			}
			
		
	}