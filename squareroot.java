import java.util.*;
class NegativeNumberException extends Exception
{
    public NegativeNumberException(String msg){
        super(msg);
    }}
    public class squareroot{
            public static void main( String args[]) throws NegativeNumberException
            {
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                if(x<0){
                    throw new NegativeNumberException("Invalid number . can't be less than 0.");
                }
                else{
                    System.out.println("Valid number");
                }
                System.out.println("Example for user defined exception");
            }
    }
