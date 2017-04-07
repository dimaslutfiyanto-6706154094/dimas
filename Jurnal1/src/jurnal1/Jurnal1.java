/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci ");
        int n = show.nextInt();
        long fib[] = new long[n];
        
        int i = 1;
        fib[0] = 0;
        fib[1] = 1;
         
        for( i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for ( i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
        
    }
    
}
