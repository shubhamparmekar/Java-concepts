package arrays;
import java.util.Scanner;

public class arrSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size");
        int size=sc.nextInt();
        int []a=new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the value to be searched");
        int search=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(search==a[i])
            {
                System.out.println("Element found at position : "+ i );
                break;
            }
        }
    }
}
