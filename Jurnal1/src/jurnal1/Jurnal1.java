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
     private int[] a;

    private int fib(int i) {
        assert (i>=0);

        if (a[i]==0) {
            if (i==0 || i==1) {
                a[i] = 1;
            } else {
                a[i] = fib(i - 2) + fib(i - 1);
            }
        }

        return a[i];
    }

    public Jurnal1(int numberTerms) {
        if (numberTerms<2) throw new IllegalArgumentException("expect at least 2 terms for a Fibonacci sequence");
        a = new int[numberTerms];
    }

    public void print() {
        for (int i=a.length; i!=0; i--) {
            System.out.println(fib(i-1));
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jurnal1 f = new Jurnal1(10);
        f.print();        
    }
    
}
