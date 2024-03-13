package algos;
import java.util.Scanner;
//Function calling in main
public class even2 {
    public static void even(int n)
    {
        for(int i=0;i<=n;i++){
        if (i % 2 == 0)
        System.out.println(i);
    }
}
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        even(n);
}
}
