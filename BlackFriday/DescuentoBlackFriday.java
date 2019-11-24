//package ejercicio_blackfriday;

import java.util.Calendar;

public class DescuentoBlackFriday {

	public static double PrecioFinal(double precioOriginal, double porcentajeDescuento)throws InvalidParameter {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1; //Note: +1 the month for current month
		//CASO ERROR
		if (precioOriginal <= 0) {
			throw new InvalidParameter("Precio no válido");
		}
		
		if(((100 - porcentajeDescuento)/100) < 0 || ((100 - porcentajeDescuento)/100) > 1) {
			throw new InvalidParameter("Descuento ha de ser entre el 0 y 100");
		}

		if (day == 29 && month == 11) {
			return precioOriginal * ((100 - porcentajeDescuento)/100);
		}
		return precioOriginal;
	}
}
