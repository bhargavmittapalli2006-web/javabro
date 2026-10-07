public class Tmethods extends Thread{
    public static void main(String args[]){
        Tmethods t = new Tmethods();
        System.out.println("Name " + t.getName());
        t.setName("H section");
        System.out.println("Name " + t.getName());
        System.out.println("priority " +t.getPriority());
        t.setPriority(8);
        System.out.println("priority " +t.getPriority());
        System.out.println("is alive " +t.isAlive());
        System.out.println("is interrupted " +t.isInterrupted());
        System.out.println("is daemon " +t.isDaemon());
        System.out.println("thread group " +t.getThreadGroup());
        System.out.println("state " +t.getState());
        t.setDaemon(true);
        System.out.println("is daemon " +t.isDaemon());
        t.start();
       
    }
}