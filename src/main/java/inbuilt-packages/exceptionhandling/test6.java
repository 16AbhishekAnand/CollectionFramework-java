//package main.file.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;


/* -> throws used with method defination. 
 * -> Generally preferd for checked exception.
 *  -> Checked exception are handled by complier and managed by developer. */

 public class test6 {
    static Scanner inp = new Scanner(System.in);
    public static void write() throws InputMismatchException {
        int x = inp.nextInt();
        System.out.println(x);
    }
    public static void main(String args[]) throws InputMismatchException{
        try {
        write();
        }
        finally {
        System.out.println("Rest of code");
        inp.close();
        }
    }
 }