class First extends Thread{
    public void run(){
        int i;
         for(i =0; i < 10 ; i++){
            System.out.println("value of i : " + i);
            try {
               Thread.sleep(50); 
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
         }
    }
}
class Second implements Runnable{
    public void run(){
        int j;
        for(j=10; j>=0; j--){
            System.out.println(" value of j : "+j);
        
        try {
            Thread.sleep(50);
    
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }}
}
public class Multi {
    public static void main(String args[]){
        First f = new First();
       Thread d = new Thread(new Second());
        f.start();
        d.start();
    }
}