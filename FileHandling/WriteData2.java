import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
public class WriteData2 {
    public static void main(String[] args) throws IOException{
        File file=new File("S:\\code\\CoreJava\\FileHandling\\Sample\\D.txt");
        FileOutputStream f= new FileOutputStream(file);
        String s="java is easy";
        if(file.canWrite()){
            //f .write(s);//CTE
            byte[] b= s.getBytes();
            f.write(b);
        }else{
            System.out.println("can't write");
        }
        f.close();
    }
}
