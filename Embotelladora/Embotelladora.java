//package ejercicio_embotelladora;

public class Embotelladora {
  
  public static int calculaBotellasPequenas(int pequenas, int grandes, int total)throws NoSolution {

    if (pequenas < 0 || grandes < 0 || total <= 0 || (pequenas == 0 && grandes == 0)){
      throw new NoSolution("Invalid Parameter");
    }

    if (pequenas == 0){
      if (total/5 > grandes){
    	  throw new NoSolution("No se puede rellenar todos los litros con las grandes");
      }
    }

    if (grandes == 0){ //tiene que haber pequeñas si o si
      if (pequenas >= total){
        return total;
      }else{
        throw new NoSolution("No se puede solo con pequeñas");
      }
    }

    //caso grandes > pequeñas | pequeñas > grandes
    int resto = total - (5*grandes);
    if (resto > 0){
      if (pequenas >= resto){
        return resto;
      }else{
    	  throw new NoSolution("No se rellena ni con grandes mas pequeñas");
      }
    }
	return resto;
  }
}
