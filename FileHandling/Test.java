import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args)throws IOException {
        File folder= new File("S:\\code\\Workshop\\FileHandling\\Sample");
        System.out.println(folder.mkdir()+" folder created");//creates folder
        System.out.println(" folder created");
        File file= new File("S:\\code\\Workshop\\FileHandling\\Sample\\A.txt");
        System.out.println(file.createNewFile()+"File created: ");//creates file
        System.out.println(file.canRead()+" is Readable: " );
        System.out.println(file.canWrite()+" is Writable: ");
        System.out.println(file.canExecute()+" is Executable");
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        File f1=new File("S:\\code\\Workshop\\FileHandling\\Sample\\CC.txt");
        System.out.println("File renamed: " + file.renameTo(f1));
    }
}
