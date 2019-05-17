import java.util.*;
class prims
{
    int pri(int a[][],int n,int source)
    {
        int s[]=new int[10];
        int d[]=new int[10];
        int i,j,u=0,v=0,min,sum=0;
        for(i=0;i<n;i++)
        {
            s[i]=0;
            d[i]=a[source][i];

        }
        s[source]=1;
        for(i=0;i<n-1;i++)
        {
            min=999;
            for(j=0;j<n;j++)
                if(s[j]==0)
                    if(d[j]<min)
                    {

                        min=d[j];
                        u=j;
                    }
            s[u]=1;
            sum=sum+d[u];
            for(v=0;v<n;v++)
                if(s[v]==0)
                    if(d[v]>a[u][v])
                        d[v]=a[u][v];


        }
        return sum;

    }
}



public class prm
{

    public static void main(String[]args)
    {
        int a[][]=new int[10][10],n,i,j,source,sum;
        prims p=new prims();
        System.out.println("enter number of nodes");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println("enter cost of adjacenhtgioy a matrix");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                a[i][j]=in.nextInt();
        System.out.println("enter the source node");
        source=in.nextInt();
        sum=p.pri(a,n,source);
        System.out.println("cost of min spanning tree= "+sum);
    }
}

