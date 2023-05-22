import java.util.ListIterator;
import java.util.Scanner;

public class coinGfg {
    public static void main(String args[]) {
        int match =0;
        Scanner inp =new Scanner(System.in); 
        System.out.println("Enter the size of coin array");
        int n = inp.nextInt(); 
        System.out.println("Eneter total no.of coin to be used");
        int k = inp.nextInt();
        int[] coin = new int[n];
        System.out.println("Input for array coin in sorted manner");
        for(int i=0;i<n;i++) {
            coin[i]=inp.nextInt();
        }
        for(int x : coin) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Enter the target to be fetched");
        int res = inp.nextInt();
        for(int j=0;j<k;j++) {
            int check = coin[n-1]*k;
            if(check<res) {
                System.out.println("not possible");
                break;
            }
            else {
                do {
                    n--; 
                    match = check+coin[n-1];  
                } while(match!=res);
                System.out.println(match);
            }
            

        }

    }
    
}
