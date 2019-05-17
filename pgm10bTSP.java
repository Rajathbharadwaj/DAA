import java.util.*;
class travel
{
    public int v[][],mincost;
    public int visit[];
    public int n,total_cost;
    travel()
    {
        v=new int[10][10];
        visit=new int[10];
        total_cost=0;
    }
    public void getdata()
    {
        int i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of cities ");
        n=in.nextInt();
        System.out.println("Enter cost of matrix ");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
                v[i][j]=in.nextInt();
            visit[i]=0;
        }
    }
    public boolean setempty(int s[])
    {
        int i;
        for(i=1;i<=n;i++)
            if(s[i]==0)
                return false;
        return true;
    }
    int graph(int source,int s[])
    {
        int k,sum,least;
        if(setempty(s))
            return v[source][1];
        least=999;
        for(k=2;k<=n;k++)
        {
            if(s[k]==1)
                continue;
            s[k]=1;
            sum=v[source][k]+graph(k,s);
            if(sum<least)
            {
                least=sum;
            }
            s[k]=0;
        }
        return least;
    }
    int tsp_dp(int source,int v[])
    {
        int sum;
        v[source]=1;
        sum=graph(source,v);
        return sum;
    }
}
public class TSP
{
    public static void main(String args[])
    {
        travel tr=new travel();
        tr.getdata();
        tr.mincost=tr.tsp_dp(1,tr.visit);
        System.out.println("Minimum path "+tr.mincost);
    }
}
