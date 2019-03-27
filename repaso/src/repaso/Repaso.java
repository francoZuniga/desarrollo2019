    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author fojeda
 */
public class Repaso {
    //algoritmo euclides
    //Desarrollo de Algoritmos - Recursado 2019 Pág.3
    public static int eu(int p, int q) {
    while (q != 0) {
        int temp = q;
        q = p % q;
        p = temp;
     }
    return p;
    }
    public static void main(String[] args) {
        int m, n, k;
        
        System.out.println("ingrese el primer numero:");
        m = teclado.Entero();
        System.out.println("ingrese le segundo numero:");
        n = teclado.Entero();
        
        k = eu(m, n);
        
        System.out.println("el maximo comun divisor de "+m+" y "+n+" es:"+k);
        
    }
}
