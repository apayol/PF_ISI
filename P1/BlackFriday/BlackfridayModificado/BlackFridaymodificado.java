package BlackFriday;
import java.time.LocalDate;

public class BlackFridaymodificado {
	//Pasamos como parametro si estamos en el 23 de noviembre, en vez de mirar por calendar
	
	public double PrecioFinal(double PrecioOriginal,LocalDate fecha) {
		if (PrecioOriginal > 0)

		{
			return (0.7*PrecioOriginal);

		}else if (PrecioOriginal <= 0) {

			throw new IllegalArgumentException("Precio invalido");

		}else if (fecha.getMonthValue() == 11 && fecha.getDayOfMonth()==23) {

			return (0.7*PrecioOriginal);

		}else if (fecha.getMonthValue() !== 11 && fecha.getDayOfMonth() !== 23) {

			return PrecioOriginal;

		}else {

			return PrecioOriginal;
		}
	}

}
