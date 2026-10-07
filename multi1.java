class print extends Thread{
    String name;
    public print(String name){
        this.name = name;
    }
    public void run(){
        for(int i = 10; i < 20; i++){
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class  characters extends Thread{
    char c[]={'H','S','E','C','T','I','O','N'};
    public void run(){
        for(char ch : c){
            System.out.println("letters: " + ch);
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class multi1 {
    public static void main(String args[]){
        print t = new print("numbers");
       // print p2 = new print("Thread 2");
        characters h = new characters();
        t.start();
        //p2.start();
        h.start();
    }
}