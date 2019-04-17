package punto2;
public class ingrediente {
    private String nombre, unidadMedida;
    private int cantidad;
    //constructor
    public ingrediente(){
        this.nombre = null;
        this.cantidad = 0;
        this.unidadMedida = null;
    }
    //modificadores
    public void setNombre(String argNombre){
        this.nombre = argNombre;
    }
    
    public void setCantidad(int argCantidad){
        this.cantidad = argCantidad;
    }
    
    public void setUnidadMedida(String argUnidadMedida){
        this.unidadMedida = argUnidadMedida;
    }
    //oservadores
    public String getIngrediente(){
        return "Nombre: "+this.nombre+" Unidad de Medida: "+this.unidadMedida+" Cantidad: "+this.cantidad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getUnidadMedida(){
        return this.unidadMedida;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
}
