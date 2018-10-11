package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumeral_VI {


			@Test
			public void VItoSix() {

				String roman = "VI";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 6);

			}
			
			@Test
			public void VItoSixFail() {

				String roman = "VI";

				int result = RomanArabicConverter.romanToArabic(roman);

				assertEquals(result, 1);

			}
			
		
	}