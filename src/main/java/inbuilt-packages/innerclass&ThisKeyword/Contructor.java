class Contructor {
    Contructor() {
        this(40);
        System.out.println("call A");
    }
    
    Contructor(int a) {
        this(4,3);
        System.out.println(a);
    }
    Contructor(int a,int b) {
        System.out.println(a+b);
    }
    public static void main(String args[]) {
        new Contructor();
        
    }
    
}
