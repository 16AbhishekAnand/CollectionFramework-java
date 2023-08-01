import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
/* inputsteam is used for reading purpose and outputstream is used for writing purpose */
public class SeqInpStream {
    public static void main(String args[]) throws Exception {
        FileOutputStream f2=new FileOutputStream("D:\\test.txt"); // creating txtfile and write on it.
        String s = "Task is over";
        byte b[] = s.getBytes();
        f2.write(b);
        
        FileInputStream f1 = new FileInputStream("D:\\testout.txt"); 
        FileInputStream ftest = new FileInputStream("D:\\test.txt");
        SequenceInputStream sobj = new SequenceInputStream(f1, ftest);
        int i;
        while((i=sobj.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println("Sucess");
        f1.close();f2.close();ftest.close();sobj.close();
    }
    
}
