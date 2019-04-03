package tp5;

public class contexto2 {
    
    public static void main(String[] args){
        char[][] arreglo = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}};
        //cargamos el arreglo
        ingresarCaracteres();
        //a)Ingresar una escuela y mostrar las letras asignadas a los grupos de esa escuela
        System.out.println("ingrese una escuala: ");
        String escuelaCategoria = teclado.string();
        mostarCategorias(arreglo,escuelaInversa(escuelaCategoria.toUpperCase()));
        //b)Dada una categoría, y una letra, indicar si corresponde a esa escuela. ¿Puede averiguar a
        //qué escuela corresponde con una operación?
        System.out.println("ingrese el nombre de una categoria:");
        String categoria = teclado.string();
        System.out.println("ingrese un caracter:");
        char caracter = teclado.Char();
        escualaCaracterCategoria(caracter, categoria, arreglo);
        //c)Generar una cadena con todos los grupos, ordenado por escuela. 
        System.out.println("la cadena formada por todas los caracteres en orden es: "+mostrarCategoriasPorEscuala(arreglo));
        //d)Mostrar los elementos de la matriz realizando un recorrido en espiral.
        System.out.println("mostramos la matriz de forma espiral: ");
        espiral(arreglo);
        //Los grupos a los que les tocó una vocal se han ganado un premio. Identificarlos y reemplazar las vocales por ‘*'
        camviarVocale(arreglo);
        mostrarArreglo(arreglo);
    }
    
    public static char[][] ingresarCaracteres(){
        char[][] arreglo = new char[5][5];
        
        for(int i = 0; i< arreglo.length; i++){
            System.out.println(escuela(i));
            for(int j = 0; j< arreglo[0].length; j++){
                System.out.println(categoria(j));
                arreglo[i][j] = teclado.Char();
            }
        }
        return arreglo;
    }
    
    public static void mostarCategorias(char[][] arreglo, int escuela){
        for(int j = 0; j<arreglo[0].length; j++){
            System.out.println(arreglo[escuela][j]);
        }
    }
    
    public static String mostrarCategoriasPorEscuala(char[][] arreglo){
        String cadena = "";
        for(int i=0; i<arreglo.length;i++){
            for(int j = 0; j< arreglo[j].length; j++){
                cadena = cadena + arreglo[i][j];
            }
        }
        return cadena;
    }
    
    public static String escualaCaracterCategoria(char letra, String categoria, char[][] arreglo){
        //dado una categoria 
        int j, i, controlEscuela;
        controlEscuela = 0;
        boolean control = true;
        String escuela;
        
        switch(categoria.toUpperCase()){
            case "M4":
                 j = 0;
                 i = 0;
                 while(control && i < arreglo.length){
                     if(arreglo[i][j] ==  letra){
                         control = false;
                         controlEscuela = i;
                     }
                     i++;
                 }
                 escuela = escuela(controlEscuela);
            break;
            case "M6":
                 j = 1;
                 i = 0;
                 while(control && i < arreglo.length){
                     if(arreglo[i][j] ==  letra){
                         control = false;
                         controlEscuela = i;
                     }
                     i++;
                 }
                 escuela = escuela(controlEscuela);
            break;
            case "M7":
                 j = 2;
                 i = 0;
                 while(control && i < arreglo.length){
                     if(arreglo[i][j] ==  letra){
                         control = false;
                         controlEscuela = i;
                     }
                     i++;
                 }
                 escuela = escuela(controlEscuela);
            break;
            case "M8":
                 j = 3;
                 i = 0;
                 while(control && i < arreglo.length){
                     if(arreglo[i][j] ==  letra){
                         control = false;
                         controlEscuela = i;
                     }
                     i++;
                 }
                 escuela = escuela(controlEscuela);
            break;
            case "M10":
                 j = 4;
                 i = 0;
                 while(control && i < arreglo.length){
                     if(arreglo[i][j] ==  letra){
                         control = false;
                         controlEscuela = i;
                     }
                     i++;
                 }
                 escuela = escuela(controlEscuela);
            break;
            
            default:
                controlEscuela = -1;
                escuela = escuela(controlEscuela);
            break;
        }
        
        return escuela;
    }
    
    public static void camviarVocale(char[][] arreglo){
        for(int i = 0; i<arreglo.length; i++){
            for(int j = 0; j<arreglo[0].length; j++){
                if(arreglo[i][j] == 'a' || arreglo[i][j] == 'e' || arreglo[i][j] == 'i' || arreglo[i][j] == 'o' || arreglo[i][j] == 'u'){
                    arreglo[i][j] = '*';
                } 
            }
        }
    }
    
    public static void mostrarArreglo(char[][] arreglo){
        for(int i = 0; i<arreglo.length; i++){
            for(int j = 0; j<arreglo[0].length; j++){
                System.out.print(arreglo[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static String escuela(int i){
        //retornamos el nombre de la escual segun el numero de fila
        String escuela;
        switch(i){
            case 0:
                escuela = "Los Patos (Centenario)";
            break;
            case 1:
                escuela = "Marabunta (Cipolletti)";
            break;
            case 2:
                escuela = "RRC (Roca)";
            break;
            case 3:
                escuela = "NRC (Neuquén)";
            break;
            case 4:
                escuela = "ARC (Allen)";
            break;
            default:
                escuela = "no existe tal escuala o la categoria es incorrecta";
            break;
        }
        return escuela;
    }
    
    public static String categoria(int i){
        //retornamos el nombre de la escual segun el numero de fila
        String escuela;
        switch(i){
            case 0:
                escuela = "M4";
            break;
            case 1:
                escuela = "M6";
            break;
            case 2:
                escuela = "M7";
            break;
            case 3:
                escuela = "M8";
            break;
            case 4:
                escuela = "M10";
            break;
            default:
                escuela = "no existe tal escuala o la categoria es incorrecta";
            break;
        }
        return escuela;
    }
    
    public static int escuelaInversa(String i){
        //retornamos el nombre de la escual segun el numero de fila
        int escuela;
        switch(i){
            case "LOS PATOS (CENTENARIO)":
                escuela = 0;
            break;
            case "MARABUNTA (CIPOLLETTI)":
                escuela = 1;
            break;
            case "RRC (ROCA)":
                escuela = 2;
            break;
            case "NRC (NEUQUEN)":
                escuela = 3;
            break;
            case "ARC (ALLEN)":
                escuela = 4;
            break;
            default:
                escuela = -1;
            break;
        }
        return escuela;
    }
    
    public static void espiral(char[][] matriz){
        //recorremos un arreglo de forma espiral
        
        int x = 0; //Para manejar las filas
        int y = 0; //Para manejar las columnas
        int flag = 0;  //Bandera para saber que recorrido se debe realizar
        int n = 0; //Contador de elementos
        //Total de elementos en la matriz
        int elementos = matriz.length * matriz[0].length;
      
        while (n < elementos) {
         //System.out.println("\nFlag : " + flag);
         switch (flag) {
            case 0: // Recorrido de izquierda a derecha
               for (int m = x; m < matriz[0].length - y; m++) {
                  System.out.print(" " + matriz[x][m]);
                  n++;
               }
               flag++;
               break;

            case 1: //Recorrido de arriba abajo
               for (int m = x + 1; m < matriz.length - x; m++) {
                  System.out.print(" " + matriz[m][matriz[0].length - 1 - y]);
                  n++;
               }
               flag++;
               break;

            case 2: //Recorrido de derecha a izquierda
               for (int m = matriz[0].length - 2 - y; m >= y; m--) {
                  System.out.print(" " + matriz[matriz.length - 1 - x][m]);
                  n++;
               }
               flag++;
               break;

            case 3: //Recorrido de abajo a arriba
               for (int m = matriz.length - 2 - x; m >= x + 1; m--) {
                  System.out.print(" " + matriz[m][y]);
                  n++;
               }
               flag = 0;
               //Se aumentan las filas y las columnas para un subnivel en el espiral
               x++;
               y++;
            break;
          }
        }
    }
}
