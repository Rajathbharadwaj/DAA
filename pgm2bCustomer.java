import java.util.*;
public class Customer
{
    public static void main(String arg[])
    {
        String date,name;
        String[] msg=new String[3];
        Scanner in= new Scanner(System.in);
        System.out.println("Eneter name");
        name=in.nextLine();
        System.out.println("Enter date in dd/mm/yy format only");
        date = in.next();
        StringTokenizer st=new StringTokenizer(date,"/");
        for(int i=0;st.hasMoreTokens();i++)
        {
            msg[i]=st.nextToken();

        }
        System.out.println("entered details are shown as <name,dd,mm,yy>");
        System.out.println("<"+name+","+msg[0]+","+msg[1]+","+msg[2]+">");

    }
}