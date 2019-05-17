import java.util.Scanner;
public class SumofSubsets
{
    int[] w;
    int[] x;
    int sum;
    int total=0;
    public void process()
    {
        getData();
        System.out.println("the subsets are");
        subset(0,1,total);
    }
    private void getData()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n=in.nextInt();
        w=new int[n+1];
        x=new int[n+1];
        System.out.println("enter"+n+"elements");
        for(int i=1;i<n+1;i++)
        {
            w[i]=in.nextInt();
            total=total+w[i];
        }
        System.out.println("enter sum to be obtained");
        sum=in.nextInt();
        if(total<sum)
        {
            System.out.println("no possible subsets");
            System.exit(1);

        }
    }
    private void subset(int s,int k,int r)
    {
        int i=0;
        x[k]=1;
        if(s+w[k]==sum)
        {
            System.out.print("    (");
            for(i=1;i<=k;i++)
            {
                if(x[i]==1)
                    System.out.print(" "+w[i]);
            }
            System.out.print(")     ");
        }
        else if((s+w[k]+w[k+1])<=sum)
        {
            subset(s+w[k],k+1,r-w[k]);
        }
        if((s+r-w[k])>=sum&&(s+w[k+1]<=sum))
        {
            x[k]=0;
            subset(s,k+1,r-w[k]);
        }
    }
    public static void main (String args[])
    {
        SumofSubsets ss=new SumofSubsets();
        ss.process();
    }
}
