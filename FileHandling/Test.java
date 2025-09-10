import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args)throws IOException {
        File folder= new File("S:\\code\\CoreJava\\FileHandling\\Sample");
        System.out.println(folder.mkdir()+" folder created");//creates folder
        System.out.println(" folder created");
        File file= new File("S:\\code\\CoreJava\\FileHandling\\Sample\\A.txt");
        File file2= new File("S:\\code\\CoreJava\\FileHandling\\Sample\\B.txt");
        System.out.println(file.createNewFile()+"File created: ");//creates file
        System.out.println(file.canRead()+" is Readable: " );
        System.out.println(file.canWrite()+" is Writable: ");
        System.out.println(file.canExecute()+" is Executable");
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        File f1=new File("S:\\code\\CoreJava\\FileHandling\\Sample\\BreplacedtoC.txt");
        System.out.println("File renamed: " + file2.renameTo(f1));
    }
}
