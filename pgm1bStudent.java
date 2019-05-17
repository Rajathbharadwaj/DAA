import java.util.*;
import java.io.*;

public class Student {
    public static void main (String s[])
    {
        int num;
        System.out.println("enter no of students");
        Scanner in =new Scanner(System.in);
        num=in.nextInt();
        Studentv stu[]=new Studentv[num];

        for(int i=0;i<num;i++)
        {
            stu[i]=new Studentv();
            System.out.println("enter the usn "+i);
            stu[i].usn=in.next();
            System.out.println("enter the name");
            stu[i].name=in.next();
            System.out.println("enter the ph no");
            stu[i].phno=in.nextInt();
            System.out.println("enter branch");
            stu[i].branch=in.next();
        }
        System.out.println(num+" students info");
        for(int i=0;i<stu.length;i++)
        {
            System.out.println(stu[i].usn+"-"+stu[i].name+"-"+stu[i].branch+"-"+stu[i].phno);
        }
    }
}
 class Studentv {
    String usn;
    int phno;
    String name,branch;


}


