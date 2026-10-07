import java.util.*;
class FileFormatException extends Exception
{
    public FileFormatException(String msg){
        super(msg);
    }}
    public class FFE{
            public static void main( String args[]) throws FileFormatException
            {
                Scanner sc=new Scanner(System.in);
                String  x=sc.nextLine();
                if(x.endsWith(".pdf")== false){
                    throw new FileFormatException("Invalid file format.");
                }
                else{
                    System.out.println("Correct file format");
                }
                System.out.println("Example for user defined exception");
            }
    }
