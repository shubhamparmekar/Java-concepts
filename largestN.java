package algos;
import java.util.Scanner;

public class largestN {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size");
    int size=sc.nextInt();
    int []a=new int[size];
    System.out.println("Enter the elements of array");
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    int largest=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<largest)
        continue;
        else{
            largest=a[i];
        }
    }
    System.out.println("Largest number is " + largest);
}
}