import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class ReverseOfFile{
    public static void main(String args[]) throws FileNotFoundException,IOException{
        File f=new File("Login.java");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("ReverseOfFile.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        StringBuffer sb=new StringBuffer(); 
        String s1,s2="";
        while((s1=br.readLine())!=null){
            sb.append(s1);
            sb.append("\n");
        }
        s2=sb.reverse().toString();
        bw.write(s2);
        System.out.println(s2);
        bw.close();
        fw.close();
        br.close();
        fr.close();

    }
}