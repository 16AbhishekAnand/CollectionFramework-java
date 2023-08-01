public class This {
    int x = 10;
    void show() {
        int x = 20;
        System.out.println(x);
        System.out.println(this);
        System.out.println(this.x);
    }
    This() {
        System.out.println(this);
    }
    public static void main(String args[]) {
        This t1 = new This();
        System.out.println(t1);
        t1.show();

        This t2 = new This(); 
        System.out.println(t2); // differnt refid generates for new obj and new memory is allocated to "this" keyword in new object.
        t2.show();
    }
}
