import java.util.*;
public class Divbzer {
    public static void main(String args[])
    {
        int a,b;
        System.out.println("Enter the value of a and b");

        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        try
        {
            int c=a/b;
            System.out.println("Value of C is"+c);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
