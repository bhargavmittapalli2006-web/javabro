class prior extends Thread
{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                
                System.out.println(e);
                
            }
        }
    }
    public static void main(String args[]){
        prior p1=new prior();
         prior p2=new prior();
        prior p3=new prior();
        p1.setName("xyz");
        p2.setName("vce");
        p3.setName("abc");
        p1.setPriority(Thread.MAX_PRIORITY-2);//8
         p2.setPriority(Thread.MIN_PRIORITY+3);//4
         p3.setPriority(Thread.NORM_PRIORITY);//5
         p1.start();
         p2.start();
         p3.start();
         try
         {
            p1.join();//waits for p1 to die
            p2.join();  //waits for p2 to die
            p3.join();//waits for p3 to die
         }
         catch(InterruptedException e)
         {
            System.out.println(e);
         }
         System.out.println("I am  executed");


    }
}
