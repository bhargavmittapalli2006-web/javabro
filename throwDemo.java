import java.util.*;
public class throwDemo
{
    public static void main(String args[]){
     Scanner  sc=new Scanner(System.in);
     int b=sc.nextInt();
     if(b<=0){
        throw new ArithmeticException("this number is not allowed");
     }
     else
     {
System.out.println("No problem");
     }
     System.out.println("i am printed");
    }
}
