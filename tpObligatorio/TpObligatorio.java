public class TpObligatorio {
    public static void cargaAleatorio(aleatorio[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = new aleatorio();
        }
    }
    
    public static void muestra(aleatorio[] arreglo){
        System.out.println("-----------------");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i].toString());
        }
    }
    
    public static aleatorio[] cloneArray(aleatorio[] arreglo){
        aleatorio[] clone = new aleatorio[arreglo.length];
        for(int i = 0; i < arreglo.length; i++){
            clone[i] = arreglo[i].clone();
        }
        return clone;
    }  
    
    public static void burbuja(aleatorio[] arreglo){
	aleatorio aux ;
        int i = 0;
	boolean band = false;
        
        while(i < arreglo.length-1 && band == false){
            band = true;
            for(int j = 0; j<arreglo.length-i-1; j++){
		if(arreglo[j].compareTo(arreglo[j+1])>0){
			aux = arreglo[j];
			arreglo[j]= arreglo[j+1];
			arreglo[j+1] = aux;
			band = false;
		}
            }
            i = i+1;			
        }
    }
    
    public static void incericion(aleatorio[] arreglo){
        aleatorio aux;
        int j;
        for(int i = 1; i < arreglo.length; i++){
            aux = arreglo[i].clone();
            j = i;
            while(j > 0 && aux.compareTo(arreglo[j-1]) < 0){
                arreglo[j] = arreglo[j-1];
                j--;
            }
            arreglo[j] = aux;
        }
    }
    
    public static void seleccion(aleatorio[] arreglo){
        int i,j,min;
        aleatorio tmp;
        for(i = 0; i < arreglo.length-1; i++){
            min = i;
            for(j = i+1; j < arreglo.length; j++){
                if(arreglo[j].compareTo(arreglo[min])<0){
                    min = j;
                }
            }
            tmp = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = tmp;
        }
    }
    
    public static boolean ordenadoDecreciente(aleatorio[] arreglo){
        boolean retorno = true;
        int i = 0;
        
        while(i < arreglo.length-1 && retorno){
            if(arreglo[i].compareTo(arreglo[i+1]) > 0){
                retorno = false;
            }
            i++;
        }
        return retorno;
    }
    
    public static void menu(){
        System.out.println("1. mostrar el arreglo creado");
        System.out.println("2. mostrar si el arreglo esta ordenado");
        System.out.println("3. mostrar el arreglo ordenado por seleccion");
        System.out.println("4. mostrar el arreglo ordenado por insercion");
        System.out.println("5. mostrar el arreglo ordenado por burbuja mejorado");
        System.out.println("6. mostrar los tiempos de ejecucion reales");
        
    }
    
    public static void main(String[] args) {
        aleatorio arr1[], arr2[], arr3[],arr4[];
        long tiempo1, tiempo2, tiempo3, tiempoInicial, tiempoFinal;
        boolean verif1, verif2, verif3;

       //generación aleatoria de arreglo iniciales 
       arr1 = new aleatorio[10];
       cargaAleatorio(arr1); 
       arr2 = cloneArray(arr1); 
       arr3 = cloneArray(arr1);
       arr4 = cloneArray(arr1);

       //calcular tiempo del metodo1 
       tiempoInicial = System.currentTimeMillis(); 
       burbuja(arr1); 
       tiempoFinal = System.currentTimeMillis();
       tiempo1 = tiempoFinal - tiempoInicial;

        //calcular tiempo del metodo2 
       tiempoInicial = System.currentTimeMillis(); 
       incericion(arr2); 
       tiempoFinal = System.currentTimeMillis();
       tiempo2 = tiempoFinal - tiempoInicial;
       
       //calcular tiempo del metodo2 
       tiempoInicial = System.currentTimeMillis(); 
       seleccion(arr3); 
       tiempoFinal = System.currentTimeMillis();
       tiempo2 = tiempoFinal - tiempoInicial;
       
       //mostramos los ordenamientos y los tiempos de ejeccion
       String opcion, continuar = "";
       do{
           System.out.println("ingrese unas de las siguientes opciones:");
           menu();
           opcion = teclado.string();
           switch(opcion.toLowerCase()){
               case "1":
                   muestra(arr1);
               break;
               case "2":
                   System.out.println("selecione algunos de los siguientes arreglos:");
                   System.out.println("1. normal");
                   System.out.println("2. ordenado por seleccion");
                   System.out.println("3. ordenado por insercion");
                   System.out.println("4. ordenado por bubuja mejorado");
                   String array = teclado.string();
                   boolean ordenado = true;
                   switch(array){
                       case "1":
                           ordenado = ordenadoDecreciente(arr4);
                       break;
                       case "2":
                           ordenado = ordenadoDecreciente(arr3);
                       break;
                       case "3":
                           ordenado = ordenadoDecreciente(arr2);
                       break;
                       case "4":
                           ordenado = ordenadoDecreciente(arr1);
                       break;
                       default:
                           System.out.println("elija una opcion correcta");
                       break;
                   }
                   if(ordenado){
                       System.out.println("esta ordenado!!");
                   }else{
                       System.out.println("no esta ordenado!!");
                   }
               break;
               case "3":
                   muestra(arr3);
               break;
               case "4":
                   muestra(arr2);
               break;
               case "5":
                   muestra(arr1);
               break;
               case "6":
                   
               break;
               default:
               break;
           }
           opcion = teclado.string();
       }while(continuar.equalsIgnoreCase("s"));
       
        
       //mostrarCartelTiempos (tiemp1, tiempo2, tiempo3)*/
       
       
    }   
}
