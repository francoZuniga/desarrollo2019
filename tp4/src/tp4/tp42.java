
package tp4;
public class tp42 {
    public static void main(String[] args){
        //creamos el arreglo
        int[] arreglo;
        System.out.println("ingrese la cantidad de numeros a ingresar:");
        int n = teclado.Entero();
        arreglo = new int[n];
        //llamamos al modulo que opera con los numeros
        carga(arreglo);
        String[] pass = generador(arreglo);
        mostrarArreglo(pass);
        //contador letras
        //contadorNumero
        //mostramos el medio, el fin y el primero
    }
    
    public static void carga(int[] arreglo){
        //cargamos cada elementos del arreglo
        System.out.println("ingrese un numero:");
        for(int i = 0; i < arreglo.length;i++){
            arreglo[i] = teclado.Entero();
        }
    }
    
    public static String[] generador(int[] arreglo){
        String[] nuevoArreglo = new String[arreglo.length * 2];
        
        for(int i = 0; i < nuevoArreglo.length-1; i++){
            if(i % 2 == 0){
                nuevoArreglo[i] = ""+arreglo[i/2];
                nuevoArreglo[i+1] = ""+ascii(arreglo[i/2]);
            }
        }
        return nuevoArreglo;
    }
    
    public static void mostrarArreglo(String[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        }
    }
    
    
    public static char ascii(int entero){
        char caracter = (char)entero;
        return caracter;
    }
    
}
