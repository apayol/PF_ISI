package blackFriday;
import static org.junit.Assert.*;
import org.junit.*;
import java.time.LocalDate;

public class BlackFridayTestmodificado {
	
	@Test public void PrecioInvalido()
	{
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-dd-MM");
		LocalDate fecha = LocalDate.parse("1954-23-11",f);

		try {
			assertTrue("Menor 0",10==descuento.PrecioFinal(-10, fecha));	
		} catch (IllegalArgumentException e) {
			return;
		}
		fail("Valor menor de cero");
		
	}

	@Test public void PrecioValido()
	{
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-dd-MM");
		LocalDate fecha = LocalDate.parse("1954-23-11",f);

		assertTrue("BFriday",10.0==descuento.PrecioFinal(10, fecha));
		
	}
	@Test public void PrecioValido2()
	{
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-dd-MM");

		LocalDate fecha = LocalDate.parse("1954-23-11",f);
		assertTrue("BFriday",7.0!=descuento.PrecioFinal(10, fecha));
		
	}

	@Test public void Fechainvalida()
	{
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-dd-MM");
		LocalDate fecha = LocalDate.parse("1954-22-11",f);

		try {
			assertTrue("No fecha",10==descuento.PrecioFinal(10, fecha));	
		} catch (IllegalArgumentException e) {
			return;
		}
		fail("No es fecha de blackfriday");

	}

}
