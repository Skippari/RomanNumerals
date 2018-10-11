package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_X {

			@Test
			public void XtoTen() {

				String roman = "X";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 10);

			}
			
			@Test
			public void XtoTenFail() {

				String roman = "X";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1);

			}
			
		
	}