import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Fcopy{
    public static void main(String args[]) throws  FileNotFoundException , IOException{
        FileInputStream fin=new FileInputStream("Login.java");
        FileOutputStream fout=new FileOutputStream("FileCopyOfFcopy.java");
        int k;
        while((k=fin.read())!=-1){
            fout.write(k);
            System.out.print((char)k);
        }
        fin.close();
        fout.close();

    }

}
