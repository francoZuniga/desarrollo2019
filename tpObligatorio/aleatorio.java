public class aleatorio {
    private int numeroAleatorio;
    private boolean digitoGemelo;
    private boolean enFibonachi;
    
    public aleatorio(){
        int max = 40; 
        int min = 1; 
        int range = max - min + 1; 
        
        int guardar = (int)(Math.random() * range) + min;
        this.numeroAleatorio = guardar;
        this.digitoGemelo = this.gemelo(guardar);
        this.enFibonachi = this.estaEnFib(guardar);
    }
    
    private void setNumeroAleatorio(int numero){
        this.numeroAleatorio = numero;
    }
    
    private void setDigitoGemelo(boolean digito){
        this.digitoGemelo = digito;
    }
    
    private void setFibonachi(boolean fibonachi){
        this.enFibonachi = fibonachi;
    }
    
    private boolean gemelo(int numero){
        boolean mellisos;
        if(numero < 9){
            mellisos = false;
        }else{
            mellisos = this.dosUltimosIguales(numero) || this.gemelo(numero/10);
        }
        return mellisos;
    }
    
    public aleatorio clone(){
        aleatorio clone = new aleatorio();
        clone.numeroAleatorio = this.numeroAleatorio;
        clone.enFibonachi = this.enFibonachi;
        clone.digitoGemelo = this.digitoGemelo;
        return clone;
    }
    
    private boolean dosUltimosIguales(int numero){
        boolean iguales;
        if((numero%10)==((numero/10)%10)){
            iguales = true;
        }else{
            iguales = false;
        }
        return iguales;
    }
    
    public boolean estaEnFib(int m){
        boolean retorno = false;
        boolean control = true;
        int i = m;
        
        while(i >= 0 && control){
            if(m == fibonachi(i)){
                retorno = true;
                control = false;
            }
            if(m < fibonachi(i)){
                control = false;
            }
            i--;
        }
        return retorno;
    }
    
    public int fibonachi(int n){
        int retorno;
        if(n <= 0){
            retorno = 0;
        }else{
            if(n == 1){
                retorno = 1;
            }else{
                retorno = fibonachi(n-1) + fibonachi(n-2);
            }
        }
        return retorno;
    }
    
    public int getNumeroAleatorio(){
        return this.numeroAleatorio;
    }
    
    public boolean getDigitoGemelo(){
        return this.digitoGemelo;
    }
    
    public boolean getFibonachi(){
        return this.enFibonachi;
    }
    
    public boolean equals(aleatorio numero){
        return this.numeroAleatorio == numero.getNumeroAleatorio() && (this.enFibonachi && numero.getFibonachi()) && (this.digitoGemelo && numero.getDigitoGemelo());
    }
    
    public String toString(){
        String digito, fibonachi;
        if(this.digitoGemelo){
            digito = "si";
        }else{
            digito = "no";
        }
        if(this.enFibonachi){
            fibonachi = "si";
        }else{
            fibonachi = "no";
        }
        
        return "el numero aleatorio es: "+this.numeroAleatorio+" esta en fibonachi? :"+fibonachi+" tiene digitos gemelos?: "+digito;
    }
    
    public int compareTo(aleatorio numero){
        //retorno < 0 el numero comparado es mayor
        //retorno > 0 el numero comparado es menor 
        //retorno = 0 el numero comparado es igual 
        return numero.getNumeroAleatorio()-this.numeroAleatorio;
    }
}
