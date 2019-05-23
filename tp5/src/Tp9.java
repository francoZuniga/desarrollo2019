/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp9;

/**
 *
 * @author fojeda
 */
public class Tp9 {

    public static void cargaTrabajos(int[][] argTrabajos, String[] argColores){
        //cargas el numero de importancia que usamos en los trabajos
        for(int i = 0; i< argTrabajos.length; i++){
            System.out.println("para el trabajo: "+(i+1)+" indicar el numero de inporancia del 1-"+argColores.length+" *si que este numero se repita de un color a otro*");
            for(int j = 0; j<argTrabajos[0].length; j++){
                //agregar una estructura de control
                //para lo cual cambira el funcionamiento a un while
                System.out.print("para el color: "+argColores[j]+" :");
                argTrabajos[i][j] = teclado.Entero();
            }
        }
            
    }
    
    public static void cargaArreglo(int[][] arreglo){
        //cargamos los elementos del 1 al 9 en el arreglo (como que se usaron todos los colores
        
        int[] usado = new int[arreglo[0].length];
        int j = 0;
        
        for(int i = 0; i < usado.length; i++){
            usado[i] = i+1;
        }
        
        for(int i = 0; i<arreglo.length; i++){
            while(j < arreglo[0].length){
                int random = (int)(Math.random()*8+1);
                if(buscado(usado, random)){
                    
                }else{
                    arreglo[i][j] = random;
                    j++;
                }
            }
            j ++;
        }
        
        for(int i = 0; i < arreglo.length; i++){
            for(j = 0; j < arreglo[0].length; j++){
                System.out.print(arreglo[i][j]);
            }
            System.out.println("");
        }
        
        for(j = 0; j < usado.length; j++){
                System.out.print(usado[j]);
            }
        
    }
    
    public static boolean buscado(int[] arreglo, int buscado){
        boolean retorno = false;
        int i = 0;
        
        while(i < arreglo.length && !retorno){
            if(arreglo[i] == buscado){
                retorno = true;
            }else{
                i++;
            }
        }
        return retorno;
    }
    
    public static void main(String[] args) {
        //creamos un arreglo de colores fija
        String[] colores = {"Rojo", "Verde", "Azul", "Naranja", "Celeste", "Verde", "Oscuro", "Rosado"};
        //luego vemos la cantidad de trabajos echos en el mes de 5 semenas
        int[][] trabajos = new int[5][colores.length];
        //cargamos los trabajos
        /*
        * podemos pre cargar el arreglo para mas facilidad pero dejamos el modulo de incercion por medio del usuario
        * de esta manera podemos pobar que los algoritmos funcionen correctamente
        */
        cargaArreglo(trabajos);
        
    }
    
}
