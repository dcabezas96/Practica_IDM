//package ejercicio_bisiesto;

import java.util.GregorianCalendar; //para el calendario gregoriano 

public class Bisiestos {
	
	public boolean esBisiesto(int año) throws InvalidParameter{
		GregorianCalendar calendar = new GregorianCalendar();
		boolean bisiesto=false;
		if(año>=0) {
			if (calendar.isLeapYear(año))
				bisiesto=true;
		}else {
			throw new InvalidParameter("Parámetro no válido,introduzca valores positivos");
		}
		return bisiesto;
	}
}

