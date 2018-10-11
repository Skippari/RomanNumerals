package Roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArabicNumeral_2 {

			@Test
			public void TwotoII() {

				int arabic = 2;

				String result = RomanArabicConverter.arabicToRoman(arabic);

				assertEquals(result, "II");

			}
			
			@Test
			public void TwotoIIFail() {

				int arabic = 2;

				String result = RomanArabicConverter.arabicToRoman(arabic);

				assertEquals(result, "IV");

			}
			
		
	}