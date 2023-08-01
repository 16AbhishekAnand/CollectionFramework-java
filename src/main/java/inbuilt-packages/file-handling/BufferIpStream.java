import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferIpStream {
    public static void main(String args[]) {
        try {
        FileInputStream fin = new FileInputStream("D:\\testout.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        // When a BufferedInputStream is created, an internal buffer array is created.
        int i;
        while((i=bin.read())!=-1) {
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
        }
        
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
    
}
