public class StringMethods{
    public static void main(String[] args) {
        String s = "Engineering ";
        System.out.println("character at specified is : " + s.charAt(1)+s.charAt(2));
        System.out.println("index of : " + s.indexOf("n"));
        System.out.println("index of  : " + s.indexOf("ngi"));  
        System.out.println("last index of  : " + s.lastIndexOf("e"));    
        // Scanner sc = new Scanner(System.in);
        // char c = sc.next().charAt(4);
        // System.out.println("char: "+c);
        String s2 = "JAVA";
        System.out.println(s.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println("length:" + s.length());
        String s3 = "  Hsection  ";
        System.out.println("length: "+ s3.length());
        String s4 = s3.trim();
        System.out.println("length: "+ s4.length());
        String s5 = s.concat(s2);
        System.out.println(s5);
        String s6 = s5 + s;
        System.out.println(s6);
        System.out.println(s6+2+3);
        System.out.println(2+3+s6);
        System.out.println("starts "+ s.startsWith("E"));
        System.out.println("ends "+ s2.endsWith("AVA"));
        String s7 = "College";
        System.out.println("part of a string "+s7.substring(1));
        System.out.println("part of a string "+s7.substring(1,5));
        String s8 = "abc";
        System.out.println(s8.hashCode());
        System.out.println(s8.codePointAt(1));

    }
}