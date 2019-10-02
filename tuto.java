// En este documento programaremos algunas funciones que nos servirán para explicar los fundamentos de la programación en Java

bool esPar (int num) {

  if (num % 2 == 0) return true;
  else return false;

}

public static String decimalToBinario (int numero){
  String binario="";
  String digito;
  
  for(int i=numero;i>0;i/=2){
      if(esPar(i)) {
        digito=0;
      }
      else {
        digito=1;
      }
      binario+=digito;
  }
      
  return binario;
}
