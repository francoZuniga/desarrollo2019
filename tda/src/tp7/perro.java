package tp7;
public class perro {
   public String nombre, apellidoDueño, raza;
   public int año; 
   public double costo;
   public boolean cuidado;
   //constructores
   public perro(String argNombre,String argApellidoDueño,String argRaza){
       this.nombre = argNombre;
       this.apellidoDueño = argApellidoDueño;
       this.raza = argRaza;
   }
   
   public perro(String argNombre, String argApellidoDuño, String argRaza, int argAño, double argCosto, boolean argCuidado){
       this.nombre = argNombre;
       this.apellidoDueño = argApellidoDuño;
       this.raza = argRaza;
       this.costo = argCosto;
       this.año = argAño;
       this.cuidado = argCuidado;
   }
   //observadores
   public String getNombre(){
       return this.nombre;
   }
   
   public String getApellidoDueño(){
       return this.apellidoDueño;
   }
   
   public String getRaza(){
       return this.raza;
   }
   
   public int getAño(){
       return this.año;
   }
   
   public double getCosto(){
       return this.costo;
   }
   
   public boolean getCuidado(){
       return this.cuidado;
   }
   
   public String toString(){
       String cuidado = "no";
       if(this.cuidado){
           cuidado = "si";
       }
       return "nombre: "+this.nombre+" dueño: "+this.apellidoDueño+" raza: "+this.raza+" año: "+this.año+" costo: "+cuidado;
   }
   //modificadores
   public void setCosto(double argCosto){
       this.costo = argCosto;
   }
   
   public void setPrecioProcentaje(double argPorcentaje){
       double precioDePorcentaje = porcentaje(argPorcentaje);
       this.costo = this.costo + precioDePorcentaje;
   }
   //propias del tipo
   private double porcentaje(double argPorcentaje){
       return (this.costo * argPorcentaje)/100;
   }
}
