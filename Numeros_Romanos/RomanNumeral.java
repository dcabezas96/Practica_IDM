//package ejercicio_numerosromanos;

import java.util.HashMap;
import java.security.InvalidParameterException;

public class RomanNumeral {
  static HashMap<Character, Integer> map;

  public RomanNumeral() {
    map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
  }

  public int obtenerValorRomanoNumerico(char ch) {
    if (map.containsKey(ch)) {
      return map.get(ch);
    }
    else {
      throw new InvalidParameterException("El número romano contiene caracteres no válidas ");
    }
  }
  
  public boolean comprobarRomano(String roman){

     return !roman.contains("IIII") && !roman.contains("XXX") && !roman.contains("CCC")
	&& !roman.contains("MMM") && !roman.contains("VV") && !roman.contains("LL")
	&& !roman.contains("DD");
  }

  public int convierte(String s) throws InvalidParameterException {
    if(s==null || s.isEmpty() || !comprobarRomano(s)) {
	throw new InvalidParameterException("El string romano está vacío o no cumple los parámetros");
    }
    else {
      int index = s.length() - 1;
      int result = obtenerValorRomanoNumerico(s.charAt(index));

      for (int i = index - 1; i >= 0; i--) {
        if (obtenerValorRomanoNumerico(s.charAt(i)) >= obtenerValorRomanoNumerico(s.charAt(i + 1))) {
          result = result + obtenerValorRomanoNumerico(s.charAt(i));
        }
        else {
          result = result - obtenerValorRomanoNumerico(s.charAt(i));
        }
      }
      return result;
    }
  }
}
