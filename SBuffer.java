public class SBuffer{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer();
        System.out.println("Initial capacity of StringBuffer: "+sb.capacity());
        System.out.println("Initial length of StringBuffer: "+sb.length());
        sb.append("vardhaman");
        sb.append(10);
        sb.append(10.56);
        sb.append(true);
        System.out.println("StringBuffer after appending: "+sb);
        StringBuffer sb1=new StringBuffer("java");
        System.out.println("StringBuffer with initial value: "+sb1);
        System.out.println("Capacity of StringBuffer: "+sb1.capacity());
        System.out.println("Reversed StringBuffer: "+sb1.reverse());
        System.out.println(sb1.replace(0,2,"s")); 
        System.out.println(sb1.delete(0,2));
        sb.insert(0,"java");
        System.out.println("StringBuffer after inserting: "+sb);

    }
}