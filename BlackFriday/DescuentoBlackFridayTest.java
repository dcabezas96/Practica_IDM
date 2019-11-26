//package ejercicio_blackfriday;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest {
	private double precio;
	private double descuento;
	private double myPi = 22.0d / 7.0d;
	
	@Test
	public void DescuentoNoValido() {
		precio = 35.0;
		descuento = 200.0;
		try {
			DescuentoBlackFriday.PrecioFinal(precio,descuento);
		}catch(InvalidParameter e) {
			return;
		}
		fail("InvalidParameter expected");
	}
	
	@Test 
	public void Descuento_Valido() {
		precio = 100;
		descuento = 20;
		try {
			assertEquals (80.0,myPi,DescuentoBlackFriday.PrecioFinal(precio, descuento));
		} catch (InvalidParameter e) {
			fail ("80 expected");
		}
	 }
	
	@Test
	public void PrecioNoValido() {
		precio = -35.0;
		descuento = 20.0;
		try {
			DescuentoBlackFriday.PrecioFinal(precio,descuento);
		}catch(InvalidParameter e) {
			return;
		}
		fail("InvalidParameter expected");
	}
	
	@Test
	public void Negativo() {
		precio = -35.0;
		descuento = -20.0;
		try {
			DescuentoBlackFriday.PrecioFinal(precio,descuento);
		}catch(InvalidParameter e) {
			return;
		}
		fail("InvalidParameter expected");
	}
}
