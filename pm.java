package algos;
//method overloading
public class pm {
    public static int addTwo(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
        return c;
    }
    public static int addThree(int a,int b, int c)
    {
        int d=a+b+c;
        System.out.println(d);
        return d;
    }
    public static void main(String[] args) {
        System.out.println("Main Method Begins");
        int Total=addTwo(10, 20)+addThree(10,20,9);
        System.out.println("Total = "+Total);
        System.out.println("Main Method Ends");
    }

}
