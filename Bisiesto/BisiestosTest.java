//package ejercicio_bisiesto;

import static org.junit.Assert.*;
import org.junit.*;
//import java.util.*;

public class BisiestosTest {
	
	private int año; //test fixture
	Bisiestos bisiesto=new Bisiestos();
	
	//Año que es bisiesto
	@Test
	public void añovalido() {  
		año=2000;
		try {
			assertEquals("Año bisiesto",true,bisiesto.esBisiesto(año));
		}catch (InvalidParameter e) {
			fail("InvalidParameter expected");
		}
	}
	
	//Salta excepción con año no valido, es negativo 
	@Test
	public void añonegativo() { 
		año=-50;
		try {
			bisiesto.esBisiesto(año);
		}catch(InvalidParameter e) {
			return;
		}
		fail("InvalidParameter expected");
	}
	
	//Año divisible entre 4 y 100 ==> No bisiesto
	@Test
	public void divisible4y100() {
		año=2200;
		try {
			assertEquals("Año divisible entre 4 y 100",false,bisiesto.esBisiesto(año));
		}catch(InvalidParameter e) {
			fail ("InvalidParameter expected");
		}
	}
	
	//Año divisible entre 4 ==> Bisiesto
	@Test
	public void divisible4() {
		año=2008;
		try {
			assertEquals("Año divisible entre 4",true,bisiesto.esBisiesto(año));
		}catch (InvalidParameter e) {
			fail("InvalidParameter expected");
		}
	}

	//Año divisible entre 4,100 y 400 ==> Bisiesto
	@Test
	public void divisible4y100y400() {
		año=1600;
		try {
			assertEquals("Año divisible entre 4,100 y 400",true,bisiesto.esBisiesto(año));
		}catch (InvalidParameter e) {
			fail("InvalidParameter expected");
		}
	}
	
	//Año 0, salta excepción 
	@Test 
	public void añocero() {
		año=0;
		try {
			bisiesto.esBisiesto(año);
		}catch (InvalidParameter e) {
			fail("InvalidParameter expected");
		}
	}
}
