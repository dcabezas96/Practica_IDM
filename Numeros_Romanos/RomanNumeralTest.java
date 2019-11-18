//package ejercicio_numerosromanos;

import static org.junit.Assert.*;
import org.junit.*;
//import java.util.*;
import java.security.InvalidParameterException;

public class RomanNumeralTest {
	
	private String s;
	RomanNumeral roman=new RomanNumeral();
	
	//Conversión de un número romano válido a decimal 
	@Test
	public void numeroRomano() {
		s="XIV";
		assertTrue("numero romano correcto",14==roman.convierte(s));
	}
	
	//Numero romano con caracteres inválidos
	@Test
	public void malCaracteres() {
		s="JIH";
		try {
			roman.convierte(s);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");	
	}
	
	//Demasiadas letras repetidas 
	@Test
	public void muchasLetras() {
		s="XXXXXX";
		try {
			roman.convierte(s);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");	
	}
	
	//No hay número romano a convertir 
	@Test
	public void romanoVacio() {
		s="";
		try {
			roman.convierte(s);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");	
	}
	
	//Aleatorio
	@Test
	public void aleatorioConvertidor() {
		s="asdfasfsa";
		try {
			roman.convierte(s);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");	
	}
	
	//Alguna letra repetida
	@Test
	public void iRepetida() {
		s="XIIII";
		try {
			roman.convierte(s);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");	
	}
}
