import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class Bufferd{
    public static void main(String args[]) throws FileNotFoundException, IOException{
        File f=new File("Login.java");
        FileInputStream fis=new FileInputStream(f);
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("BufferedCopyOfCBox.java");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int k;
        while((k=bis.read())!=-1){
            bos.write(k);
            System.out.print((char)k);
        }
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        

    }
}