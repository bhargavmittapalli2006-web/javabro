import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
    String id,sname;
    public Student(String id,String sname){
        this.id=id;
        this.sname=sname;
    }
    public String toString(){
        return ("Student Id: "+id+" Student Name: "+sname);
    }
}
public class Pessist{
    public static void main(String args[]) {
        try{
        Student s1=new Student("25881A05GN","Sai Bhargav");
        FileOutputStream fos=new FileOutputStream("info.doc");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.flush();
        oos.close();
        System.out.println("Deserialization of Object");
        FileInputStream fis=new FileInputStream("info.doc");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s2=(Student)ois.readObject();
        System.out.println(s2);
        ois.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}