package tp7;
public class Tp7 {
    public static void main(String[] args) {
        //creamos un arreglo de perros y uno de la cantidad de dias que se queda el animal
        perro[] arreglo;
        int[] dias;
        int longitud = 0;
        //cargamos los dos
        while(longitud < 10){
            System.out.println("ingrese la cantidad de perros a ingresar: ");
            longitud = teclado.Entero();
            System.out.println("ingrese un numero mayor a 0:");
        }
        //cargamos los primeros diez perros
        arreglo = new perro[longitud];
        dias = new int[longitud];
        //los primeros 10 perros
        arreglo[0] = new perro("pocho", "albarez", "caniche", 200, false);
        dias[0] = 2;
        arreglo[1] = new perro("ramiro", "", "", 200, false);
        dias[1] = 4;
        arreglo[2] = new perro("", "", "", 200, true);
        dias[2] = 1;
        arreglo[3] = new perro("", "", "", 200, false);
        dias[3] = 2;
        arreglo[4] = new perro("", "", "", 200, false);
        dias[4] = 2;
        arreglo[5] = new perro("", "", "", 200, false);
        dias[5] = 2;
        arreglo[6] = new perro("", "", "", 200, true);
        dias[6] = 2;
        arreglo[7] = new perro("", "", "", 200, false);
        dias[7] = 2;
        arreglo[8] = new perro("", "", "", 200, false);
        dias[8] = 2;
        arreglo[9] = new perro("", "", "", 200, true);
        dias[9] = 2;
    }
    
    public static void menu(){
        //mostrmos el menu de opciones
    }
    
    public static void carga(){
        //donde recibimos las opciones y las operamos con los datos de los arreglos
    }
    
    public static void mustraDeuda(perro[] arreglo, int[] dias){
        //mostramos las deuda de cada dueño
    }
    
    public static int busquedaPerro(perro[] arreglo, String argNombre, String argApellido, String argRaza){
        //retornamos la pocione donde se encuentra un perros en particular
        
    }
    
    public static boolean comparacionPerros(String argNombre, String argApellido, String argRaza){
        //comparamos con los perros de la cadena para verificar que no se repitan los datos
    }
    
    public static boolean modificacionPerros(String argNombre, String argApellido, String argRaza, double argCosto, boolean argCuidado){
        //modificamos el perro si se modifico retornamos un true, si no un false
    }
    
    
}
