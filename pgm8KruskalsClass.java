import java.util.*;
public class KruskalsClass
{

    static int n;
    static int cost[][];
    static Scanner scan=new Scanner(System.in);
    public static void main(String[]args)
    {
        ReadMatrix();
        Kruskals();
    }
    static void ReadMatrix()
    {
        int i,j;
        cost=new int[20][20];
        System.out.println("implementation of kruskals");
        System.out.println("enter number of vertices");
        n=scan.nextInt();
        System.out.println("enter the cost adjacency matrix");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                cost[i][j]=scan.nextInt();
                if(cost[i][j]==0)
                    cost[i][j]=999;

            }
        }
    }
    static void Kruskals()
    {
        int a=0,b=0,u=0,v=0,i,j,ne=1,min,mincost=0;
        int parent[]=new int[9];
        System.out.println("the edges of minimum cost spanning tree are");
        while(ne<n)
        {
            for(i=1,min=999;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(cost[i][j]<min)
                    {
                        min=cost[i][j];
                        a=u=i;
                        b=v=j;

                    }
                }
            }
            while(parent[u]>0)
                u=parent[u];

            while(parent[v]>0)
                v=parent[v];
            if(u!=v)
            {

                if(parent[u]<parent[v])
                {

                    parent[u]=parent[u]+parent[v];
                    parent[v]=u;
                }
                else
                {
                    parent[v]=parent[u]+parent[v];
                    parent[u]=v;
                }
                System.out.println(ne+" edge("+a+","+b+")= "+min);
                mincost +=min;

            }
            cost[a][b]=cost[b][a]=999;

        }
        System.out.println("minimum cost:"+mincost);
    }

}
