package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_V {


			@Test
			public void VtoFive() {

				String roman = "V";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 5);

			}
			
			@Test
			public void VtoFiveFail() {

				String roman = "V";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1);

			}
			
		
	}