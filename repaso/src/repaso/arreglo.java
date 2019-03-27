package repaso;
public class arreglo {
    public static boolean igualdad(int[] arreglo1, int[] arreglo2){
        boolean logico = true;
        int i = 0;
        if(arreglo1.length == arreglo2.length){
            while(i < arreglo1.length && logico){
                if(arreglo1[i] != arreglo2[i]){
                    logico = false;
                }
                i++;
            }
        }
        else{
            logico = false;
        }
        return logico;
    }
    public static void main(String[]args){
        int[] arreglo1 = {2,5,3,1,1,3};
        int[] arreglo2 = {2,5,3,1,1,3};
        
        if(igualdad(arreglo1, arreglo2)){
            System.out.println("son primos!!");
        }
        else{
            System.out.println("no son parientes!!");
        }
    }
}
