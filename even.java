package algos;
public class even{
    //pattern for 0 made out of 0's and 1 madeout of 1's
public static void main(String[] args){
    int n=4;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j==1||i==1||j==n||i==n)
            {
                System.out.print("0 ");
            }
            else{
                System.out.print("  ");
            }
        }
        for(int j=1;j<=n;j++)
        {
            if(j==1)
            {
                System.out.print("  1");
            }
            else{
                System.out.print("   ");
            }
        }     System.out.println();  

     } 
}
}