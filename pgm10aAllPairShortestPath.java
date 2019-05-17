import java.util.*;
class floyds
{
    public int min(int a,int b)
    {
        return (a<b?a:b);
    }
    public void shortestpath(int a[][],int n)
    {
        int i,j,k;
        for(k=1;k<=n;k++)
        {
            for(i=1;i<=n;i++)
                for(j=1;j<=n;j++)
                    a[i][j]=min(a[i][j],a[i][k]+a[k][j]);
        }
        System.out.println();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
public class AllPairShortestPath
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10],i,j,n;
        floyds f=new floyds();
        System.out.println("Enter the number of nodes in a graph ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("Enter the cost adjacent matrix ");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                a[i][j]=in.nextInt();
        System.out.println("The all pair shortest path matrix ix ");
        f.shortestpath(a,n);
    }
}
