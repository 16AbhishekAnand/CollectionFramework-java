package main.file.exceptionhandling;
/* -> to maintain rest of code throw can be used in try catch*/
public class test4 {
    public static void main(String args[]) {
        int x = 3;
            while(x>1) {
            
            try {
                throw new NullPointerException();
                
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(x);
            x--;
        }
    }
}
