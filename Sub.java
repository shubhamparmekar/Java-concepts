package oops;

public class Sub extends Super {
    Sub()
    {
        super(10);
        System.out.println("Sub Class");
    }
    public static void main(String[] args) {
        Sub s2=new Sub();
    }
}
