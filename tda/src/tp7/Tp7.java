package tp7;
import punto1.teclado;
public class Tp7 {
    public static void main(String[] args) {
        //creamos un arreglo de perros y uno de la cantidad de dias que se queda el animal
        perro[] arreglo;
        int[] dias;
        //cargamos los dos
        System.out.println("ingrese la cantidad de perros a ingresar: ");
        int longitud = teclado.Entero();
        arreglo = new perro[longitud];
        dias = new int[longitud];
        
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("ingrese los datos del perro:");
            System.out.println("ingrese el nombre del perro:");
            String argNombre = teclado.string();
            System.out.println("ingrese el apellido del perro:");
            String argApellido = teclado.string();
            System.out.println("ingrese la raza: ");
            String argRaza = teclado.string();
            System.out.println("ingrese el año de nacimineto: ");
            int argAño = teclado.Entero();
            System.out.println("tiene cuidado: S/n");
            char argDecicion = teclado.Char();
            boolean argCuidado= false;
            if(argDecicion == 's' || argDecicion == 'S'){
                argCuidado = true;
            }
            System.out.println("cuantos dias se queda el perro: ");
            int argDias = teclado.Entero();
            //cargasmos los datos en arreglo, y dias
            arreglo[i] = new perro(argNombre, argApellido, argRaza, argAño, argAño, argCuidado);
            dias[i] = argDias;
        }
    }
    
    public static void menu(){
        
    }
    
    public static void cargaDias(){
        
    }
}
