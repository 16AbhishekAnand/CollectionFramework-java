import java.io.FileInputStream;

public class OutputStream {
    public static void main(String args[]) {
        try{
        FileInputStream fin=new FileInputStream("D:\\testout.txt");   
        int i =0;
        //i = fin.read(); // read single char of the word
        
        while((i=fin.read())!=-1) { // while((i=fin.read()!=-1) 
            // every time each char is read from file till its end.
            System.out.print((char)i);
        }
        
        fin.close();
        } 
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println();
            System.out.println("final block sucessful");
        }    
    }
    
}
