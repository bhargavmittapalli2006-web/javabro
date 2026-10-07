import java.util.*;
class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String msg){
        super(msg);
    }}
    public class bank{
            public static void main( String args[]) throws InsufficientFundsException
            {
                Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
               int y=sc.nextInt();
                if(y-x<0){
                    throw new InsufficientFundsException("insufficient funds . can't be less than 0.");
                }
                else{
                    System.out.println("u can withdraw money");
                }
                System.out.println("Example for user defined exception");
            }
    }
