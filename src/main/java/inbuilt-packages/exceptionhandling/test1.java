package main.file.exceptionhandling;
import java.util.Scanner;
/*implementing try and catch */

class test1 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        try {
            System.out.println(100/x);
        }
        catch(ArithmeticException e) {
            System.out.println(e+" must be integer");
        }
        catch(NullPointerException a) {
            System.out.println(a);

        }
        System.out.println("maintain rest of code");
        inp.close();
    }
}