
package tp5;

public class contexto1 {
    
    public static void main(String[] args){
        int[][] alumnos = {{5 ,6 ,5 ,7 ,10},{12 ,10 ,11 ,8 ,15},{10 ,11 ,9 ,10 ,12},{10 ,12 ,8 ,9 ,16},{3 ,2 ,4 ,5 ,7}};
        
        //cargamos el arreglo
        int[][] arreglo = ingresarCantidad();
        //a) Cantidad de grupos de más de 7 niños. ¿Qué porcentaje representa del total de grupos?
        System.out.println("la cantidad de equipos con mas de 7 es: "+contadorEquiposJugadores(arreglo)+" representa el :"+porcentajeEquipos(contadorEquiposJugadores(arreglo), arreglo));
        //b)Cantidad de alumnos por escuela. ¿Qué porcentaje representa del total?
        cantidadAlumnosEscuela(arreglo);
        mostrarPorcenje(porcentajeEscuelas(arreglo));
        //c) ¿Qué categorías y de qué escuela no llegan a armar un grupo de 7 para jugar un partido?
        System.out.println("las escuelas y categorias que no llegan a armar un equipo: ");
        categoriaSinParticipar(arreglo);
        //d)mostrarPromedioCategoria
        mostrarPromedioCategoria(promedioCategoria(arreglo));
        //e) El grupo más grande, indicando además la categoría y la escuela.
        gruposMasPeuqeño(arreglo);
        //f)el grupó mas pequeño
        GrupoMasGrande(arreglo);
        //System.out.println(porcentajeAlumnos(40, 400));
    }
    
    public static int[][] ingresarCantidad(){
        int[][] arreglo = new int[5][5];
        
        for(int i = 0; i< arreglo.length; i++){
            //mostramos la ecuela
            for(int j = 0; j< arreglo[0].length; j++){
                //mostramos la categoria
                arreglo[i][j] = teclado.Entero();
            }
        }
        return arreglo;
    }
    
    public static int contadorEquiposJugadores(int[][] arreglo){
        int contador = 0;
        
        for(int i=0; i<arreglo.length;i++){
            for(int j=0; j<arreglo[0].length; j++){
                if(arreglo[i][j] >= 7){
                    contador++;
                }
            }
        }
        return contador;
    }
    
    public static double porcentajeEquipos(int equiposJugables, int[][] arreglo){
        int totalEquipos = arreglo.length * arreglo[0].length;
        
        return ((double)equiposJugables / (double)totalEquipos) * 100;
    }
    
    public static double porcentajeAlumnos(int cantidadAlumnosEscuela, int totalAlumnos){
        //develve el porcentaje que significa una cantidad sobre el total
        //ej: si 30 es X% de 100, obtenemos X que seria 30 
        return ((double)cantidadAlumnosEscuela / (double)totalAlumnos) * 100;
    }
    
