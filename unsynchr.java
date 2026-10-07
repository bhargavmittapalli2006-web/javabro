class Table{
    public void print(int n){
        for(int i =0 ; i<=10; i++){
            System.out.println(n+"*"+i+ "="+(n*i));
        }
    }
}
class Five extends Thread{
    Table t;
    public Five(Table t){
        this.t = t;
    }
    public void run(){
        t.print(5);
    }
}
class Ten extends Thread{
    Table t1;
    public Ten(Table t1){
        this.t1 = t1;
    }
    public void run(){
        t1.print(10);
    }
}
public class unsynchr{
    public static void main(String args[])throws InterruptedException{
        Table b = new Table();
        Five f = new Five(b);
        Ten n = new Ten(b);
        f.start();
        n.start();
        f.join();
        n.join();
        System.out.println("main method executed after child thread");
    }
}