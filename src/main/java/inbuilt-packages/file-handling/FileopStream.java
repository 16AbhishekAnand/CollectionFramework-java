import java.io.FileOutputStream;


public class FileopStream {
    public FileopStream(String string) {
    }

    public static void main(String args[]) {
        try{    
            //FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt",true); // append on the file 
            
            String s = "File writing operation";
            String str = " hello world";
            // byte array output stream.
            byte t[] = str.getBytes();
            byte b[] = s.getBytes(); // converting string to byte array. 
            fout.write(t); // return ASCII of 65
            fout.write(b);    
            
            fout.close();    
            System.out.println("success...");    
        }
            catch(Exception e) {
                System.out.println(e);
            }
        
        }        
}
