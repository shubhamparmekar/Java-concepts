package oops;
public class casting {
    public static void main(String[] args) {
        System.out.println("----WIDENING----");
        char c='a';
        int a=c;
        double d=a;
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);

        System.out.println("----NARROWING----");
        
        double d1=100.10;
        int a1=(int)d1;
        char c1=(char)a1;
        System.out.println(d1);
        System.out.println(a1);
        System.out.println(c1);
    }
}
