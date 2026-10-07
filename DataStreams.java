import java.io.*;
class DataStreams{
    public static void main(String args[]) throws FileNotFoundException, IOException{
        File f=new File("Login.java");
        FileInputStream fis=new FileInputStream(f);
        DataInputStream dis=new DataInputStream(fis);
        FileOutputStream fos=new FileOutputStream("BufferedCopyOfCBox.java");
        DataOutputStream dos=new DataOutputStream(fos);
        String k;
        while((k=dis.readLine())!=null){
            dos.writeBytes(k);
            System.out.print(k);
        }
        dos.close();
        fos.close();
        dis.close();
        fis.close();

    }
}