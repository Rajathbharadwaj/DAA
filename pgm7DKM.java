import  java.util.*;

class dijiktra
{
    public static void diji(int a[][],int n,int source)
    {
        int s[]=new int [10];
        int d[]=new int[10];
        int i,j,u=0,v=0,min;

        for(i=1;i<=n;i++)
        {s[i]=0;
            d[i]=a[source][i];
        }
        s[source]=1;
        for(i=1;i<=n;i++)
        {
            min=999;
            for(j=1;j<=n;j++)
            {
                if(s[j]==0)
                    if(d[j]<min)
                    {min=d[j];
                        u=j;
                    }
            }
            s[u]=1;
            for(v=1;v<=n;v++)
                if(s[v]==0)
                    if(d[v]>d[u]+a[u][v])
                        d[v]=d[u]+a[u][v];
        }

        System.out.println("shortet distance source");
        for(i=1;i<=n;i++)
            System.out.println(source+"-->"+i+"=\t"+d[i]);
    }

}

public class DKM {
    public static void main(String [] args)
    {
        dijiktra di=new dijiktra();
        int a[][]=new int [10][10],n,i,j,source;
        System.out.println("enter number of nodes");
        Scanner in =new Scanner (System.in);
        n=in.nextInt();
        System.out.println("enter adjacency matrix");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                a[i][j]=in.nextInt();
        System.out.println("enter source node");
        source=in.nextInt();
        di.diji(a,n,source);
    }
}
