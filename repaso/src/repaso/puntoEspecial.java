
package repaso;

public class puntoEspecial {
    public static void main(String[] args){
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("ingrese un valor: ");
            a[i] = teclado.Entero();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