    public static double[] porcentajeEscuelas(int[][] arreglo){
        //obtenemos el porcentaje de cada escuala en el total
        //ej; n°12 = 25%, n°23 = 25%, n°2 = 35 %,  n°23 = 15%
        int sumatoria = 0;
        int total = 217; //va el modulo de total, total();
        double[] arregloPorcentaje = new double[arreglo.length];
        
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo[0].length; j++){
                sumatoria = sumatoria + arreglo[i][j];
            }
            arregloPorcentaje[i] = porcentajeAlumnos(sumatoria, total);
            sumatoria = 0;
        }
        
        return arregloPorcentaje;
    }
    
    public static int[] promedioCategoria(int[][] arreglo){
        int[] promedio = new int[arreglo[0].length];
        int contador = 0; 
        for(int j=0; j<arreglo[j].length; j++){
            for(int i=0 ; i<arreglo.length; i++){
                contador =  contador + arreglo[i][j];
            }
            promedio[j] = contador / arreglo[0].length;
        }
        return promedio;
    }
    
    public static void mostrarPromedioCategoria(int[] promedio){
        for(int i=0; i< promedio.length; i++){
            switch(i){
                case 0:
                    System.out.println("el promedio de la categoria M4 es:"+promedio[i]);
                    break;
                case 1:
                    System.out.println("el promedio de la categoria M6 es:"+promedio[i]);
                    break;
                case 2:
                    System.out.println("el promedio de la categoria M7 es:"+promedio[i]);
                    break;
                case 3:
                    System.out.println("el promedio de la categoria M8 es:"+promedio[i]);
                    break;
                case 4:
                    System.out.println("el promedio de la categoria M10 es:"+promedio[i]);
                    break;
                default:
                    System.out.println("el promedio de la categoria n/n es:"+promedio[i]);
                    break;
            }
        }
    }
    
     public static void categoriaSinParticipar(int[][] cantidad) {

        String[] lasEscuelas;

        for (int i = 0; i < cantidad.length; i++) {
            for (int j = 0; j < cantidad[0].length; j++) {
                //llamo al modulo, Escuela, este indica la escuela que no participan
                if (cantidad[i][j] < 7) {
                    //llamo al modulo, Escuela, este indica la escuela que no participan
                    escuela(i);
                    //llamo al modulo, Categoria, este indica la categoria que no participan
                    categoria(j);
                }
            }
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
    
    public static void GrupoMasGrande(int[][] cantidad) {
        int refenrecia = cantidad[0][0];
        int k = 0;
        int l = 0;
        for (int i = 0;i < cantidad.length;i++) {
            for (int j = 0; j < cantidad[0].length; j++) {
                if (cantidad[i][j]>refenrecia) {
                    k = i;
                    l = j;
                }
            }
        }
        System.out.println("el grupo mas grande es: "+escuela(k)+" en la categoria: "+categoria(l));
    }
    
    public static void gruposMasPeuqeño(int[][] cantidad) {
        int refenrecia = cantidad[0][0];
        int k = 0;
        int l = 0;
        for (int i = 0;i < cantidad.length;i++) {
            for (int j = 0; j < cantidad[0].length; j++) {
                if (cantidad[i][j]>refenrecia) {
                    k = i;
                    l = j;
                }
            }
        }
        System.out.println("el grupo mas grande es: "+escuela(k)+" en la categoria: "+categoria(l));
    }
    
    public static void cantidadAlumnosEscuela(int[][] arreglo){
        int contador = 0;
        for(int i=0; i<arreglo.length; i++){
            for(int j=0; j<arreglo[0].length;j++){
                contador++;
            }
            switch(i){
                case 0:
                    System.out.print("la cantidad de alumnos de Los Patos (Centenario) es :"+contador+"\n");
                break;
                case 1:
                    System.out.print("la cantidad de alumnos de Marabunta (Cipolletti) es :"+contador+"\n");
                break;
                case 2:
                    System.out.print("la cantidad de alumnos de RRC (Roca) es :"+contador+"\n");
                break;
                case 3:
                    System.out.print("la cantidad de alumnos de NRC (Neuquén) es :"+contador+"\n");
                break;
                case 4:
                    System.out.print("la cantidad de alumnos de ARC (Allen) es :"+contador+"\n");
                break;
                default:
                    System.out.print(contador+"\n");
                break;
            }
        }
    }
    
    public static void mostrarPorcenje(double[] porcentaje){
        for(int i = 0; i < porcentaje.length;i++){
            switch(i){
                case 0:
                    System.out.print("Los Patos (Centenario) "+porcentaje[i]+"% \n");
                break;
                case 1:
                    System.out.print("Marabunta (Cipolletti)"+porcentaje[i]+"% \n");
                break;
                case 2:
                    System.out.print("RRC (Roca) "+porcentaje[i]+"% \n");
                break;
                case 3:
                    System.out.print("NRC (Neuquén) "+porcentaje[i]+"% \n");
                break;
                case 4:
                    System.out.print("ARC (Allen) "+porcentaje[i]+"% \n");
                break;
                default:
                    System.out.print(porcentaje[i]+"% \n");
                break;
            }
        }
    }
}
