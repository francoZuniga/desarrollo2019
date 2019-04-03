
package tp5;

public class contexto3 {
    
    public static void main(String[] args){
        //cargamos las actividades del dia
        String[][] horarios = carga();
        //mostramos los horarios
        
    }
    
    public static String[][] carga(){
        String[][] horarios = new String[12][5];
        
        for(int j=0; j < horarios[0].length; j++){
            System.out.println("ingrese las actividades del dia :"+dia(j));
            for(int i = 0; i<horarios.length; i++){
                System.out.print("la actividad de la hora: "+(i+8));
                horarios[i][j] = teclado.string();
            }
        }
        return horarios;
    }
    
    public static void mostrar(String[][] horarios){ 
        for(int i=0; i < horarios.length; i++){
            System.out.print("la actividad de la hora: "+(i+8));
            for(int j = 0; j<horarios[0].length; j++){
                System.out.println("ingrese las actividades del dia :"+dia(j));
                System.out.println(horarios[i][j]);
            }
        }
    }
    
    public static String dia(int i){
        String dia;
        switch(i){
            case 0:
                dia = "lunes";
            break;
            case 1:
                dia = "martes";
            break;
            case 2:
                dia = "miercoles";
            break;
            case 3:
                dia = "jueves";
            break;
            case 4:
                dia = "miercoles";
            break;
            default:
                dia = "no dia";
            break;
        }
        return dia;
    }
}
