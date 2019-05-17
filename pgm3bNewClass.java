import java.util.*;

class Square implements Runnable
{
    public int x;
    public Square(int x)
    {
        this.x=x;
    }
    public void run()
    {
        System.out.println("square of"+x+"is"+x*x);
    }
}

public class NewClass
{
    public static void  main(String args[])
    {
        A a=new A();
        a.start();
    }
}

class cube implements Runnable
{
    public int x;
    public cube(int x)
    {
        this.x=x;
    }
    @Override
    public void run()
    {
        System.out.println("cube of "+x+"is"+x*x*x);
    }
}

class A extends Thread
{
    @Override
    public void run()
    {
        int num=0;

        Random r =new Random();
        try
        {
            for (int i=0;i<1;i++)
            {
                num=r.nextInt(100);
                System.out.println("Main Thread & generated number is "+num);
                System.out.println("----------");
                Thread t1=new Thread(new Square(num));
                t1.start();
                Thread t2=new Thread(new cube(num));
                t2.start();
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
} 