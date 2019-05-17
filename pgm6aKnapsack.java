import java.util.*;
public class Knapsack
{
    static int max(int a,int b)
    {
        return(a>b?a:b);
    }
    static int Knapsack(int m,int wt[],int p[],int n)
    {
        int i,j;
        int[][] v=new int[n+2][m+1];
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=m;j++)
            {
                if(i==0||j==0)
                    v[i][j]=0;
                else if(wt[i-1]>j)
                    v[i][j]=v[i-1][j];
                else
                    v[i][j]=max(v[i-1][j],v[i-1][j-wt[i-1]]+p[i-1]);
            }
        }
        return v[n][m];
    }
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n=SC.nextInt();
        System.out.println("Enter the weight of items");
        int []wt=new int[n];
        for(int i=0;i<n;i++)
            wt[i]=SC.nextInt();
        System.out.println("Enter the profits");
        int []profit=new int[n];
        for(int i=0;i<n;i++)
            profit[i]=SC.nextInt();
        System.out.println("Enter the maximum capacity");
        int m=SC.nextInt();
        System.out.println("the maximum value that can be put in a Knapsack of capacity m is"+Knapsack(m,wt,profit,n));
    }
}
