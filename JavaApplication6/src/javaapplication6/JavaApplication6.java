
package javaapplication6;
public class JavaApplication6 {
    public static boolean contadoresPares(char n){
        boolean control = false;
        if((int)n % 2==0){
            control = true;
        }
        return control;
    }
    
    public static boolean contadoresInpares(int n){
        boolean control = false;
        if(n % 2 == 1){
            control = true;
        }
        return control;
    }
    
    public static void muestra(int primerPar,int sumaPar, int sumaInpar,double promedioPar, double promedioInpar, double promedioGeneral){
        System.out.println("el primer par es: "+primerPar);
        System.out.println("la suma par es: "+sumaPar);
        System.out.println("la suma inpar es: "+sumaInpar);
        System.out.println("el promedio general es: "+promedioGeneral);
        System.out.println("el promeido par: "+promedioPar);
        System.out.println("el promedio inpar: "+promedioInpar);
    }
    
    public static int assci(char caracter){
        return (int)caracter;
    }
    
    public static void main(String[] args){
        int n,contadorPar, contadorInpar;
        char m, primerPar;
        String sumaPar, sumaInpar;
        contadorInpar = 0;
        contadorPar = 0;
        sumaInpar = "";
        sumaPar = "";
        double promedioGeneral, promedioPar, promedioInpar;
        promedioGeneral = 0;
        promedioInpar = 0;
        promedioPar = 0;
        
        System.out.println("ingrese la cantidad de numero a ingresar:");
        n = teclado.Entero();
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un numero:");
            m = teclado.Char();
            promedioGeneral = promedioGeneral + (int)m;
            
            if(contadoresPares(m)){
                sumaPar = sumaPar + m;
                contadorPar = contadorPar + 1;
            }
            
            if(contadoresInpares(m)){
                sumaInpar = sumaInpar + m;
                contadorInpar = contadorInpar + 1;
            }
            
            if(sumaPar.length() == 1 && contadoresPares(m)){
                primerPar = m;
            }
        }
        promedioInpar = (contadorInpar * 10)/n;
        promedioPar =  (contadorPar * 10) /n;
        promedioGeneral = promedioGeneral/n;
        
    }

}
