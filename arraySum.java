package arrays;
import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size");
    int size=sc.nextInt();
    int []a=new int[size];
    System.out.println("Enter the elements of array");
    for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        int sum=0;
    for(int i=0;i<a.length;i++)
    {
        sum=sum+a[i];
    }
    System.out.println("Sum of array is :" + sum);
    }
}
