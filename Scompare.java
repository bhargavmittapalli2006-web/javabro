public class Scompare{
    public static void main(String[] args) {
        String s1 = "Hamza";
        String s2 = "Hamza";
        String s3 = "HAMZA";
        String s4 = new String("Hamza");
        if(s1.equals(s2)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("not equal");
        }
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("not equal");
        }
        if(s1 == s4){
            System.out.println("but not equal but same memory "); //doesn't check the values  it checks the memory location
        }
        else{
            System.out.println("No equal");
        }
        int x=s1.compareTo(s3);
                    System.out.println(x);// return integer value if both are equal it returns 0 if not equal it returns -1 or 1
        if(x==0){
            System.out.println("same");

        }
        else{
        System.out.println("not same");}
        int y=s1.compareToIgnoreCase(s3);
                    System.out.println(y);// return integer value if both are equal it returns 0 if not equal it returns -1 or 1
        if(y==0){
            System.out.println("same");

        }
        else
        System.out.println("not same");
        
    }
}