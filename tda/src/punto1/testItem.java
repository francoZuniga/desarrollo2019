package punto1;

public class testItem {
    public static void main(String[] args){
        item[] arreglo = carga();
        
    }
    
    public static void menu(){
        System.out.println("seleccione una de las siguientes opciones: ");
        System.out.println(
        " 1, Listado de ítems: Por cada ítem muestre su nro.de código, descripción, precio unitario y cantidad de stock \n" +
        " 2, Contar la cantidad de items sin stock.\n" +
        " 3, Contar la cantidad de items con un precio unitario menor a un valor dado.\n" +
        " 4, Aumentar a todos los ítems un porcentaje dado al precio unitario.");
    }
    
    public static item[] carga(){
        System.out.println("ingrese: la cantidad de items a cargar: ");
        int longitud = teclado.Entero();
        
        item[] arreglo = new item[longitud];
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("del item numero "+i+" ingrese: ");
            System.out.print("codigo: ");
            int codigo = teclado.Entero();
            System.out.print("precio unitario: ");
            double precioUnitario = teclado.Double();
            System.out.print("cantidad en stock ");
            int stock = teclado.Entero();
            System.out.print("descripcion: ");
            String descripcion = teclado.string();
            
            arreglo[i] = new item(codigo, precioUnitario, stock, descripcion);
        }
        
        return arreglo;
    }
    
    public static void cargaMenu(item[] arreglo){
        String continuar = "";
        do{
            menu();
            int opcion;
            opcion = teclado.Entero();
            
        }while(continuar.toUpperCase() != "S");
    }
    
    public static void listado(item[] arreglo){
        //listamos los items
        System.out.println("codigo, precio, stock, descripcion");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i].getItem());
        }
    }
    
    public static int contarItemStock(item[] arreglo){
        int contador = 0;
        for(int i=0; i < arreglo.length; i++){
            if(arreglo[i].getStock() <= 0){
                contador++;
            }
        }
        return contador;
    }
    
    public static int contadorPrecioMinimo(item[] arreglo, double precioUnitario){
        int contador = 0;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i].getMinimoPrecioUnitario(precioUnitario)){
                contador ++;
            }
        }
        return contador;
    }
}
