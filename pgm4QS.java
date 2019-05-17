import java.util.*;
public class QS
{
    static int n;
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        n=in.nextInt();
        Random r=new Random();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=r.nextInt(5000);
        }
        a[n]=Integer.MAX_VALUE;
        System.out.println("Array before sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        long startTime=System.currentTimeMillis();
        QuickSort(a,0,n-1);
        long endTime=System.currentTimeMillis();
        long timeTaken=endTime-startTime;
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Time taken to sort"+n+"elements is"+timeTaken+"milli seconds");
    }
    public static void QuickSort(int a[],int low,int high)
    {
        if(low>=high)
            return;
        int s=partition(a,low,high);
        QuickSort(a,low,s-1);
        QuickSort(a,s+1,high);
    }
    public static int partition(int a[],int low,int high)
    {
        int i=low;
        int j=high+1;
        int key=a[low];
        while(i<=j)
        {
            do
            {
                i++;
            }while(key>=a[i]);
            do
            {
                j--;
            }while(key<a[j]);
            if(i<j)
            {
                int temp;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
}
