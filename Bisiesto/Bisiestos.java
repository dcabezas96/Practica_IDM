package ejercicio_bisiesto;

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

	public static void main(String[] args) {  //para probar el algoritmo anterior 
		// TODO Auto-generated method stub
		Bisiestos prueba=new Bisiestos();
		System.out.println(prueba.esBisiesto(2020)); //este es bisiesto 
		System.out.println(prueba.esBisiesto(2000)); //este es bisiesto
		System.out.println(prueba.esBisiesto(2400)); //este es bisiesto
		System.out.println(prueba.esBisiesto(1600)); //este es bisiesto
		System.out.println(prueba.esBisiesto(1900)); //este no es bisiesto
		System.out.println(prueba.esBisiesto(2100)); //este no es bisiesto
		System.out.println(prueba.esBisiesto(2300)); //este no es bisiesto
		System.out.println(prueba.esBisiesto(-25)); //este no es válido 
	}
}
