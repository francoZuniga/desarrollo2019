
package tp4;

public class Tp4 {
    public static void main(String[] args) {
        //cargamos el arreglo
        int[] arreglo = new int[4];
        
        do{
            System.out.println("carge el arreglo");
            carga(arreglo);
            
            int[] codigo = CN(arreglo);
            System.out.print("el codigo de la secuencia: ");
            mostrar(arreglo);
            System.out.print(" es: ");
            muestraCodigo(codigo);
            //la cantidad de primos
            System.out.println("la cantidad de numeros primos ingresados: "+contadorPrimos(arreglo));
            //la cantidad  de digistos que generan mas de 3 cifras
            System.out.println("la cantidad de numero que generan mas de 3 cifras es: "+verificarTresDecimales(arreglo));
            //la cantidad de 1 cifra
            System.out.println("la cantidad de numeros que generan una cifra son: "+verificarDecil(arreglo));
            //los generados entre 20 y 40
            System.out.println("la cantidad de numeros que generan una cifra entre 20 y 40: "+Contador(arreglo));
        }while(!verificaDosPrimos(arreglo));
    } 
    
    public static void muestraCodigo(int[] arreglo){
        for(int i=0; i < arreglo.length; i++){
            if(i % 2 == 1){
                System.out.print(arreglo[i]);
            }
        }
        System.out.println("\n");
    }
    
    public static void mostrar(int[] arreglo){
        int i;
        for(i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        }
    }
    
    public static boolean esPrimo(int numero){
        //verifica que el numero sea primo
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
    }
    
    public static void carga(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = teclado.Entero();
        }
        System.out.println("---");
    }
    
    public static boolean verificaDosPrimos(int[] arreglo){
        //verificamos que el arreglo tenga mas de 2 primos
        int i = 0;
        int contador = 0;
        boolean validador = false;
        
        while(i < arreglo.length){
            if(esPrimo(arreglo[i])){
                contador++;
            }
            i++;
        }
        if(contador >= 2){
            validador = true;
        }
        return validador;
    }
    
    public static int contadorPrimos(int[] arreglo){
        //contamos que lantidad de digitos que son primos 
        int i = 0;
        int contador = 0;
        
        while(i < arreglo.length){
            if(esPrimo(arreglo[i])){
                    contador++;
                }
            i++;
        }
        return contador;
    }
    
    public static int Contador(int arreglo[]){
        //contamos la cantidad de numero que generan los valores 29 y cuarenta
        int i, contador=0;
            for (i=0; i<arreglo.length; i++){
                
                    if (generarCodigo(arreglo[i]) > 20 && generarCodigo(arreglo[i]) < 40){
                        contador = contador +1;
                    }
            }
        return contador;
    }
    
    public static int[] CN(int[] arreglo) {
        int[] nuevoArreglo = new int[8];
        for (int i = 0; i < nuevoArreglo.length-1; i++) {
            if (i % 2 == 0) {
                nuevoArreglo[i] = arreglo[i/2];
                nuevoArreglo[i+1] = generarCodigo(arreglo[i/2]);
            }
        }
        return nuevoArreglo;
    }
    
    public static int verificarTresDecimales(int [] arreglo){
        int contador = 0;
        for (int i =0; i < arreglo.length ; i++){
            if(((arreglo [i]) >=100) && ((arreglo[i]) <=1000)){
                contador++;
            }
        }
        return contador;
    }

     public static int verificarDecil(int [] arreglo){
        int contador = 0;
        for (int i =0; i < arreglo.length ; i++){
            if(arreglo [i] <10){
                contador++;
            }
        }
        return contador;
    }

    public static int generarCodigo(int numero){
        return (numero + 5) * 3;
    }

}
