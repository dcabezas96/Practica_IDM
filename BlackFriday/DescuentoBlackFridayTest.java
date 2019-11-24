//package ejercicio_blackfriday;

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
		}catch(InvalidParameter e) {
			return;
		}
		fail("InvalidParameter expected");
	}
	
	@Test
	public void DescuentoValido() {
		precio = 35.0;
		descuento = 70.0;
		try {
			assertTrue("Descuento Black:", (DescuentoBlackFriday.PrecioFinal(precio,descuento)) == 24.5);
		}catch(InvalidParameter e) {
			return;
		}
		fail("InvalidParameter expected");
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
