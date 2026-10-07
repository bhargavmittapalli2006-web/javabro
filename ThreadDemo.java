public class ThreadDemo extends Thread
{
    @Override
    public void run(){
        int i;
        for(i=0; i<10; i++){
            System.out.println("values "+i);
            try{
                Thread.sleep(50);}
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
       // t1.run();
        System.out.println("Thread is running..."+t1.isAlive());
        System.out.println("Thread is running..."+t1.getState());
    }

}










