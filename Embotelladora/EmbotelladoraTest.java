package Ejercicio_embotelladora;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmbotelladoraTest {

	 @Test public void Sobran_peq_grand() 
	   {
	      int total = 21;
	      int grandes = 8;
	      int pequenas = 3;
	      try {
		assertEquals ("Sobran pequenas y grandes",  0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	      } catch (NoSolution e) {
	        fail ("0 expected");
	      }
	   }

	   @Test public void Sobran_grand() 
	   {
	      int total = 25;
	      int grandes = 7;
	      int pequenas = 4;
	      try {
		assertEquals ("Sobran grandes",  0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	      } catch (NoSolution e) {
	        fail ("0 expected");
	      }
	   }

	   @Test public void Sobran_peq() 
	   {
	      int total = 40;
	      int grandes = 6;
	      int pequenas = 14;
	      try {
		assertEquals ("Sobran pequenas",  10, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	      } catch (NoSolution e) {
	        fail ("10 expected");
	      }
	   }

	   @Test public void Valido() 
	   {
	      int total = 32;
	      int grandes = 6;
	      int pequenas = 2;
	      try {
		assertEquals ("No sobran",  2, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	      } catch (NoSolution e) {
	        fail ("2 expected");
	      }
	   }

	   @Test public void Bien_peq() 
	   {
	      int total = 9;
	      int grandes = 0;
	      int pequenas = 12;
	      try {
		assertEquals ("Sobran pequenas",  9, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	      } catch (NoSolution e) {
	        fail ("8 expected");
	      }
	   }

}
