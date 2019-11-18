package Ejercicio_blackfriday;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

import org.junit.Test;

public class DescuentoBlackFridayTest {
	private double precio;
	private double descuento;
	@Test
	public void DescuentoNoValido() {
		precio = 35.0;
		descuento = 200.0;
		try {
			DescuentoBlackFriday.PrecioFinal(precio,descuento);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	public void DescuentoValido() {
		precio = 35.0;
		descuento = 70.0;
		assertTrue("Descuento Black:", (DescuentoBlackFriday.PrecioFinal(precio,descuento)) == 24.5);
	}
	
	public void PrecioNoValido() {
		precio = -35.0;
		descuento = 20.0;
		try {
			DescuentoBlackFriday.PrecioFinal(precio,descuento);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");
	}
	
	public void Negativo() {
		precio = -35.0;
		descuento = -20.0;
		try {
			DescuentoBlackFriday.PrecioFinal(precio,descuento);
		}catch(InvalidParameterException e) {
			return;
		}
		fail("InvalidParameterException expected");
	}


}
