package arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter " + i + "th number");
            a[i]=s.nextInt();
        }
        System.out.println("The Elements of Array are: ");

      for(int i=0;i<a.length;i++)
      {
        System.out.println(a[i]);
      }
    }
}
