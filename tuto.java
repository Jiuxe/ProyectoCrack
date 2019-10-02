// En este documento programaremos algunas funciones que nos servirán para explicar los fundamentos de la programación en Java

bool esPar (int num) {

  if (num % 2 == 0) return true;
  else return false;

}

public static String decimalBinario (int numero){
  String binario="";
  String digito;
  for(int i=numero;i>0;i/=2){
      if(esPar(i)){
          digito="0";
      }
      else {
          digito="1";
      }

      binario+=digito;
  }
  return binario;
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

public void circunferencia (double radio) {
    longitud = 2 * Math.PI * radio;
    area = Math.PI * Math.pow(radio, 2);
    System.out.println("Longitud de la circunferencia -> " + longitud);
    System.out.println("Area de la circunferencia -> " + area);
}
