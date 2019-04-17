
package punto2;

public class testIngrediente {
    public static void main(String[] args){
        ingrediente i1 = new ingrediente();
        i1.setNombre("Harina");
        i1.setCantidad(2);
        i1.setUnidadMedida("taza");
        System.out.println(i1.getIngrediente());
    }
}
