package main.file.exceptionhandling;
/* -> implementing try,catch and finally 
 -> we can not write statement between try and catch block
 -> finally block always runs until program is not terminated using syos(exit) forcefully*/

 public class test2 {
    public static void main(String args[]) {
        int A[] = new int[3];
        try {
            for(int i=0;i<5;i++) {
                System.out.println(A[i]=i+1);
            }
        }    
            catch(Exception e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Rest of code");
            }

    }    
}
