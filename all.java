package arrays;
import java.util.*;

public class all {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size");
    int size=sc.nextInt();
    int []a=new int[size];
    System.out.println("The elements of array are");
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
        System.out.println(a[i]);
    }
    System.out.println("Reverse order is:");
    for(int i=a.length-1;i>=0;i--)
    {
        System.out.println(a[i]);
    }
        //Using Sort built-in function
    Arrays.sort(a);
    System.out.println("Ascending order is: ");
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
    System.out.println("Descending order is:");
    for(int i=a.length-1;i>=0;i--)
    {
        System.out.println(a[i]);
    }
    System.out.println("First largest number is " + a[a.length-1]);
    System.out.println("The Second largest is " + a[a.length-2]);
    System.out.println("First Smallest number is " + a[0]);
    System.out.println("Second Smallest number is " + a[1]);
    }
}
