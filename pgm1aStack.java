import java.util.Scanner;
public class Stack
{
    int capacity=3;
    int arr[]=new int[capacity];
    int top=-1;
    public void push(int ele)
    {
        if(top<capacity-1)
        {
            top++;
            arr[top]=ele;
            System.out.println("Element"+ele+"is pushed to stack");
            printelements();
        }
        else
        {
            System.out.println("Stack overflow");
        }
    }
    public void pop()
    {
        if(top>=0)
        {
            top--;
            System.out.println("Pop done");
        }
        else
        {
            System.out.println("Stack underflow");
        }
    }
    public void printelements()
    {
        if(top>=0)
        {
            System.out.println("Elements in stack");
            for(int i=0;i<=top;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("You've no elements in your stack, Stack Underflow");
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stack st=new Stack();
        while(true)
        {
            System.out.println("Enter the choice -> 1:push 2:pop 3:display 4:exit");
            System.out.println("enter your choice");
            int num=in.nextInt();
            switch(num)
            {
                case 1:System.out.println("Enter the elements to be inserted");
                    int ele=in.nextInt();
                    st.push(ele);
                    break;
                case 2:st.pop();
                    break;
                case 3:st.printelements();
                    break;
                default:System.exit(0);
            }
        }
    }
}
