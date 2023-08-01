package main.file.exceptionhandling;
/*-> throw works as user-define exception 
-> throw don't allow to maintain rest of the code.*/
import java.util.Scanner;

public class test3 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        inp.close();
        if(x<18) {
            throw new ArithmeticException("Age must be above 18");
        }
        System.out.println("Rest of code , age "+x);
        }
}
