public class methodChain {
    methodChain test() {
        System.out.println("method chainng");
        return this; // return the refid of object which calls the display()
    }
    methodChain add(int x,int y) {
        System.out.println(x+y);
        return this;
    }
    void display() {
        System.out.println("Sucessful using class name as datatype.");
    }
    public static void main(String args[]) {
        methodChain mc = new methodChain();
        mc.test().add(2,3).display();
    }
    
}
