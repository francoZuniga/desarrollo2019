package tp7;

public class Tp7 {

    public static void main(String[] args) {
        //creamos un arreglo de PERROs y uno de la cantidad de dias que se queda el animal
        PERRO[] arreglo;
        int longitud = 0;
        //cargamos los dos
        do{
            System.out.println("ingrese la cantidad de perros a ingresar: ");
            longitud = teclado.Entero();
        }while (longitud < 0);
        //cargamos los primeros diez PERROs
        arreglo = new PERRO[10+longitud];
        int[] dias = new int[10+longitud];
        //los primeros 10 PERROs
        arreglo[0] = new PERRO("pocho", "albarez", "caniche", 200, false);
        dias[0] = 2;
        arreglo[1] = new PERRO("ramiro", "mata", "batata", 200, false);
        dias[1] = 4;
        arreglo[2] = new PERRO("hinata", "zuñiga", "callejero", 200, true);
        dias[2] = 1;
        arreglo[3] = new PERRO("toto", "zuñiga", "labrador", 200, false);
        dias[3] = 2;
        arreglo[4] = new PERRO("toby", "zuñiga", "sky", 200, false);
        dias[4] = 2;
        arreglo[5] = new PERRO("manchita", "alcamil", "callejero", 200, false);
        dias[5] = 2;
        arreglo[6] = new PERRO("pepa", "alcamil", "dogo", 200, true);
        dias[6] = 2;
        arreglo[7] = new PERRO("ikaro", "aulman", "labrador", 200, false);
        dias[7] = 2;
        arreglo[8] = new PERRO("flaca", "noemi", "callejero", 200, false);
        dias[8] = 2;
        arreglo[9] = new PERRO("luna", "noemi", "galgo", 200, true);
        dias[9] = 2;
        //llammos al menu pasandole el arrelo
        menu(arreglo, dias);
    }
    public static void menu(PERRO[] argArreglo, int[] dias) {
        //mostrmos el menu de opciones
        dias[espacio(argArreglo)] = 2;
        System.out.println(espacio(argArreglo)+" "+dias[espacio(argArreglo)]);
        String continuar = "";
        do {
            //mostramos algunas de las opciones
            listadoMenu();
            int opcion = teclado.Entero();
            switch (opcion) {
                case 1:
                    carga(argArreglo, dias);
                break;
                case 2:
                    mustraDeuda(argArreglo, dias);
                break;
                case 3:
                    for(int i = 0; i<espacio(argArreglo); i++){
                        listarPerro(argArreglo, i);
                    }
                break;
                case 4:
                    System.out.println("buqueda:");
                    System.out.print("ingrese el nombre de un perro: ");
                    String argNombre = teclado.string();
                    System.out.print("ingrese un apellido de un dueño: ");
                    String argApellido = teclado.string();
                    System.out.print("ingrese la raza de un perro: ");
                    String argRaza = teclado.string();
                    if(busquedaPerro(argArreglo, argNombre, argApellido, argRaza) == -1){
                        System.out.println("el perro no esta en la gurderia!!");
                    }
                    else{
                        listarPerro(argArreglo, busquedaPerro(argArreglo, argNombre, argApellido, argRaza));
                    }
                break;
                case 5:
                    String argNombreModificacion, argApellidoModificacion, argRazaModificacion;
                    do{
                        System.out.println("modificar en base a:");
                        System.out.print("ingrese el nombre de un perro:");
                        argNombreModificacion = teclado.string();
                        System.out.print("ingrese un apellido de un dueño:");
                        argApellidoModificacion = teclado.string();
                        System.out.print("ingrese la raza de un perro:");
                        argRazaModificacion = teclado.string();
                        if(!comparacionPerros(argNombreModificacion, argApellidoModificacion, argRazaModificacion, argArreglo)){
                            System.out.println("el perro no se encuentra en la guarderia!!");
                        }
                        else{
                            System.out.println("ingrese el los datos a modificar:");
                            int posicion = busquedaPerro(argArreglo, argNombreModificacion, argApellidoModificacion, argRazaModificacion);
                            System.out.print("el nuevo nombre: ");
                            argNombreModificacion = teclado.string();
                            System.out.print("el nuevo apellido: ");
                            argApellidoModificacion = teclado.string();
                            System.out.print("la nueva raza: ");
                            argRazaModificacion = teclado.string();
                            System.out.println("el nuevo año de nacimiento: ");
                            int argAñoModificacion = teclado.Entero();
                            System.out.println("¿tiene cuidados especiales?: S/n");
                            String controlCuidado = teclado.string();
                            boolean argCuidadoModificacion;
                            if(controlCuidado.equalsIgnoreCase("s")){
                                argCuidadoModificacion = true;
                            }
                            else{
                                argCuidadoModificacion = false;
                            }
                            System.out.println("cuantos dias se queda: ");
                            int argDiasModificacion = teclado.Entero();
                            //modificamos el datos
                            if(modificacionPerros(argArreglo, dias, posicion, argNombreModificacion, argApellidoModificacion, argRazaModificacion, argCuidadoModificacion, argAñoModificacion, argDiasModificacion)){
                                System.out.println("se ha mnodificado el perro!!");
                            }                            
                        }
                    }while(!comparacionPerros(argNombreModificacion, argApellidoModificacion, argRazaModificacion, argArreglo));
                break;
                case 6:
                    System.out.println(espacio(argArreglo));
                break;
                default:
                    System.out.println("la opcion no existe ingrese una de las dadas!!");
                break;
            }
            System.out.println("desea continuar: S/n");
            continuar = teclado.string();
        }while (continuar.equalsIgnoreCase("s"));
    }

