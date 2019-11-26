//package ejercicio_embotelladora;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class EmbotelladoraTest {

   @Test public void grandes_pequenas_exceso() 
   {
      int total = 25;
      int grandes = 7;
      int pequenas = 3;
      try {
	assertEquals ("Sobran pequenas y grandes",  -10, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void exceso_grandes() 
   {
      int total = 30;
      int grandes = 7;
      int pequenas = 4;
      try {
    	  assertEquals ("Sobran grandes",  -5, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void exceso_pequenas() 
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

   @Test public void no_sobra() 
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


   @Test public void solo_grandes_exceso() 
   {
      int total = 25;
      int grandes = 6;
      int pequenas = 0;
      try {
	assertEquals ("Sobran grandes no pequenas",  -5, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void solo_grandes() 
   {
      int total = 30;
      int grandes = 6;
      int pequenas = 0;
      try {
	assertEquals ("No sobran grandes no pequenas",  0, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("0 expected");
      }
   }

   @Test public void solo_pequenas_exceso() 
   {
      int total = 8;
      int grandes = 0;
      int pequenas = 10;
      try {
	assertEquals ("No grandes sobran pequenas",  8, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("8 expected");
      }
   }

   @Test public void solo_pequenas() 
   {
      int total = 12;
      int grandes = 0;
      int pequenas = 12;
      try {
	assertEquals ("No grandes no sobran pequenas",  12, Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
      } catch (NoSolution e) {
        fail ("12 expected");
      }
   }

   @Test public void faltan() 
   {
      int total = 20;
      int grandes = 0;
      int pequenas = 19;
      try {
	 Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
      } catch (NoSolution e) {
        return;
      }
      fail ("NoSolution expected");
   }

   @Test public void nada() 
   {
      int total = 40;
      int grandes = 0;
      int pequenas = 0;
      try {
	 Embotelladora.calculaBotellasPequenas(pequenas, grandes, total);
      } catch (NoSolution e) {
        return;
      }
      fail ("NoSolution expected");
   }
}


