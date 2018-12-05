import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import static org.junit.Assume.*;



public class BisiestoTestModificado 
{
int a=2000;
int b=2059;
int c=2012;
int d=1900;
	
	@Test
	public void isLeap1()
	{
		boolean result = BisiestoModificado.main(a);
		assertTrue(result);
	}
	
	@Test
	public void isLeap2()
	{
		boolean result = BisiestoModificado.main(b);
		assertTrue(result);
	}
	
	@Test
	public void isLeap3()
	{
		boolean result = BisiestoModificado.main(c);
		assertTrue(result);
	}
	
	@Test
	public void isLeap4()
	{
		boolean result = BisiestoModificado.main(d);
		assertTrue(result);
	}
	
	//Vamos a comprobar con 0 y año negativo

	@Test (expected = RuntimeException.class)
   	public void isLeap5()
	{
		int year = 0;
		BisiestoModificado.main(year);
	}

	@Test (expected = RuntimeException.class)
   	public void isLeap6()
	{
		int year = -1;
		BisiestoModificado.main(year);
	}

}
