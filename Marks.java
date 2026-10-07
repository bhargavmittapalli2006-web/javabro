import java.util.*;
class InvalidMarksException extends Exception
{
    public InvalidMarksException(String msg){
        super(msg);
    }}
    public class Marks{
            public static void main( String args[]) throws InvalidMarksException
            {
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                if(x<0 || x>100){
                    throw new InvalidMarksException("Invalid marks marks can't be less than 0 and greater than 100");
                }
                else{
                    System.out.println("Valid marks"+x);
                }
                System.out.println("Example for user defined exception");
            }
    }
