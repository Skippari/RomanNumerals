package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_IV {


			@Test
			public void IVtoFour() {

				String roman = "IV";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 4);

			}
			
			@Test
			public void IVtoFourFail() {

				String roman = "IV";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1078);

			}
			
	}