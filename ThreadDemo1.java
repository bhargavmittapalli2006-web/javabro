public class ThreadDemo1 implements Runnable
{
    public void run(){
        int i;
        for(i=0; i<10; i++){
            System.out.println("values "+i);
            try{
                Thread.sleep(50);}
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String args[])
    {
        ThreadDemo1 d = new ThreadDemo1(); 
        Thread t = new Thread(d);
        t.start();
        
    }
}