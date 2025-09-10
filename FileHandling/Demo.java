import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("S:\\code\\CoreJava\\FileHandling\\Sample\\D.txt");
        FileOutputStream f1=new FileOutputStream("S:\\code\\CoreJava\\FileHandling\\Sample\\E.txt",true);
        int n=f.read();
        while(n!=-1){
            System.out.print((char)n);
            f1.write(n);
            n=f.read();
        }
        // f.close();
        // f1.close();
    }
    
}
