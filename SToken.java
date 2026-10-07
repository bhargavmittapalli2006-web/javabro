import java.util.StringTokenizer;
public class SToken {
    public static void main(String args[]){
        String s="Hello, I am Sai Bhargav";
        StringTokenizer st=new StringTokenizer(s," ");
        System.out.println("No of tokens:"+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        String s2="hello;i@am!vishnu@tej!rendla";
        StringTokenizer st2=new StringTokenizer(s2,";,@,!,,");
        System.out.println("No of tokens:"+st2.countTokens());
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
        String s3="10 20 30 40 50";
        StringTokenizer st3=new StringTokenizer(s3," ");
        System.out.println("No of tokens:"+st3.countTokens());
        System.out.println("Tokens are:");
        int sum=0;
        while(st3.hasMoreTokens()){
            sum=sum+Integer.parseInt(st3.nextToken()); 
            }
            System.out.println("Sum of tokens:"+sum);
    }
}