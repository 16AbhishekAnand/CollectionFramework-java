package main.file.exceptionhandling;

import java.util.Scanner;

public class test5 {
    static Scanner inp = new Scanner(System.in);
    public static void main(String args[]) {
        int n = inp.nextInt();
        int a[] = new int[5];
        try {
            for(int i:a) {
            a[i]=inp.nextInt();
            }
            for(int j=0;j<a.length;j++) {
                if(n<1) throw new ArithmeticException("must be positive");
                System.out.println(a[j]+n);
                n--;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Rest of code");
            inp.close();
        }
    }
}
