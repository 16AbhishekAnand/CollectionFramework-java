// Nesting of class can be used inside interface or class.
// Whenever nesting of class is implemented there is speerate .class file is made of innner and outer class.
//Syntax -> outerClass.nestedClass var = new outerClass.nestedClass();


class Demo {
     int x=10;
    String name = "Suresh";
    
    static class inner {
        int y;
        void show() {
            System.out.println("show implemented");
        }
    }
    void display() {
        System.out.println("Display Sucessfull!");
    }
    
    public static void main(String[] srgs) {
        Demo d = new Demo();
        System.out.println(d.x+" "+d.name); // non-static var/method can only be accessed thorugh object.
       d.display();
        // To run inner class
        Demo.inner check = new Demo.inner();
        check.show();
    }
}