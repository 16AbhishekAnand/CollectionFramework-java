import java.io.File;

class test1 {
 public static void main(String args[]) {
    File f1 = new File("t1.txt");
    File f2 = new File(f1,"f2.txt");
    boolean y = f2.exists();
    boolean x = f1.exists();
    File f3 = new File("resource","t3.txt");
    boolean a = f3.exists();

    
     
    System.out.println(x+" "+y+" "+a);

 }   
}