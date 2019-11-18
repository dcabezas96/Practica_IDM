package Ejercicio_blackfriday;

import java.security.InvalidParameterException;
import java.util.Calendar;

public class DescuentoBlackFriday {

	public static double PrecioFinal(double PrecioOriginal, double Descuento)throws InvalidParameterException {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1; //Note: +1 the month for current month
		//CASO ERROR
		if (PrecioOriginal <= 0) {
			throw new InvalidParameterException("Precio no válido");
		}
		
		if(((100 - Descuento)/100) < 0 || ((100 - Descuento)/100) > 1) {
			throw new InvalidParameterException("Descuento ha de ser entre el 0 y 100");
		}

		if (day == 29 && month == 11) {
			return PrecioOriginal * ((100 - Descuento)/100);
		}
		return PrecioOriginal;
	}
}

