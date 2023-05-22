public class FizzBuzz {
    public static void main(String args[]) {
        int count3=0; int count5=0;
        for(int i=1;i<=100;i++) {
            count3++;
            count5++;
            if(count3==3) {
                System.out.println("fizz");
                count3=0;
            }
            else if(count5==5) {
                System.out.println("Buzz");
                count5=0;
            }
            else {
                System.out.println(i);
            }
        }

    }
}


