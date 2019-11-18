//package ejercicio_bisiesto;

import static org.junit.Assert.*;
import org.junit.*;
//import java.util.*;
import java.security.InvalidParameterException; //para la excepción invalid parameter exception
//https://dosc.oracle.com/javase/7/docs/api/java/security/InvalidParameterException.html

public class BisiestosTest {
	
	private int año; //test fixture
	Bisiestos bisiesto=new Bisiestos();
	
	//Año que es bisiesto
	@Test
	public void añovalido() {  
		año=2000;
		assertEquals("Año bisiesto",true,bisiesto.esBisiesto(año));
	}
	
	//Salta excepción con año no valido, es negativo 
	@Test
	public void añonegativo() { 
		año=-50;
		try {
			bisiesto.esBisiesto(año);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");
		
	}
	
	//Año divisible entre 4 y 100 ==> No bisiesto
	@Test
	public void divisible4y100() {
		año=2200;
		assertEquals("Año divisible entre 4 y 100",false,bisiesto.esBisiesto(año));
	}
	
	//Año divisible entre 4 ==> Bisiesto
	@Test
	public void divisible4() {
		año=2008;
		assertEquals("Año divisible entre 4",true,bisiesto.esBisiesto(año));
	}

	//Año divisible entre 4,100 y 400 ==> Bisiesto
	@Test
	public void divisible4y100y400() {
		año=1600;
		assertEquals("Año divisible entre 4,100 y 400",true,bisiesto.esBisiesto(año));
	}
	
	//Año 0, salta excepción 
	@Test (expected=InvalidParameterException.class)
	public void añocero() {
		año=0;
		bisiesto.esBisiesto(año);
	}
}
