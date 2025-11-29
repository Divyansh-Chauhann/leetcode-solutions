package Arrays;
import java.util.*;
class permutation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int flag=0;
            System.out.print("Enter the value of n:");
            int n=sc.nextInt();
            int ar[]=new int[n];
            int a=n-1;
            for(int j=n;j>=1;j=j-2)
            {
                ar[flag]=j;
                ar[a-flag]=j-1;
                flag++;
            }
            if(n%2!=0)
            {
                ar[((n+1)/2)-1]=1;
            }
            for(int k=0;k<n;k++)
            System.out.print(ar[k]+" ");
            System.out.println();
        }
    }
}