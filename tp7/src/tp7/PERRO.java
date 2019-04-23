package tp7;
public class PERRO {
   public String nombre, apellidoDueño, raza;
   public int año; 
   public double costo;
   public boolean cuidado;
   private double porcentaje = 15;
   private double precio = 100; 
   
   //constructores
   public PERRO(String argNombre,String argApellidoDueño,String argRaza){
       this.nombre = argNombre;
       this.apellidoDueño = argApellidoDueño;
       this.raza = argRaza;
   }
   
   public PERRO(String argNombre, String argApellidoDuño, String argRaza, int argAño, boolean argCuidado){
       this.nombre = argNombre;
       this.apellidoDueño = argApellidoDuño;
       this.raza = argRaza;
       if(argCuidado){
           this.costo = this.costo + porcentaje(porcentaje);
       }
       else{
           this.costo = precio; //queda a gusto del programador
       }
       this.año = argAño;
       this.cuidado = argCuidado;
   }
   //modificadores
   public void setNombre(String argNombre){
       this.nombre = argNombre;
   }
   
   public void setApellido(String argApellido){
       this.apellidoDueño = argApellido;
   }
   
   public void setRaza(String argRaza){
       this.raza = argRaza;
   }
   
   public void setCosto(double argCosto){
       this.costo = argCosto;
   }
   
   public void setAño(int argAño){
       this.año = argAño;
   }
   
   public void setCuidadoEspecial(boolean argCuidado){
       this.cuidado = argCuidado;
   }
   
   public void setPrecioProcentaje(double argPorcentaje){
       double precioDePorcentaje = porcentaje(argPorcentaje);
       this.costo = this.costo + precioDePorcentaje;
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
       String cuidado;
       if(this.cuidado){
           cuidado = "si";
       } else {
           cuidado = "no";
       }
       return "nombre: "+this.nombre+" dueño: "+this.apellidoDueño+" raza: "+this.raza+" año: "+this.año+" cuidado: "+cuidado;
   }
   //propias del tipo
   private double porcentaje(double argPorcentaje){
       return (this.costo * argPorcentaje)/100;
   }
   
   public boolean equals(PERRO argPerro){
       return this.nombre.equalsIgnoreCase(argPerro.nombre) && this.apellidoDueño.equalsIgnoreCase(argPerro.apellidoDueño) && this.raza.equalsIgnoreCase(argPerro.raza);
   }
}
