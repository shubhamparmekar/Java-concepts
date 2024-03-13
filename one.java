package algos;
public class one {
    //constructor chaining using one object
    //create comstructors and pass this of the next datatype in the constrctor
   String name="Shubham";
    one()
    {
        this(10);
        System.out.println(name);
    }
    one(int a)
    {
        this('a');
        System.out.print("I am ");
    }
    one(char e)
    {
        this("Shubham");
        System.out.println("SKIT");
    }

    one(String name)
    {
        System.out.print("HII ");
    }
    public static void main(String[] args) {
        one o=new one();
    }
}
