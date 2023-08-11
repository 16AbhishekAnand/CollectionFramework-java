/* Thread can be implemented using by extending Thread class or
     * implementing the Runnable interface. Generally it preferred to 
     * implement the Runnable interfae due to limitation of multi-inheritance in java.
     * NOTE : Here JVM assigns default name 'Thrad 0,1,2...' to thread in format of Thred-<intValue>
     */

class MyThread extends Thread {  // s
    public void run() {
        Thread th = Thread.currentThread();
        //used to capture a reference to the thread in which the code is currently executing.
        for(int i=1;i<=3;i++) {
            System.out.println(th.getName()+"-value is: "+i);
        try {
            Thread.sleep(500);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        }
    }
}

public class Test3 {
    public static void main(String args[]) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.start();mt2.start();
        Thread th = new Thread();
        for(int i=100;i<110;i++) {
            System.out.println(th.getName()+"value is: "+i);
            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }    
    
    
}