    public static void listadoMenu() {
        System.out.println("1. cargar un perro:");
        System.out.println("2. mostramos la duda al dueño:");
        System.out.println("3. listamos a los perros de la guarderia:");
        System.out.println("4. mostramos los datos de un perro(buscandolo por nombre, dueño, y raza): ");
        System.out.println("5. modificamos a un PERRO por su nombre, apellido, y raza:");
    }

    public static void carga(PERRO[] argArreglo, int[] dias) {
        boolean argControl, control = false;
        String argNombre, argApellido, argRaza, controlCuiado;
        int argAño, argDias, longitud = espacio(argArreglo);
        if (espacio(argArreglo) == argArreglo.length) {
            System.out.println("ya no hay espacio en la guarderia!!");
        } else {
            do{
                System.out.println("ingrese el nombre del perro: ");
                argNombre = teclado.string();
                System.out.println("ingrese el apellido del dueño: ");
                argApellido = teclado.string();
                System.out.println("ingrese la raza del perro:");
                argRaza = teclado.string();
                System.out.println("ingrese un año de nacimiento: ");
                argAño = teclado.Entero();
                System.out.println("¿el perro tiene cuidados especiales?: S/n");
                String controlCuidado = teclado.string();
                if(controlCuidado.equalsIgnoreCase("s")){
                    argControl = true;
                }
                else{
                    argControl = false;
                }
                control = comparacionPerros(argNombre, argApellido, argRaza, argArreglo);
            }while(control);
            System.out.println("cuantos dias se quedara en la guarderia:");
            argDias = teclado.Entero();
            argArreglo[longitud] = new PERRO(argNombre, argApellido, argRaza, argAño, argControl);
            dias[longitud] = argDias;
        }
    }

    public static int espacio(PERRO[] argPerros) {
        //retornamos el primer espacio vacio del arreglo
        boolean control = true;
        int pos = argPerros.length;
        int i = 0;
        while(control && i<argPerros.length){
            if(argPerros[i]==null){
                control = false;
                pos = i;
            }
            else{
                i++;
            }
        }
        return pos;
    }

    public static void mustraDeuda(PERRO[] arreglo, int[] dias) {
        //mostramos las deuda de cada dueño
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == null){
                System.out.println("-");
            }
            else{
                System.out.println("el dueño: "+arreglo[i].getApellidoDueño()+" del perro llamado: "+arreglo[i].getNombre()+" debe pagar: "+arreglo[i].getCosto()*dias[i]);
            }
        }
    }
    
    public static void listarPerro(PERRO[] argArreglo, int posicion){
        System.out.println(argArreglo[posicion].toString());
    }

    public static int busquedaPerro(PERRO[] arreglo, String argNombre, String argApellido, String argRaza){
        //retornamos la pocione donde se encuentra un PERROs en particular
        PERRO conparar = new PERRO(argNombre, argApellido, argRaza);
        int pos = -1;
        boolean control = true;
        int i = 0;
        while(i < espacio(arreglo) && control){
            if(arreglo[i].equals(conparar)){
                pos = i;
                control = false;
            }
            else{
                i++;
            }
        }
        return pos;
    }

    public static boolean comparacionPerros(String argNombre, String argApellido, String argRaza, PERRO[] argPerros){
        //comparamos con los PERROs de la cadena para verificar que no se repitan los datos
        boolean control = false;
        int i = 0;
        while(!control && i < espacio(argPerros)){
            PERRO comparar = new PERRO(argNombre, argApellido, argRaza);
            if(argPerros[i].equals(comparar)){
                control = true;
            }
            i++;
        }
        return control;
    }
    
    

    public static boolean modificacionPerros(PERRO[] argArreglo,int[] dias, int posicion, String argNombre, String argApellido, String argRaza, boolean argCuidado, int argAño, int argDias) {
        //modificamos el PERRO si se modifico retornamos un true, si no un false
        argArreglo[posicion].setNombre(argNombre);
        argArreglo[posicion].setApellido(argApellido);
        argArreglo[posicion].setRaza(argRaza);
        argArreglo[posicion].setAño(argAño);
        argArreglo[posicion].setCuidadoEspecial(argCuidado);
        dias[posicion] = argDias;
        return true;
    }

}
