import java.util.Scanner;
import java.util.Arrays;
public class HC {
    private int V,pathCount;
    private int[]path;
    private int[][]graph;

    public void findHC(int[][]g)
    {
        V=g.length;
        path=new int[V];
        Arrays.fill(path,-1);
        graph=g;
        try{
            path[0]=0;
            pathCount=1;
            solve(0);
            System.out.println("no soln");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            display();
        }
    }

    public void solve(int vertex)throws Exception{
        if(graph[vertex][0]==1&&pathCount==V)
            throw new Exception("solutoin found");
        if(pathCount==V)
            return;
        for(int v=0;v<V;v++)
        {
            if(graph[vertex][v]==1){
                path[pathCount++]=v;
                graph[vertex][v]=0;
                graph[v][vertex]=0;
                if(!isPresent(v))
                    solve(v);
                graph[vertex][v]=1;
                graph[v][vertex]=1;
                path[--pathCount]=-1;
            }
        }}
    public boolean isPresent(int v){
        for(int i=0;i<pathCount-1;i++)
            if(path[i]==v)
                return true;
        return false;
    }

    public void display(){
        System.out.println("\n path");
        for(int i=0;i<=V;i++)
            System.out.println((path[i%V]+1)+"");
        System.out.println();
    }

    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("hamiltonian cycle for an undirected graph is");
        HC h=new HC();
        System.out.println("enter number of vertices");
        int V=scan.nextInt();
        System.out.println("enter matrix\n");
        int[][]graph=new int[V][V];
        for(int i=0;i<V;i++)
            for(int j=0;j<V;j++)
                graph[i][j]=scan.nextInt();
        h.findHC(graph);
        scan.close();
    }
}
