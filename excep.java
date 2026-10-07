public class excep{
    public static void main(String args[]){
        String s="bhargav";
        try{
            System.out.println(s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}