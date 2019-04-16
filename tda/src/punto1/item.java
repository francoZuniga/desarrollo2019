package punto1;

public class item {
    private int codigo, cantidadStock;
    private double precioUnitario;
    private String descripcion;
    
    //constructores
    public item(int argCodigo){
        this.codigo = argCodigo;
    }
    
    public item(int argCodigo, double argPrecioUnitario, int argCantidadStock, String argDescripcion){
        this.codigo = argCodigo;
        this.precioUnitario = argPrecioUnitario;
        this.cantidadStock = argCantidadStock;
        this.descripcion = argDescripcion;
    }
    
    //metodos set
    
    public void setAumentarPrecioUnitarioConPorcentaje(double porcentaje){
        //sacamos el precio de un porcentaje
        this.precioUnitario = (this.precioUnitario * porcentaje)/100;
    }
    
    //metodos get
    
    public String getItem(){
        return "codigo: "+this.codigo+" precio: "+this.precioUnitario+" cantidad en stock: "+cantidadStock+" descripcion: "+this.descripcion; 
    }
    
    public int getStock(){
        return this.cantidadStock;
    }
    
    public boolean getMinimoPrecioUnitario(double precioMinimo){
        boolean control = false;
        if(this.precioUnitario < precioMinimo){
            control = true;
        }
        return control;
    }
    
    public boolean equlsItem(item argItem){
        return this.codigo == argItem.codigo;
    }
}
