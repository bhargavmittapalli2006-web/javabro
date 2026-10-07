import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=s.length();
        String rev="";
        for(int i=k-1 ; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }







        System.out.println(s.length());
        char  ch[]=s.toCharArray();
        System.out.println(ch.length);
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}