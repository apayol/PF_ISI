package BlackFriday;

public class DescuentoBlackFriday {
	//Pasamos como parametro si estamos en el 23 de noviembre, en vez de mirar por calendar
	
	public static double PrecioFinal(double PrecioOriginal,boolean day) {
		if (day && PrecioOriginal>0)
		{
			return (0.7*PrecioOriginal);
		}else if (PrecioOriginal<=0) {
			throw new IllegalArgumentException("Precio invalido");
		}else {
			return PrecioOriginal;
		}
	}

}
