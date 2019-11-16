//package ejercicio_bisiesto;

import java.security.InvalidParameterException; //para la excepción invalid parameter exception
//https://dosc.oracle.com/javase/7/docs/api/java/security/InvalidParameterException.html

public class Bisiestos {
	
	public boolean esBisiesto(int año) throws InvalidParameterException{
		boolean bisiesto=false;
		if(año>0) { //para evaluar los que son válidos 
			if((año % 4 ==0) && ((año %100 !=0) || (año % 400 ==0 )))
				bisiesto=true;
		}else {
			throw new InvalidParameterException("Parámetro no válido,introduzca valores positivos");
		}
		return bisiesto;
	}
}
