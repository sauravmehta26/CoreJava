import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException{
        File file =new File("S:\\code\\CoreJava\\FileHandling\\Sample\\C.txt");
        FileWriter f = new FileWriter(file,true);
        System.out.println("canWrite"+file.canWrite());
        if(file.canWrite()){
            f.write("saurav\t");
            f.write("kumar\t");
            f.write("mehta\n");
            System.out.println("done ");
        }else{
            System.out.println("can't write");
            
        }
        f.close();
        
    }
}
