import java.util.*;
class WeekPasswordException extends Exception
{
    public WeekPasswordException(String msg){
        super(msg);
    }}
    public class passsword{
            public static void main( String args[]) throws WeekPasswordException
            {
                Scanner sc=new Scanner(System.in);
                String  x=sc.nextLine();
                if(x.length()<8 || x.length()>16 ){
                    throw new WeekPasswordException("Week password . cant be negative.");
                }
                else{
                    System.out.println("u can withdraw money");
                }
                System.out.println("Example for user defined exception");
            }
    }
