import java.util.*;
public class Stringmethods{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the String:");
        String s=sc.nextLine();
        System.out.println("Length:"+s.length());
        System.out.println("charat:"+s.charAt(2));
        System.out.println("Upper case:"+s.toUpperCase());
        System.out.println("Lower case:"+s.toLowerCase());
        System.out.println("Start with:"+s.startsWith("p"));
        System.out.println("end with:"+s.endsWith("n"));
        System.out.println("Contains:"+s.contains("program"));
        System.out.println("index:"+s.indexOf("a"));
    }
}