/* Reading the data from 2 file and writing it to new file using sequence input stream */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Seq2Inp {
    public static void main(String args[]) throws Exception  {
        FileInputStream f1 = new FileInputStream("D:\\testout.txt"); // used to print in console.
        FileInputStream f2 = new FileInputStream("D:\\test.txt");
        FileOutputStream fout = new FileOutputStream("D:\\result.txt"); // uesed to write the data for srcCode.
        SequenceInputStream sobj = new SequenceInputStream(f1, f2);
        int i;
        while((i=sobj.read())!=-1) {
            fout.write(i);
        }
        f1.close(); f2.close();fout.close();sobj.close();
        System.out.println("Sucess");
        


    }
    
}
