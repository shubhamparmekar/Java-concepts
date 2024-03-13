package oops;
public class chain {
    //Constructor Chaining
    chain()
    {
        this(10);
        System.out.println("NAC");
    }
    chain(int n)
    {
        this('a');
        System.out.println("PC-1");
    }
    chain(char c)
    {
        System.out.println("PC-2");
    }
    public static void main(String[] args) {
        chain ch=new chain();
    }
}
