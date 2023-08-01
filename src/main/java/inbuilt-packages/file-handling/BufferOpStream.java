import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOpStream {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        
        String s = "Buffer section is being excueted.";
        byte b[]  =s.getBytes();
        bout.write(b);
        bout.flush(); //The flush(); flushes the data of one stream and send it into another. 
        /*It is required if you have connected the one stream with another*/
        bout.close();
        fout.close();
        System.out.println("Sucess");

    }
    
}
