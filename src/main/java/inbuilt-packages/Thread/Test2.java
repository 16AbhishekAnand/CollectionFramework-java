public class Test2 {
    /* Thread and Thread group
     * When jvm gets allocated memory it creates some thread group 
     * like finializer & main. Main thread added to main thread group and Finializer is 
     * added to system thread group.
     */
    
     public static void main(String args[]) {
        System.out.println("Main started");
        Thread th = Thread.currentThread();
        ThreadGroup tg = th.getThreadGroup();
        System.out.println(th.getName()+"\t"+tg.getName());
        for(int i=0;i<args.length;i++) {
            String st = args[i];
            System.out.println(th.getName()+"\t"+tg.getName()+"\t"+st);
        }
        System.out.println("Main Completed");
     }
}
