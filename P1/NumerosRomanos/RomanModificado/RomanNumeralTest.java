import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumeralTest {

	public void setUp() throws Exception {
	}
	
	// 1Prueba para el numero romano XXXX
	
	@Test (expected  = RuntimeException.class)
	public void convertirXXXXtest() {
		String romano = "XXXX";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("40", result);		
	}

	// 2Prueba para el numero romano III
	
	@Test	
	public void convertirItest() {
		String romano = "III";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("3", result);		
	}
	

	// 3Prueba para el numero romano IV
	
	@Test
	public void convertirVtest() {
		String romano = "IV";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("4", result);		
	}
	
	// 4Prueba para el numero romano XXX
	
	@Test
	public void convertirXtest() {
		String romano = "XXX";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("30", result);		
	}
	
	 // 5Prueba para el numero romano LX
	
	@Test
	public void convertirXXtest() {
		String romano = "LX";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("60", result);		
	}
	
	// 6Prueba para el numero romano DD
	
	@Test
	public void convertirDDtest() {
		String romano = "DD";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	

	// 7Prueba para el numero romano XXC
	
	@Test
	public void convertirXXCtest() {
		String romano = "XXC";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	// 8Prueba para el numero romano XXIII
	
	@Test
	public void convertirXXIIItest() {
		String romano = "XXIII";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("23", result);		
	}

	// 9Prueba para el numero romano XXLVII
	
	@Test
	public void convertirXXLVIICtest() {
		String romano = "XXLVII";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	// 10Prueba para el numero romano VL
	
	@Test
	public void convertirVLCtest() {
		String romano = "VL";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	//11 Prueba para el numero romano CMM
	
	@Test
	public void convertirCMMtest() {
		String romano = "CMM";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	// 12Prueba para el numero romano IXVI
	
	@Test
	public void convertirIXVItest() {
		String romano = "IXVI";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
 	// 13Prueba para el numero romano IC
	
	@Test
	public void convertirICtest() {
		String romano = "IC";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	//14 Prueba para el numero romano IXL
	
	@Test
	public void convertirIXLtest() {
		String romano = "IXL";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	//15 Prueba para el numero romano XIL
	
	@Test
	public void convertirXILtest() {
		String romano = "XIL";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	// 16Prueba para el numero romano VIV
	
	@Test
	public void convertirVIVtest() {
		String romano = "VIV";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("Error, el numero introducido es invalido", result);		
	}
	
	// 17Prueba para el numero romano CDXL
	
	@Test
	public void convertirCDXLtest() {
		String romano = "CDXL";
		RomanNumeral convierte = new RomanNumeral();
		String result = convierte.convierte(romano);
		assertEquals("440", result);		
	}

}
