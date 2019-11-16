//package ejercicio_bisiesto;

import java.security.InvalidParameterException; //para la excepción invalid parameter exception
//https://dosc.oracle.com/javase/7/docs/api/java/security/InvalidParameterException.html
import java.util.GregorianCalendar; //para el calendario gregoriano 

public class Bisiestos {
	
	public boolean esBisiesto(int año) throws InvalidParameterException{
		GregorianCalendar calendar = new GregorianCalendar();
		boolean bisiesto=false;
		if(año>0) {
			if (calendar.isLeapYear(año))
				bisiesto=true;
		}else {
			throw new InvalidParameterException("Parámetro no válido,introduzca valores positivos");
		}
		return bisiesto;
	}
}

