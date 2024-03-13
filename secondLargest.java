package algos;
import java.util.*;
public class secondLargest {
    public static void main(String[] args) {      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size");
    int size=sc.nextInt();
    int []a=new int[size];
    System.out.println("Enter the elements of array");
    for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        //Using Sort built-in function
    /*Arrays.sort(a);
    System.out.println("Sorted array is: ");
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
    System.out.println("The Second largest is " + a[size-2]); */
    int fl=a[0];
    int sl=a[1];
    if(sl>fl)
    {
        sl=a[0];
        fl=a[1];
    }
    for(int i=2;i<a.length;i++)
    {
        if(sl<a[i])
        {
            if(fl<a[i])
            {
                sl=fl;
                fl=a[i];
            }else sl=a[i];
        }
    }
    System.out.println("Second largest number is " + sl);
}
}
