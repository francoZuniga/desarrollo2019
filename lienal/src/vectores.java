
public class vectores {
    private double[] vector;
    //contructor
    
    public vectores(double[] argArreglo){
        //cargamos 
        this.vector = new double[argArreglo.length];
        for(int i = 0; i<argArreglo.length; i++){
            this.vector[i] = argArreglo[i];
        }
    }
    
    //observadores
    
}
